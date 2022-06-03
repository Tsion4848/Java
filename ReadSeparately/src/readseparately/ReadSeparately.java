package readseparately;

import java.io.*;
import java.util.Scanner;

public class ReadSeparately {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        int i = 6;
//        Double d = 23.4;
//        char c = 'A';
//        String str = "this is java";
//        boolean b = true;
//        
//        try (DataOutputStream objout = new DataOutputStream(new FileOutputStream("primitives.dat"))){
//            System.out.println("writing " + i);
//            objout.writeInt(i);
//            System.out.println("writing " + d);
//            objout.writeDouble(d);
//            System.out.println("writing " + d);
//            objout.writeChar((int) c);
//            System.out.println("writing " + c);
//            objout.writeUTF(str);
//            System.out.println("writing " + str);
//            objout.writeBoolean(b);
//            System.out.println("writing " + b);
//            }
//        catch (IOException exc){
//            System.out.println("write error " + exc.getMessage());
//        }
//            System.out.println();        
//        
//        try (DataInputStream objin = new DataInputStream(new FileInputStream("primitives.dat"))){
//        int x;
//        i = objin.readInt();
//        System.out.println("the integer is: " + i);
//        d = objin.readDouble();
//        System.out.println("the double is: " + d);
//        c = objin.readChar();
//        System.out.println("the character is: " + c);
//        str = objin.readUTF();
//        System.out.println("the string is: " + str);
//        b = objin.readBoolean();
//        System.out.println("the boolean value is: " + b);
//        
//        }
//        catch (IOException exc){
//            System.out.println("read error " + exc.getMessage());
//        }

        FileInputStream fin;
        DataInputStream in;
        int i;
        String str;
        System.out.println("insert the name of the file you want to check");
        String name = sc.nextLine();
       try{
            fin = new FileInputStream("C:\\Users\\hp\\Desktop\\" + name + ".dat");
            in = new DataInputStream(fin);
            
             while((i = fin.read()) != -1){
//                 str = fin.r
//                 
//                 for (int i = 0 ; i < str.)
//                 
                 
                 
//                 if (i == 10){
//                     System.out.println();
//                 }
//                 System.out.print((char) i);

                 }
       }
       catch(IOException exc){
           System.out.println("read error " + exc.getMessage());
       }

    }
    
}
