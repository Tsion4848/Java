package threadextend;

class ThreadDemo extends Thread{
    ThreadDemo(){
        super("Thread Demo");
        System.out.println("child thread: " + this);
    }
    public void run(){
        try{
            for (int i = 5 ; i > 0 ; i--){
                System.out.println("child thread: " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException exc){
            System.out.println("child interrupted");
        }
        System.out.println("exiting child thread");
    }
}
public class ThreadExtend {

    public static void main(String[] args) {
        
        ThreadDemo td = new ThreadDemo();
        td.start();
        
        try{
            for (int i = 5 ; i > 0 ; i--){
                System.out.println("main thread" + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException exc){
            System.out.println("main interrupted");
        }
        System.out.println("exiting main thread");        
    }
    
}
