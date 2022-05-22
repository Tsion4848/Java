package httpclientdemo;

import java.net.*;
import sun.net.http.*;
import java.util.*;
import java.io.*;

public class HttpClientDemo{

    public static void main(String[] args) throws IOException {
        
        HttpClient hc = HttpClient.newHttpClient();
        
        HttpRequest myReq = HttpRequest.newBuilder(new URI("http://www.google.com/").build());
        
        HttpResponse<InputStream> myResp = hc.send(myReq, HttpResponse.BodyHandler.ofInputStream());
        
        System.out.println("Response code is " + myResp.statusCode());
        System.out.println("Request method is " + myReq.method());
        
        HttpHeaders hdrs = myResp.headers();
        Map<String, List<String>> hdrMap = hdrs.map();
        Set<String> hdrField = hdrMap.keySet();
        
        System.out.println("here is the header: ");
        
        for (String k : hdrField){
            System.out.println("key: " + k + " value: " + hdrMap.get(k));
        }
        
        System.out.println("here is the body: ");
        InputStream input = myResp.body();
        int c;
        while ((c = input.read()) != -1){
            System.out.print((char) c);
        }
        
    }
    
}
