package label2;

import static java.awt.BorderLayout.*;
import javax.swing.*;

public class Label2{

    Label2(){
        JFrame jfrm = new JFrame("this is a label");
        
        jfrm.setSize(300 , 300);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jlab = new JLabel("this is a label");
        
        jfrm.add(jlab , EAST);
        jfrm.setVisible(true);
    }
            
    public static void main(String[] args) {
      
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Label2();
            }
        });
    }
    
}