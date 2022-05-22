package javafxswingapplication1;

import static java.awt.BorderLayout.*;
import javax.swing.*;

class JavaFXSwingApplication1{
    JavaFXSwingApplication1(){
        JFrame jfrm = new JFrame("simple test");
        
        jfrm.setSize(300, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel jlab =new JLabel("label for first swing");
        jfrm.add(jlab , CENTER);
        jfrm.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new JavaFXSwingApplication1();
            }
        });
    }
    
}