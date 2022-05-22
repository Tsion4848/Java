package networking1;

import java.net.*;

public class Networking1 {

    public static void main(String[] args) throws UnknownHostException {
        
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        
        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);
        
        InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
        for (int i = 0 ; i < sw.length ; i++){
            System.out.println(sw[i]);
        }
        
    }
    
}
