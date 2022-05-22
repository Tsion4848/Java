package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{
    JTextField tf1, tf2, oper;
    double a,b,result = 0;
    int op;
    JComboBox<String> cb;
    JLabel jlab;
    
    Calculator(){
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setLayout(null);
        jfrm.setSize(350 , 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.getContentPane().setBackground(new Color(230, 242, 255));
        
        
        tf1 = new JTextField();
        tf2 = new JTextField();  
        cb = new JComboBox<String>();        
        jlab = new JLabel();
        
        Font fon = new Font("Sans Serif" , Font.BOLD , 18);
        
        tf1.setBackground(new Color(255, 230, 230));
        tf1.setFont(fon);
        tf2.setBackground(new Color(255, 230, 230));
        tf2.setFont(fon);
        cb.setBackground(new Color(255, 230, 255));
        cb.setFont(fon);
        jlab.setFont(fon);
        
        tf1.setBounds(10,100,200,30);
        tf2.setBounds(10,170,200,30);       
        cb.setBounds(10,250,100,30);
        jlab.setBounds(10,310,350,30);
        
        
        cb.addItem("add");
        cb.addItem("sub");
        cb.addItem("mul");
        cb.addItem("div");
        
        cb.addActionListener(this);
        
        jfrm.add(tf1);
        jfrm.add(tf2);
        jfrm.add(cb);
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cb){
            if ((String)cb.getSelectedItem() == "add"){
                a = Double.parseDouble(tf1.getText());
                b = Double.parseDouble(tf2.getText());
                result = a + b;
                jlab.setText("Result: " + result);
            }
            if(cb.getSelectedItem() == "sub"){
                a = Double.parseDouble(tf1.getText());
                b = Double.parseDouble(tf2.getText());
                result = a - b;
                jlab.setText("Result: " + result);
            }
            if(cb.getSelectedItem() == "mul"){
                a = Double.parseDouble(tf1.getText());
                b = Double.parseDouble(tf2.getText());
                result = a * b;
                jlab.setText("Result: " + result);
            }
            if(cb.getSelectedItem() == "div"){
                a = Double.parseDouble(tf1.getText());
                b = Double.parseDouble(tf2.getText());
                if (b != 0){
                    result = a / b;
                    jlab.setText("Result: " + result);
                }
                else
                    jlab.setText("division by 0 exception");
            }
        }
    }
        
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Calculator();
            }
        });
    }    
}
