package memorymappedfile;

import java.io.*;
import java.util.Scanner;
import java.nio.*;
import java.nio.channels.FileChannel;

public class MemoryMappedFile{

    public static void main(String[] args) throws IOException{
        
        try(RandomAccessFile ran = new RandomAccessFile("memory map.txt","rw")){
        Scanner sc = new Scanner(System.in);
        String a;
        
        System.out.println("enter character or string");
        a = sc.next();
        
        MappedByteBuffer out = ran.getChannel().map(FileChannel.MapMode.READ_WRITE, 0 ,10);
        
            for (int i = 0 ; i < 10 ; i++){
                System.out.println((out.put((byte)i)));
            }
            System.out.println("writing to memory is done");
            //reading

            for (int i = 0 ; i < 10 ; i++){
                System.out.println((char)out.get(i));
            }
        
            System.out.println("reading from memory is done");
        }
        catch(IOException exc){
            exc.printStackTrace();
        }
    }
    
}
