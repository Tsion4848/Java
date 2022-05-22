package fileoutputstreambinary;

import java.io.*;
import java.util.Scanner;

public class FileOutputstreamBinary {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream out;
        FileOutputStream fout;
        FileInputStream fin;
        DataInputStream in;
        int i;
        String str = "";
        String aa;
        System.out.println("insert the name of the file");
        String name = sc.next();
        
        try{            
            fout = new FileOutputStream("C:\\Users\\hp\\Desktop\\" + name + ".dat", true);
            out = new ObjectOutputStream(fout);
            
            System.out.println("insert your id, name and other information you want separated by space and enter stop to stop");
            do{
            str = sc.nextLine();
            out.writeUTF(str + "\n");
            }while (!str.equals("stop"));
            
            out.close();
        }
        catch(IOException exc){
            System.out.println("write error " + exc.getMessage());
        }

        try{
            fin = new FileInputStream("C:\\Users\\hp\\Desktop\\" + name + ".dat");
            in = new DataInputStream(fin);
            
             while((i = fin.read()) != -1){
                 if (i == 10){
                     System.out.println();
                 }
                 System.out.print((char) i);
                 }

//            do{
//            str+= in.readUTF();
//            System.out.println(str);
//            }while (str.compareTo("stop") == 0);
//            
//            
            in.close();
        }
        catch(IOException exc){
            System.out.println("read error" + exc.getMessage());
        }
    }
}
