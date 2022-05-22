package randomaccessdemo;

import java.io.*;

public class RandomAccessDemo {

    public static void main(String[] args) {
        
        double data[] = {12.3 , 43.5 , 75.6 , 93.6 , 35.6};
        double d;
        
        try(RandomAccessFile raf = new RandomAccessFile("random.dat" , "rw")){
            
            for (int i = 0 ; i<data.length ; i++){
                raf.writeDouble(data[i]);
            }
            
            for (int i=0 ; i<data.length ; i++){
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.println(d);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        catch(IOException exc){
            System.out.println("io error" + exc);
        }
        
    }
    
}
