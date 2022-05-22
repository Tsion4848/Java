package lambdaarithmetic;

import java.util.Scanner;
//
//interface sumation{
//    double sum(double a, double b);
//}
//interface difference{
//    double diff(double a, double b);    
//}
//interface product{
//     double prod(double a, double b);    
//}
//interface quotient{
//     double quot(double a, double b);    
//}

interface arith{
    double op(double a, double b);
}

public class LambdaArithmetic {

    public static void main(String[] args) {
 
        System.out.println("insert two numbers");
           Scanner sc = new Scanner(System.in);
           double num1 = sc.nextInt();
           double num2 = sc.nextInt();
//       
//    sumation s = (x, y)-> x + y;
//    System.out.println("the sum is: " + s.sum(num1, num2));
//    difference d = (x, y)->x - y;
//    System.out.println("the difference is: " + d.diff(num1, num2));
//    product p = (x, y)->x*y;
//    System.out.println("the product is: " + p.prod(num1, num2));
//    quotient q = (x, y)->{
//        if (y != 0){
//            return x / y;
//        }
//        return 0;
//    }; 
//    System.out.println("the quotient is: " + q.quot(num1, num2));
//    
    System.out.println("insert the operation");
    
    arith a = (x, y)->{
    char c = sc.next().charAt(0);
    double result = 0;
    switch(c){
        case '+': result = x + y;
        break;
        case '-': result =  x - y;
        break;
        case '*': result = x * y;
        break;
        case '/': 
            if (y != 0){
                result = x / y;
            }
            else
                System.out.println("division by 0 error");
        break;
        default: System.out.println("invalid operator");
            }
        return result;
        };
    System.out.println(a.op(num1, num2));
    }
    
}
