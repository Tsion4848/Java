package filewriter;

import java.io.*;
        
public class FileWriter {

    public FileWriter(String testtxt) throws IOException{
    }

    public static void main(String[] args) {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        System.out.println("insert whatever you want and stop to quit");        
              
        try{
            FileWriter ff = new FileWriter("C:\\Users\\hp\\Documents\\NetBeansProjects\\fileWriter\\fw.txt");
            
            do{
                str = bf.readLine();
                
                if(str.compareTo("stop") == 0)
                    break;
                
                str = str + "\n";
                System.out.println(str);
                ff.write(str);
                
            }while(str.compareTo("stop") != 0);
        }
        catch(IOException exc){
            System.out.println("io error" + exc);
        }
        
        //ff.close();
        
    }

    private void write(String str) {
        try{
            FileOutputStream out = new FileOutputStream("file.dat");
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeUTF(str);
        }
        catch(IOException exc){
            System.out.println("write error");
        }
    }

    
}
