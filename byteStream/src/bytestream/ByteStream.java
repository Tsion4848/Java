package bytestream;

import java.io.*;

public class ByteStream {

    public static void main(String[] args) throws IOException{
        
        int i;
        byte str[] = new byte[50];
        System.out.println("insert something");
        System.in.read(str);
        
        FileOutputStream fout = new FileOutputStream("bytetest",true);
        FileInputStream fin = new FileInputStream("bytetest");
        
//        try{
//            fout.write(str);            
//        }
//        catch(IOException exc){
//            System.out.println("write error");
//        }
        
        System.out.print("your string is ");
        try{
            do{                
                fout.write(str); 
                
            }while(str.equals(str.length));
            
            do{
            i = fin.read();
            System.out.print((char) i);
            }while(i != -1);
        }
        catch(IOException exc){
            System.out.println("read error");
        }
        
        try{
            fin.close();
            fout.close();
        }
        catch(IOException exc){
            System.out.println("error closing file");
        }
        
        //byte str[] = new byte[10];
//        System.out.println("insert some characters");
//        System.in.read(str);
//        System.out.println("your characters are: ");
//        for (int i=0 ; i<str.length ; i++){
//            System.out.print((char) str[i]);
//        }
//        
//        System.out.write(str);
//
//    int i;
//    FileInputStream fin = null;
//    
//    if (args.length !=1){
//        System.out.println("usage: showfile file");
//        return;
//    }
//    
//    try(FileOutputStream fout = new FileOutputStream("java")){
//        System.out.println("insert anything");
//        fout.write(str);
//    }
//    catch(IOException exc){
//        System.out.println("write error");
//    }
//    
//    try{
//        fin = new FileInputStream("java");
//    }
//    catch(FileNotFoundException exc){
//        System.out.println("File not found");
//        return;
//    }
//    
//    try{
//        do{
//            i = fin.read();
//            if (i != -1){
//                System.out.print((char) i);
//            }
//        }while(i != -1);
//    }catch(IOException exc){
//        System.out.println("error reading file");
//    }
//    
//    try{
//        fin.close();
//    }
//    catch(IOException exc){
//        System.out.println("error closing file");
//    }
//    
//        
    }
    
}
