package textfield2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Textfield2 {

    Textfield2(){
        JFrame jfrm = new JFrame("textfield");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300 , 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField tf = new JTextField("this is my text");
        JLabel jlab = new JLabel();
       
        tf.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jlab.setText("you entered: " + tf.getText());
            }
        });
       
       jfrm.add(tf);
       jfrm.add(jlab);
       jfrm.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Textfield2();
            }
        });
    }
}
