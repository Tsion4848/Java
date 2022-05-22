package writetofile;

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) throws IOException{
        
        FileOutputStream out = new FileOutputStream("myfile");;
        FileInputStream in = new FileInputStream("myfile");
        int i;
        byte str[] = new byte[50];
        
        System.out.println("insert your sentence");
        System.in.read(str);
                
        try{
            do{
               out.write(str);
            }while(str.equals(str.length));
            
            do{
                i = in.read();
                System.out.print((char) i);
            }while (i != -1);
        }
        catch(IOException exc){
            exc.getMessage();
        }
        
        try{
            in.close();
            out.close();
        }
        catch(IOException e){
            System.out.println("file not closed proprerly");
        }
                
               
    }
    
}
