package button2;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class Button2{
    
    Button2(){
        
        JFrame jfrm = new JFrame("button 2");
        jfrm.setSize(300,300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());
        
        JLabel jlab = new JLabel("push a button");
        
        JButton up = new JButton("up");
        JButton down = new JButton("down");
        
        //up.addActionListener( (ae) -> jlab.setText("up was pressed."));
        up.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jlab.setText("you pressed up");
            }
        });
        
        down.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jlab.setText("you pressed down button");
            }
        });
    
    jfrm.add(up);
    jfrm.add(down);
    jfrm.add(jlab);
    
    jfrm.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Button2();
            }
        });
    }
    
}
