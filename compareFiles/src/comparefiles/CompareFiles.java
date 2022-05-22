package comparefiles;

import java.io.*;

public class CompareFiles {

    public static void main(String[] args) {
        
        int i = 0 , j = 0;
        
        try(FileInputStream f1 = new FileInputStream("f1.txt") ; FileInputStream f2 = new FileInputStream("C:\\Users\\hp\\Documents\\NetBeansProjects\\java.txt")){
            
            do{
            i = f1.read();
            j = f2.read();
            
            if (i !=j)
                break; 
            
            }while(i != -1 && j != -1);
           // Console console = System.console();System.out.println(console);
            if (i != j){
                System.out.println("the files are not the same");
            }
            else
                System.out.println("the files are the same");
            
            
        } 
        catch(FileNotFoundException exc){
            System.out.println("file not found");
        }
        catch(IOException e){
            System.out.println("io exception");
        }
        
    }
    
}
