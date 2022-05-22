package printwriterout;

import java.util.Scanner;
import java.io.*;

public class PrintWriterOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
//        try{
//            PrintWriter pw = new PrintWriter(new FileOutputStream("printwriter.txt"));
//            System.out.println("ineert your text");
//            do{
//                str = sc.nextLine();
//                pw.println(str);
//            }while (!str.equals("stop"));
//            
//            pw.flush();
//            pw.close();
//        }
//        catch(IOException exc){
//            System.out.println("error write " + exc.getMessage());
//        }
       
        String i;
        String reading;
        try{
            BufferedReader bf = new BufferedReader(new FileReader("printwriter.txt"));   
            reading = bf.readLine();
            while(reading != null){
                reading = bf.readLine();
                System.out.println(reading);
            }
            bf.close();
        }
        catch(IOException exc){
            System.out.println("read error " + exc.getMessage()); 
        }
        
    }
    
}
