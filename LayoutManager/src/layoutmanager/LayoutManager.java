package layoutmanager;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutManager extends Frame{
    Label jlab1, jlab2, jlab3;
    TextField tf1,tf2;
    //String []stat = {"Single","Married"}; 
    Panel p1, p2, p3, pan;
    LayoutManager(){
        //BorderLayout bl = new BorderLayout();
        jlab1 = new Label("Personal Information");
        jlab2 = new Label("First Name");
        jlab3 = new Label("Last Name");
        tf1 = new TextField(10);
        tf2 = new TextField(10);
        
        p1 = new Panel();
        p1.add(jlab1, BorderLayout.NORTH);
        add(p1, BorderLayout.NORTH);
        
        p2 = new Panel();
        p2.add(jlab2);
        p2.add(tf1);
        
        p2.add(jlab3);
        p2.add(tf2);
        
        p3 = new Panel();
        p3.add(new Label("Marital status"));
        JComboBox cb = new JComboBox();
        cb.addItem("Single");
        cb.addItem("married");
        p3.add(cb);
        
        pan = new Panel();
        pan.add(p2, BorderLayout.NORTH);
        pan.add(p3, BorderLayout.NORTH);
                
        add(pan);
        
        
        
//        
//        
//        p4 = new Panel();
//        p5 = new Panel();
//        
//        p1.add(jlab1 , BorderLayout.NORTH);
//        p2.add(jlab2 , BorderLayout.WEST);
//        p2.add(tf1);
//        p3.add(jlab3 , BorderLayout.EAST);
//        p4.add(tf2);
//        p5.add(cb , BorderLayout.WEST);
//        
//        add(p1);
//        add(p2);
//        add(p3);
//        add(p4);
//        add(p5);
//        
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                LayoutManager lm = new LayoutManager();
                lm.setSize(500, 500);
                lm.setTitle("Layout Manager");
                lm.setVisible(true);
                
            }
        });
    }
        
}
