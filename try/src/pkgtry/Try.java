package pkgtry;

public class Try {
    
    static {
        System.loadLibrary("java_C");
    }    
    private native int fntest();
    public static void main(String[] args) {
        
        try{
            
            System.out.println("java test");
            
            int junk = new Try().fntest();
            
            System.out.println("java test " + junk);
        }
        catch (Exception exc){
            System.out.println(exc);
        }
        
    }
    
}
 