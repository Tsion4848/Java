package scannerout;

import java.io.*;
import java.util.Scanner;

public class ScannerOut {

    public static void main(String[] args) {
        
        try{
            //Scanner ss = new Scanner(System.in);
            Scanner sc = new Scanner(new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\PrintWriterOut\\printwriter.txt"));
            String str;
//            System.out.println("insert your text here and enter stop to stop");
//            do{
//                str = ss.nextLine();
//            }while (!str.equals("stop"));
            while (sc.hasNextLine()){
                str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();
            
        }
        catch(IOException exc){
            System.out.println("write error " + exc.getMessage());
        }
        
        
    }
    
}
