package urlconnection;

import java.net.*;
import java.io.*;
import java.util.Date;

public class UrlConnection {

    public static void main(String[] args) throws Exception {
        
                URL hp = new URL("http://www.internic.net");
                URLConnection hpCon = hp.openConnection();
                
                long d = hpCon.getDate();
                if (d == 0){
                    System.out.println("no date information");
                }
                else{
                    System.out.println("Date: " + new Date(d));
                }
                
                System.out.println("Content Type: " + hpCon.getContentType());
                
                d = hpCon.getExpiration();
                if (d == 0){
                    System.out.println("no expiration information");
                }
                else{
                    System.out.println("Expiration: " + new Date(d));
                }
                
                d = hpCon.getLastModified();
                if (d == 0){
                    System.out.println("no last modified information");
                }
                else{
                    System.out.println("Last Modified: " + new Date(d));
                }
                
                long len = hpCon.getContentLengthLong();
                if (len == 0){
                    System.out.println("no content length information available");
                }
                else{
                    System.out.println("Content Length: " + len);
                }
                
                int c;
                if (len != 0){
                    InputStream in = hpCon.getInputStream();
                    while ((c = in.read()) != -1){
                        System.out.print((char) c);
                    }
                    in.close();
                }
                else{
                     System.out.println("no content available");
                }
                
    }
    
}
