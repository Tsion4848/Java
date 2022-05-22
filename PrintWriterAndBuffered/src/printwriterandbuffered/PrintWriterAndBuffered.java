package printwriterandbuffered;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintWriterAndBuffered {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i;
        String str = "";
        String aa;
        System.out.println("insert the name of the file");
        String name = sc.next();
        
        try{
            PrintWriter pw = new PrintWriter("C:\\Users\\hp\\Desktop\\" + name + ".txt");
            System.out.println("insert your text");
            do{
                str = sc.nextLine();
                pw.println(str);
            }while (!str.equals("stop"));
            
            pw.flush();
            pw.close();
        }
        catch(IOException exc){
            System.out.println("write error " + exc.getMessage());
        }
        
//        try{
//        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\" + name + ".txt"));
//        
//        System.out.println("your text is: ");
//        
//        while ((i = bf.read()) != -1){
//            System.out.print((char) i);
//        }
//        bf.close();
//        
//        } 
//        catch (IOException exc) {
//            System.out.println("read error " + exc.getMessage());
//        }
        
//        try{        
//        Scanner re = new Scanner(new File("C:\\Users\\hp\\Desktop\\" + name + ".txt"));
//            String ss;
//            System.out.println("your text is: ");
//            
//            while (re.hasNextLine()){
//                aa = re.nextLine();
//                System.out.println(aa);
//            }
//            re.close();
//        }
//        catch(IOException exc){
//            System.out.println("read error " + exc.getMessage());
//        }
    }
    
}
