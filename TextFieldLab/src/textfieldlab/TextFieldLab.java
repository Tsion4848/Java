package textfieldlab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldLab {
  JLabel l1,l2,l3,l4,l5,l6;
  JTextField tf1;
  JTextField tf2;
  JTextField tf3;
  JTextField tf4;
  JTextField tf5;
  JTextField tf6;
    TextFieldLab(){
        JFrame jfrm = new JFrame("Personal Info");
        jfrm.setLayout(null);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(400, 400);
        
        l1 = new JLabel("Student Info");
        l2 = new JLabel("First Name");
        tf1 = new JTextField();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
               
            }
        });
    }
}