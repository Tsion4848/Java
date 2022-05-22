package characterstream;

import java.io.*;

public class CharacterStream {

    public static void main(String[] args) throws IOException{
        
        char c;
        
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
//        
//        System.out.println("insert whatever you want and a period to quit");
//        
//        do{
//            c = (char) br.read();
//            System.out.println(c + " ");
//            
//        }while(c != '.');
//        
//        
        String str;
        
        System.out.println("insert set of sentences and stop to quit");
        
        do{
            str = br.readLine();
            System.out.println(str);
            System.out.println();
        }while(!str.equals("stop"));
        
        PrintWriter pw = new PrintWriter("printf.dat");
        //PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 23.5;
        
        pw.println("your numbers are: ");
        pw.println(i);
        pw.println(d);
        pw.println(i + "+" + d + "= " + (i+d));
        pw.printf("this is printf %s", "made by me");
        pw.println();
        pw.write("i am trying printf and printwriter");
        pw.flush();
        pw.format("this is printf %s", "made by me");
    }
    
}
