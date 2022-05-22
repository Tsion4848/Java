package serialization;

import java.io.*;

class Person implements Serializable{
    
    String name;
    String occupation;
    String department;
    
    Person(String name, String occupation, String department){
        this.name = name;
        this.occupation = occupation;
        this.department = department;
    }
    
//    @Override
//    public String toString(){
//        return "person name= " + name;
//    }
}

public class Serialization {

    public static void main(String[] args) {
        
        Person tsi = new Person("Tsion Moges", "student", "Software engineering");
        
        try{
        writeToFile(tsi);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
//        try{
//            readFile();
//        }
//        catch(ClassNotFoundException | IOException e){
//            System.out.println(e.getMessage());
//        }
    }
    
    public static void writeToFile(Person p) throws IOException{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.bin", true));
        
        out.writeObject(p);
    }
    
    public static void readFile()throws IOException , ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.bin"));
        
        Person p = (Person) in.readObject();
        System.out.println("Name: " + p.name + "\n" + "Occupation: " + p.occupation + "\n" + "Department: " + p.department);
    }
}
