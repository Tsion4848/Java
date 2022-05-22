package threadsynchronizedstatement;

class Callme{
    
    void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException exc){
            System.out.println("interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    
    Caller(Callme target, String msg){
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
    }
    
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}

public class ThreadSynchronizedStatement {

    public static void main(String[] args) {
        
         Callme c = new Callme();
        
        Caller c1 = new Caller(c, "Hello");
        Caller c2 = new Caller(c, "Synchronized");
        Caller c3 = new Caller(c, "World");
        
        c1.t.start();
        c2.t.start();
        c3.t.start();
        
        try{
            c1.t.join();
            c2.t.join();
            c3.t.join();
        }
        catch (InterruptedException exc){
            System.out.println("interrupted");
        }                
    }
    
}
