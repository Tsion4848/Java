package simplesocketserver;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class SimpleSocketServer {

    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
               
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        boolean flag = true;
        
        while(flag){
        DataInputStream din = new DataInputStream(s.getInputStream());
        String str = din.readUTF();
        System.out.println("client: " + str);
        
        System.out.print("you(server): ");
        String input = sc.nextLine();
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(input);
        
        if (input.equals("stop"))
            flag = false;
        }
        System.out.println("chat ended");
    }
    
}
