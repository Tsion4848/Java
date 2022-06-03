package threaddeadlock;

class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException exc){
            System.out.println("A interrupted");
        }
        System.out.println(name + " trying to call B.last");
        b.last();
    }
        
        synchronized void last(){
            System.out.println("inside A.last");
        }
}

class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException exc){
            System.out.println("B interrupted");
        }
        System.out.println(name + " trying to call A.last");
        a.last();
    }
    
    synchronized void last(){
        System.out.println("inside B.last");
    }
}

class DeadLock implements Runnable{
    A a = new A();
    B b = new B();
    Thread t;
    
    DeadLock(){
        Thread.currentThread().setName("Main Thread");
        t = new Thread(this, "Racing Thread");
    }
    
    void deadLockStart(){
        t.start();
        a.foo(b);
        System.out.println("back in the main thread");
    }
    
    public void run(){
        b.bar(a);
        System.out.println("back in the other thread");
    }
}

public class ThreadDeadLock {
    public static void main(String[] args) {
      
        DeadLock dl = new DeadLock();
        dl.deadLockStart();
        
    }
    
}
