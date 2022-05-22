package buttonwithicon;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonWithIcon implements ActionListener{
    
    JLabel jlab;
    
    ButtonWithIcon(){
        
        JFrame jfrm = new JFrame("Image Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon im1 = new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\ttom.jpg");
        JButton jbtn1 = new JButton(im1);
        jbtn1.setActionCommand("tom and jerry");
        jbtn1.addActionListener(this);
        jfrm.add(jbtn1);
        
        ImageIcon im2 = new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\min.jpg");
        jbtn1 = new JButton(im2);
        jbtn1.setActionCommand("minions");
        jbtn1.addActionListener(this);
        jfrm.add(jbtn1);
        
        ImageIcon im3 = new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\win.jpg");
        jbtn1 = new JButton(im3);
        jbtn1.setActionCommand("winnie the pooh");
        jbtn1.addActionListener(this);
        jfrm.add(jbtn1);
        
        ImageIcon im4 = new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\mik.jpg");
        jbtn1 = new JButton(im4);
        jbtn1.setActionCommand("mickey mouse");
        jbtn1.addActionListener(this);
        jfrm.add(jbtn1);
        
        jlab = new JLabel("choose a picture");
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
    }   
    
    public void actionPerformed(ActionEvent ae){
        jlab.setText(ae.getActionCommand());
    }
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
             new ButtonWithIcon ();  
            }
        });
    }    
}
