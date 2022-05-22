package networking2;

import java.net.*;
import java.io.*;

public class Networking2 {

    public static void main(String[] args) throws UnknownHostException, IOException {
       
        try(Socket s = new Socket("whois.internic.net", 43)){
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        
        String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
        byte [] buf = str.getBytes();
        
        out.write(buf);
        
        int i;
        
        while ((i = in.read()) != -1){
            System.out.print((char) i);
        }
        //s.close();
        }
        
    }
    
}
