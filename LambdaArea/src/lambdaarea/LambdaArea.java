package lambdaarea;

import java.util.Scanner;

interface areaRect{
    double rect(double l, double w);
}
interface areaCirc{
    double circ(double rad);
}
interface areaSq{
    double sq(double side);
}
interface areaCube{
    double cu(double side);
}
interface square{
    double s(double x);
}
interface cube{
    double c(double x);
}
interface sqc{
    double calc(double x);
}
public class LambdaArea {

    public static void main(String[] args) {
        System.out.println("insert the length and width of the rectangle");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
//        area ar = (x, y){
//            System.out.println("insert 1 for rectangle and 2 for cirle");
//            int d = sc.nextInt();
//            double result = 0;
//            switch(d){
//                case 1: result = x*y;
//                break;
//                case 2: result = 3.14 *
//            }
//        }
        
        areaRect ar = (len , wid)->len * wid;
        System.out.println("the area of the rectangle is: " + ar.rect(num1, num2));
        
        areaCirc ac = (r)->3.14 * r * r;
        System.out.println("insert the radius of the circle");
        double rad = sc.nextDouble();
        System.out.println("the area of the circleis: " + ac.circ(rad));
//       
//        areaSq as = (s)->s*s;
//        System.out.println("insert the length of the square");
//        double side = sc.nextDouble();
//        System.out.println("the area of the square is: " + as.sq(side));
//        
//        areaCube aq = (s)->6 * s * s;
//        System.out.println("insert the length of one side of the cube");
//        double si = sc.nextDouble();
//        System.out.println("the area of the cube is: " + aq.cu(si));
//                
              

        sqc val = (x)->{
        System.out.println("choose 1 for square and 2 for cube");
        int f = sc.nextInt();
        double result =0;
        switch(f){
            case 1: result = x * x;
            break;
            case 2: result = x * x * x;
            break;
            default: System.out.println("undefined");
        }
        return result;
        };
        System.out.println("insert the number to be squared or cubed");
        double num = sc.nextDouble();
        System.out.println("result: " + val.calc(num));
//
//        System.out.println("insert the number to be squared");
//        double num = sc.nextDouble();
//        System.out.println("insert the square of the number is: " + squ.s(num));
//        
//        cube c = (x)->x * x * x;
//        System.out.println("insert the number to be cubed");
//        double sid = sc.nextDouble();
//        System.out.println("the cube of the number is: " + c.c(sid));
    }
    
}
