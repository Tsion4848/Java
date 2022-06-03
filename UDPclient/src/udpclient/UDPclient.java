package udpclient;

import java.io.*;
import java.net.*;

public class UDPclient {

    public static void main(String[] args) throws Exception{
        
        DatagramSocket soc = new DatagramSocket();
        InetAddress add = InetAddress.getByName("localhost");
        String str = "This is client UDP";
        byte [] buf = str.getBytes();
        DatagramPacket pac = new DatagramPacket(buf, buf.length, add, 3000);
        soc.send(pac);
        soc.close();
    }
    
}
