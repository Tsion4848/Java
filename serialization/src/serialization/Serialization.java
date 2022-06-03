package serialization;

import java.io.*;

class Person implements Serializable{
    private static final long serialVersionUID = -6516558802260608650L;
    String name;
    String occupation;
    String department;
    transient int noCourses;
    static String stream;
    static String school = "AASTU";
    final int age = 21;
    final String tel;//must be included in the constructor or must be initialized
    
    Person(String name, String occupation, String department, int noCourses, String tel){
        this.name = name;
        this.occupation = occupation;
        this.department = department;
        this.noCourses = noCourses;
        this.tel = tel;
    }
    
//    @Override
//    public String toString(){
//        return "person name= " + name;
//    }
}

public class Serialization {

    public static void main(String[] args) {
        
        Person tsi = new Person("Tsion Moges", "student", "Software engineering", 5, "0904567635");
        
//        try{
//            writeToFile(tsi);
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }
        
        try{
            readFile();
        }
        catch(ClassNotFoundException | IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void writeToFile(Person p) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.bin", true));
        out.writeObject(p);
        out.close();
    }
    
    public static void readFile()throws IOException , ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.bin"));
        Person p = (Person) in.readObject();
        System.out.println("Name: " + p.name + "\n" + "Occupation: " + p.occupation + "\n" + "Department: " + 
                p.department + "\nNumber of courses: " + p.noCourses + "\nStream: " + p.stream + "\nSchool: " + 
                p.school +  "\nAge: " + p.age + "\nPhone number: " + p.tel);
        in.close();
    }
}
