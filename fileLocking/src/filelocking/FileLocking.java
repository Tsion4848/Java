package filelocking;

import java.io.*;
import java.nio.channels.*;

public class FileLocking {

    public static void main(String[] args) throws IOException{
        
        FileOutputStream out = new FileOutputStream("fileLocking");
        
        FileLock l = out.getChannel().tryLock();
        
        if(l != null){
        System.out.println("the file is locked");
        l.release();
        System.out.println("the file is released");
        }
        else{
            System.out.println("the file is not locked");
        }
        out.close();
    }
    
}
