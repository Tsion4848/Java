package lambdalab;

import java.util.Scanner;

interface Status{
    String stat(double gpa);
}
interface calcGPA{
    double gp(double score[],double creditHr, double totGpa);
}

public class LambdaLab {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("references");
        System.out.println("score       Gradepoint");
        System.out.println(">=85        A or A+");
        System.out.println("80-85       A-");
        System.out.println("75-80       B+");
        System.out.println("70-75       B");
        System.out.println("65-70       B-");
        System.out.println("60-65       C+");
        System.out.println("55-60       C");
        System.out.println("50-55       C-");
        System.out.println("40-50       D");
        System.out.println("<40         F");
        System.out.println();        
        
        System.out.println("insert the number of courses");
        int n = sc.nextInt();
                
        String [] str = new String[n];
        int [] hr = new int [n];
        double [] gpa = new double[n];
        //char [] grade = new char[n];
        double [] score = new double[n];
        String s = "";
        double totCr = 0;
        double totGpa = 0;
        
        
        System.out.println("insert the courses with their respective credit hour and grade letter");
        
        for (int i = 0 ; i < n ; i++){
            System.out.println("name of course " + (i+1));
            str[i]=sc.next();
            System.out.println("credit hour for course " + (i+1));
            hr[i] = sc.nextInt();
            System.out.println("grade letter of course " + (i+1));
            s+=sc.next();
            //grade[i] = s.charAt(i);
            System.out.println("score " + (i+1));
            score[i] = sc.nextDouble();
            
            System.out.println();
            
            totCr+=hr[i];
        }
        
        calcGPA g = (sco,cr,gptot)->{
            for (int i = 0 ; i < n ; i++){
            if (sco[i] >= 85){
                    gpa[i] = (4 * hr[i]);
                }
            else if (sco[i] >= 80){
                    gpa[i] = (3.75 * hr[i]);
                }
            else if (sco[i] >= 75){
                    gpa[i] = (3.5 * hr[i]);
                }
            else if (sco[i] >= 70){
                    gpa[i] = (3.25 * hr[i]);
                }
            else if (sco[i] >= 65){
                    gpa[i] = (3 * hr[i]);
                }
            //C
            else if (sco[i] >= 60){
                    gpa[i] = (2.5 * hr[i]);
                }
            else if (sco[i] >= 55){
                    gpa[i] = (2 * hr[i]);
                }
            else if (sco[i] >= 50){
                    gpa[i] = (2 * hr[i]);
                }
            else if (sco[i] >= 40){
                    gpa[i] = (1 * hr[i]);
                }
            else{
                gpa[i] = (0 * hr[i]);
                }
            
            gptot+=gpa[i] / cr; 
            
        }
            return gptot;
        };
        
        Status studStatus = (x) -> {
            String stat ="";
            for (int i = 0 ; i < n ; i++){
                if (x >= 2.00){
                    stat = "Promoted";
                }
                else if (x >= 1.75){
                    stat = "warning";
                }
                else if (x >= 1.5){
                    stat = "Acadamic Dismissal";
                }
                else
                    stat = "Dismissal For Good";
            }
            return stat;
            
        };
         System.out.println("the GPA of the student is: " + g.gp(score,totCr,totGpa) + " and status: " + studStatus.stat(g.gp(score,totCr,totGpa)));   
        
         
//        for (int i = 0 ; i < n ; i++){
//            if (score[i] >= 85){
//                    gpa[i] = (4 * hr[i]);
//                }
//            else if (score[i] >= 80){
//                    gpa[i] = (3.75 * hr[i]);
//                }
//            else if (score[i] >= 75){
//                    gpa[i] = (3.5 * hr[i]);
//                }
//            else if (score[i] >= 70){
//                    gpa[i] = (3.25 * hr[i]);
//                }
//            else if (score[i] >= 65){
//                    gpa[i] = (3 * hr[i]);
//                }
//            //C
//            else if (score[i] >= 60){
//                    gpa[i] = (2.5 * hr[i]);
//                }
//            else if (score[i] >= 55){
//                    gpa[i] = (2 * hr[i]);
//                }
//            else if (score[i] >= 50){
//                    gpa[i] = (2 * hr[i]);
//                }
//            else if (score[i] >= 40){
//                    gpa[i] = (1 * hr[i]);
//                }
//            else{
//                gpa[i] = (0 * hr[i]);
//                }
//            
//            totGpa+=gpa[i] / totCr; 
//        }
//        System.out.println("the GPA of the student is: " + totGpa + " and status: " + studStatus.stat(totGpa));
      
    }
    
}
