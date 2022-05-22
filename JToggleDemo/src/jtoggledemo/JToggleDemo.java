package jtoggledemo;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JToggleDemo {
    
    JToggleDemo(){
        
        JFrame jfrm = new JFrame("Image Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JToggleButton jb = new JToggleButton("on/off");
        JLabel jlab = new JLabel("push the button");
        
        jb.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ae){
                if (jb.isSelected()){
                    jlab.setText("Button is on");
                }
                else
                    jlab.setText("Button is off");
            }
        });
        
        jfrm.add(jb);
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new JToggleDemo();
            }
        });
    }
}