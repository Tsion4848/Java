package stringlambdas;

interface StringFunc{
    String strFunc(String str);
}
interface MyFunc {
 int func(int n);
}
public class StringLambdas {

    public static void main(String[] args) {
     
        StringFunc s1 , s2 , s3;
        
        String str = "my name is Tsion Moges";
        
//        s1 = (s) -> {
//            String result = "";
//            for(int i = s.length()-1 ; i >= 0 ; i--){
//                result+= s.charAt(i);
//            }
//            return result;
//        };
//        System.out.println("the converted reverse string is: " + s1.strFunc(str));
//        
        //char[] c={'t','h','i','s',' ','i','s',' ','t','h','e',' ','c','h','a','r','a','c','t','e','r',' ','t','e','s','t'};
        
//        s2 = (c) -> {
//            String result = "";
//            for (int i=0 ; i<c.length() ; i++){
//                if((int)c[i] >= 97 || (int)c[i] <= 122){
//                    
//                }
//            }
//        }

        s2 = (c) -> {
            String result="";
            char ch;
            
            for (int i = 0 ; i < c.length() ; i++){
                ch= c.charAt(i);
                if (Character.isLowerCase(ch))
                    result+=Character.toUpperCase(ch);
                if (Character.isUpperCase(ch))
                    result+=Character.toLowerCase(ch);
                }
            return result;
        };
        System.out.println("the converted case string is: " + s2.strFunc(str));
       
        s3 = (sp) ->           
                 sp.replace(' ', '-');
           
        System.out.println("the converted spaces string is: " + s3.strFunc(str));
    
        
        final int num = 10;
 MyFunc myLambda = (n) -> {
 // This use of num is OK. It does not modify num.
 int v = num + n;
 
 //num++;
 return v;
 };
 // Use the lambda. This will display 18.
 System.out.println(myLambda.func(8));
 // The following line would also cause an error, because
 // it would remove the effectively final status from num.
//num = 9;
        
    }
    
}
