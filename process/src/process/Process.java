package process;

import java.io.*;
import java.lang.*;

public class Process {

    public static void main(String[] args) {
       /* 
        try{
        ProcessBuilder pb = new ProcessBuilder("notepad.exe");
        //ProcessBuilder pb = new ProcessBuilder("open", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.app");
        pb.start();
        Process pro;
        
        System.out.println("waiting");
        Thread.sleep(10000);
        
        //pro.destroy();
        
        System.out.println("process destroyed");
        //System.out.println("exit value: " + pro.exitValue);
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
*/
     
           Runtime r = Runtime.getRuntime();
           Process p = null;
           
           try{
               p = r.exec("notepad");
           }
           catch(Exception exc){
               System.out.println("Error executing notepad.");
           }
       
       
    }
    
}
