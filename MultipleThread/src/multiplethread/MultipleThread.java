package multiplethread;

class NewThread implements Runnable{
    String name;
    Thread t;
    
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread" + t);
    }
    
    public void run(){
        try{
            for (int i = 5 ; i > 0 ; i--){
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exc){
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }
}

public class MultipleThread {

    public static void main(String[] args) {
        
        NewThread n1 = new NewThread("One");
        NewThread n2 = new NewThread("Two");
        NewThread n3 = new NewThread("Three");
        
        n1.t.start();
        n2.t.start();
        n3.t.start();
        
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException exc){
            System.out.println("main interrupted");
        }
        System.out.println("main thread exiting");
    }
    
}
