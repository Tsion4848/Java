package dataiostream;

import java.io.*;

public class DataIOstream {

    public static void main(String[] args) {
        int i = 10;
        double d = 10.55;
        boolean b = true;
        String s = "this is me";
        char c[]=new char[20];
        
        try(DataOutputStream dout = new DataOutputStream (new FileOutputStream("testdata"))){
            
            System.out.println("writing " + i);
            dout.writeInt(i);
            
            System.out.println("writing " + d);
            dout.writeDouble(d);
            
            System.out.println("writing " + b);
            dout.writeBoolean(b);
            
            System.out.println("writing " + s);
            dout.writeChars(s);
            
        }
        catch(IOException exc){
            System.out.println("write error");
        }
        
        System.out.println();
        
        try(DataInputStream din = new DataInputStream (new FileInputStream("testdata"))){
            
            int i2 = din.readInt();
            System.out.println(i);
            
            double d2 = din.readDouble();
            System.out.println(d);
            
            boolean b2 = din.readBoolean();
            System.out.println(b);
            
            for (int j=0 ; j<s.length() ; j++)
            c[j] = din.readChar();
            
            for (int j=0 ; j<s.length() ; j++)
            System.out.print(c[j]);
            System.out.println();
            
        }
        
        catch(FileNotFoundException e){
            System.out.println("file not found exception");
        }
        catch(IOException exc){
            System.out.println("read error");
        }
    } 
}
