package threadwaitnotify;

class Q {
    int n;
    boolean valueSet = false;
    
    synchronized int get(){
        while (!valueSet){
            try{
                wait();
            }
            catch (InterruptedException exc){
                System.out.println("interrupt occured");
            }
        }
            System.out.println("got: " + n);
            valueSet = false;
            notify();
            return n;
        }
    
    synchronized void put(int n){
        while (!valueSet){
            try{
                wait();                
            }
            catch (InterruptedException exc){
                System.out.println("interrupt occured");
            }
        }
        this.n = n;
        valueSet = false;
        System.out.println("put: " + n);
        notify();
    }
}

class Producer implements Runnable{
    Thread t;
    Q q;
    
    Producer(Q q){
        this.q = q;
        t = new Thread(this, "producer");
    }
    
    public void run(){
        int i = 0;
        
        while (true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Thread t;
    
    Consumer(Q q){
        this.q = q;
        t = new Thread(this, "consumer");
    }
        public void run(){
            while (true){
                q.get();
            }
        }
    }

public class ThreadWaitNotify {

    public static void main(String[] args) {
        
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        
        p.t.start();
        c.t.start();
        
        System.out.println("press ctrl-c to stop");        
    }    
}
