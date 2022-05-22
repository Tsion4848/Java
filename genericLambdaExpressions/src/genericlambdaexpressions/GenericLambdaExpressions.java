package genericlambdaexpressions;

interface SomeTest<T>{
    boolean test(T m , T n);
}

public class GenericLambdaExpressions {

    public static void main(String[] args) {
        
        SomeTest<Integer> isFactor = (a,b) -> (a%b) == 0;
        if (isFactor.test(4,7)){
            System.out.println("true");
        }
        else
            System.out.println("false");
        
        String str = "my name is Tsion Moges";
        SomeTest<String> isFound = (a,b) -> a.indexOf(b) != -1;
        if (isFound.test(str, "name is"))
            System.out.println("found");
        else
            System.out.println("not found");
    }
    
}
