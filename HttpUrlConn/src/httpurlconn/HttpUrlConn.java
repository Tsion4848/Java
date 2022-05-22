package httpurlconn;

import java.net.*;
import java.io.*;
import java.util.*;

public class HttpUrlConn {

    public static void main(String[] args) throws Exception {
        
        URL hp = new URL("http://www.youtube.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        
        System.out.println("Request Method: " + hpCon.getRequestMethod());
        System.out.println("Response Code: " + hpCon.getResponseCode() );
        System.out.println("Response Message: " + hpCon.getResponseMessage());
        
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        
        System.out.println("Here is the header:");
        
        for (String k : hdrField){
            System.out.println("key: " + k + " value: " + hdrMap.get(k));
        }
        
    }
    
}
