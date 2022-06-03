package threadsuspendresume;

class NewThread implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;
    
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("new thread " + t);
        suspendFlag = false;
    }
    
    public void run(){
        try{
            for (int i = 15 ; i > 0 ; i--){
                System.out.println(name + " : " + i);
                Thread.sleep(15);
                synchronized(this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }
        catch(InterruptedException exc){
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }
    
    synchronized void mySuspend(){
        suspendFlag = true;
    }
    
    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}

public class ThreadSuspendResume {
    public static void main(String[] args) {

        NewThread t1 = new NewThread("one");
        NewThread t2 = new NewThread("two");
        
        t1.t.start();
        t2.t.start();
        
        try{
            Thread.sleep(1000);
            t1.mySuspend();
            System.out.println("suspending thread one");
            Thread.sleep(1000);
            t1.myResume();
            System.out.println("resuming thread one");
            Thread.sleep(1000);
            t2.mySuspend();
            System.out.println("suspending thread two");
            Thread.sleep(1000);
            t2.myResume();
            System.out.println("resuming thread two");
        }
        catch(InterruptedException exc){
            System.out.println("main thread interrupted");
        }
        
        try{
            System.out.println("waiting threads to finish");
            t1.t.join();
            t2.t.join();
        }
        catch(InterruptedException exc){
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting");

    }

}
