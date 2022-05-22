package thread2;

class ThreadDemo implements Runnable{
    Thread t;
    
    ThreadDemo(){
        t = new Thread(this, "demo thread");
        System.out.println("Child thread: " + t);
    }
    
    public void run(){
        try{
        for (int i = 5 ; i > 0 ; i--){
            System.out.println("main thread: " + i);
            Thread.sleep(500);
            }
        }
        catch(InterruptedException exc){
            System.out.println("child interrupted");
            }
        System.out.println("child thread exiting");
        }
    
}


public class Thread2 {

    public static void main(String[] args) {
        
        ThreadDemo td = new ThreadDemo();
        td.t.start();
        
        try{
        for (int i = 5 ; i > 0 ; i--){
            System.out.println("main thread" + i);
            Thread.sleep(1000);
        }
        }
        catch (InterruptedException exc){
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting");
        
    }
    
}
