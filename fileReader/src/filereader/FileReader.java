package filereader;

import java.io.*;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
//       
//        String s;
//        
//        try (BufferedReader br = new BufferedReader(System.in)){
//            
//        }
//        catch(IOException exc){
//                System.out.println("io exception" + exc);
//                }

//    char str[]= new char[30];
//    
//    int i = 0;
//    
//    while (str[i] != '\0'){
//        if (str[i] >= 'A' || str[i] <= 'Z'){
//            str[i] = str[i] + "13";
//        }
//    }

Scanner sc = new Scanner(System.in);
System.out.println("insert a number");
int n = sc.nextInt();
    int i;
        int rem;

        while (n < 10)
        {
                System.out.print(n);
        }

        i = 0;
        rem = 0;

        while (n > 10)
        {
                i = n / 10;
                rem = n % 10;
                n = n/10;

                System.out.print(i);
        }
        System.out.print(rem);

    }
    
}
