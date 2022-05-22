package parsing;

import java.io.*;

interface MyValue{
    double getVal();
}
public class Parsing {

    public static void main(String[] args) throws IOException{
//       
//        String str;
//        int n;
//        double sum=0.0;
//        double t , avg;
//        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        
//        System.out.println("how many numbers do you want to insert");
//        str = br.readLine();
//       
//        try{
//            n = Integer.parseInt(str);
//        }
//        catch(NumberFormatException exc){
//            System.out.println("invalid format");
//            n=0;
//        }
//        System.out.println("insert " + n + " values");
//        
//        for (int i=0 ; i<n ; i++){
//            str = br.readLine();
//            
//            try{
//                t = Double.parseDouble(str);
//            }
//            catch(NumberFormatException exc){
//                System.out.println("invaid format");
//                t = 0.0;
//            }
//            
//            sum+=t;
//        }
//        
//        avg = sum/n;
//        System.out.println("the average value is " + avg);

//lambda expressions
MyValue val;

val = () -> 9.8;
System.out.println(val.getVal());
    }
    
}
