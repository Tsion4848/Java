package copyfile;

import java.io.*;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert the name of the file you want to copy");
        String name = sc.next();
        String str = "";
        
        try{
            Scanner re = new Scanner("C:\\Users\\hp\\Desktop\\" + name + ".txt");
            PrintWriter pw = new PrintWriter("C:\\Users\\hp\\Documents\\" + name + ".txt");
            
            int i;
            FileInputStream fin = new FileInputStream("C:\\Users\\hp\\Desktop\\" + name + ".txt");
            while((i = fin.read()) != -1){
                 pw.write((char) i);
                 }
//            while (re.hasNext()){
//                str = re.nextLine();
//                pw.println(str);
//            }
            fin.close();
            pw.close();
        }
        catch (IOException exc){
            System.out.println(exc.getMessage());
        }
        
        
    }
    
}
