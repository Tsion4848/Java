package tabledemo;

import java.awt.*;
import javax.swing.*;

public class TableDemo {
    
    String[] colHeads = { "Name", "Extension", "ID#" }; 
        
        Object[][] data = { 
                    { "Gail", "4567", "865" }, 
                    { "Ken", "7566", "555" }, 
                    { "Viviane", "5634", "587" }, 
                    { "Melanie", "7345", "922" }, 
                    { "Anne", "1237", "333" }, 
                    { "John", "5656", "314" }, 
                    { "Matt", "5672", "217" }, 
                    { "Claire", "6741", "444" }, 
                    { "Erwin", "9023", "519" }, 
                    { "Ellen", "1134", "532" }, 
                    { "Jennifer", "5689", "112" }, 
                    { "Ed", "9030", "133" }, 
                    { "Helen", "6751", "145" } 
                    };
        
    TableDemo(){
        JFrame jfrm = new JFrame("Image Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300,300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTable jtab = new JTable(data , colHeads);
        JScrollPane jsp = new JScrollPane(jtab);
        
        jfrm.add(jsp);
        jfrm.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
               new TableDemo();
            }
        });
    }    
}
