package readcharacters;

import java.io.*;

public class ReadCharacters {

    public static void main(String[] args) throws IOException{
        
        Console con = System.console();
        char c;
        
//        if (con == null){
//            return;
//        }
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//reading characters
/*
        System.out.println("enter characters and q to quit");
        
        do{
            c = (char) br.read();
            System.out.print(c);
        }while (c != 'q');
*/  


//reading strings
/*
        System.out.println("enter strings and stop to quit");
        String str = "";
        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
*/   

//simple text editor
/*
        System.out.println("enter your strings per line");
        
        String [] str = new String[100];
        for (int i = 0 ; i < 100 ; i++){
            str[i] = br.readLine();
            
            if (str[i].equals("stop"))
                break;
        }
        
        System.out.println("your string is: ");
        for (int i = 0 ; i < 100 ; i++){
            if (str[i].equals("stop"))
                break;
            
            System.out.println(str[i]);
        }
*/

//writing to the console
        
        int b = 'A';
        System.out.write(b);
        System.out.write('\n');
        
    }
    
}
