package fileadvanced;

import java.io.File;

public class FileAdvanced {

    static void p(String str){
        System.out.println(str);
    }
    
    public static void main(String[] args) {
       
//        File f1 = new File("Documents\\NetBeansProjects\\java\\COPYRIGHT");
//        p("renamed: " + f1.renameTo(new File("Documents\\NetBeansProjects\\java\\renahdhhh")));
//        p("File Name: " + f1.getName());
//        p(f1.isHidden() ? "hidden" : "not hidden");
//        p("Path: " + f1.getPath());
//        p("Absolute Path: " + f1.getAbsolutePath());
//        p("Parent: " + f1.getParent());
//        p(f1.exists() ? "it exists" : "it doesn't exist");
//        p(f1.canWrite() ? "is writable" : "is not writable");
//        p(f1.canRead() ? "is readable" : "is not readable");
//        p(f1.isDirectory() ? "is directory" : "is not directory");
//        p(f1.isFile() ? "is normal file" : "might be a named pipe");
//        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
//        p("Last Modified: " + f1.lastModified());
//        p("File size: " + f1.length() + "bytes");
        
    String dirName = "C:\\Users\\hp\\Documents\\NetBeansProjects";
    File f2 = new File (dirName);
    
    if (f2.isDirectory()){
        System.out.println("Directory of " + dirName);
        String s[] = f2.list();
        
        for (int i = 0 ; i < s.length ; i++){
            File f = new File(dirName + "/" + s[i]);
            
            if (f.isDirectory()){
                System.out.println(s[i] + " is a directory of " + dirName);
            }
            else{
                System.out.println(s[i] + " is a file");
            }
        }
    }
    else{
        System.out.println(dirName + " is not a directory");
    }
    
    }
    
}
