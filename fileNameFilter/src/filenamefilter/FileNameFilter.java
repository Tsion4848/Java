package filenamefilter;

import java.io.*;

class ExtFilt implements FilenameFilter{
    
    String ext;
    
    public ExtFilt(String ext){
        this.ext = "." + ext;
    }
    @Override
    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }
}

public class FileNameFilter {

    public static void main(String[] args) {
        
        String dirname = "C:\\Users\\hp\\Documents\\my_html";
        File f1 = new File(dirname);
        ExtFilt ex = new ExtFilt("html");
        
        FilenameFilter only = new ExtFilt("html");
        String s[] = f1.list(only);
        
        for (int i = 0 ; i < s.length ; i++){
            System.out.println(s[i]);
        }
        System.out.println(ex.accept(f1,"dd.html"));
        
    }
    
}
