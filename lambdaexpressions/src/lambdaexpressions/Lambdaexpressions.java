package lambdaexpressions;

interface NumericTest{
    boolean test(int x , int y);
}

interface StringTest{
    boolean test(String a, String b);
}

interface SmFactor{
    int factor(int x);
}
public class Lambdaexpressions {

    public static void main(String[] args) {
        NumericTest t1, t2, t3;
        
        t1 = (a , b) -> (a % b) == 0;
        if (t1.test(6,4)){
            System.out.println("is divisible");
        }
        else{
            System.out.println("not divisible");
        }
        
        t2 = (a, b) -> (a<b);
        if (t2.test(8,7)){
            System.out.println("true");
        }
        else
            System.out.println("false");
        
        t3 = (a, b) -> (a<0? -a:a) == (b<0? -b:b);
        
        if (t3.test(4, 4)){
            System.out.println(true);
        }
        
        StringTest st1 , st2;
        
        st1 = (a , b) -> a.indexOf(b) != -1;
        
        String str = "my name is Tsion Moges";
        if (st1.test(str, "is T")){
            System.out.println("the string is found");
        }
        else
            System.out.println("the string is not found");
        
        if (st1.test(str, "fhgb")){
            System.out.println("the string is found");
        }
        else
            System.out.println("the string is not found");
        
        if (st1.test(str, "name is")){
            System.out.println("the string is found");
        }
        else
            System.out.println("the string is not found");
        
        int x = 39;
        
        SmFactor sm;
        sm = (c) -> {
            int i;
            for (i=2; i<=x; i++){
            if (x%i == 0){
                //System.out.println(i);
                break;
            }
        }
            return i;
        };
        
        System.out.println(sm.factor(39));
        
        System.out.println((int)'a');
        
        
    }
    
}
