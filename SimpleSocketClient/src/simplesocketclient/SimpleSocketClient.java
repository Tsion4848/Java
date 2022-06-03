package simplesocketclient;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class SimpleSocketClient {

    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost", 3000);
        Scanner sc = new Scanner(System.in);
        
        boolean flag = true;
        while (flag){
        System.out.print("you(client): ");
        String input = sc.nextLine();
        
                
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(input);
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        String str = din.readUTF();
        System.out.println("server: " + str);
        
        if (input.equals("stop")){
            flag = false;
        }
        }
        System.out.println("chat ended");
        
    }
   
}