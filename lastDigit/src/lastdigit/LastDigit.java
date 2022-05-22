package lastdigit;

import java.util.Scanner;

class LastDig{
    
    int last(int x){
        
        int rem;
        //while(x != 0){
            
            rem = x%10;
            
            //x=x/10;
       
        return rem;
    }
}

class Ntimes {
    
    void table(int x){
        int result;
        for (int i=0 ; i<=x ; i++){
            for (int j=0 ; j<=i ; j++){
                System.out.print(j + "x" + i + "=" + i*j + "   ");
            }
            System.out.println();
        }
    }
}

public class LastDigit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int l;
        boolean cont=true;
        /*
        LastDig dig = new LastDig();
               
        while(cont){
        System.out.println("insert a number");
        l=sc.nextInt();
        System.out.println("the last digit is: " + dig.last(l));
        
        System.out.println("do you want to try again?(0/1)");
        int resp=sc.nextInt();
        
        if (resp == 0)
            cont=false;
        }
        */
        
        Ntimes tab=new Ntimes();
                        
        while(cont){
        System.out.println("insert a number");
        l=sc.nextInt();
        tab.table(l);
        
        System.out.println("do you want to try again?(0/1)");
        int resp=sc.nextInt();
        
        if (resp == 0)
            cont=false;
        }
    }
    
}
