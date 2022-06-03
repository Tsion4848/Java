package udpserver;

import java.io.*;
import java.net.*;

public class UDPserver {

    public static void main(String[] args) throws Exception{
        
        DatagramSocket soc = new DatagramSocket(3000);
        byte [] buf = new byte[256];
        DatagramPacket pac = new DatagramPacket(buf, buf.length);
        soc.receive(pac);
        String response = new String(pac.getData());
        System.out.println("Response Data: " + response);
        soc.close();
    }
    
}
