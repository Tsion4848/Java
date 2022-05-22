package tabbedpanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TabbedPanel  {
    
    TabbedPanel(){
        JFrame jfrm = new JFrame("Image Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities" , new CitiesPanel());
        jtp.add("Colors" , new ColorsPanel());
        jtp.add("Flavors" , new FlavorsPanel());
        
        jfrm.add(jtp);
        jfrm.setVisible(true);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new TabbedPanel();
            }
        });
    }
}
    
class CitiesPanel extends JPanel implements ActionListener{
    JLabel jlab;
    JButton b1, b2, b3, b4;
    CitiesPanel(){
        jlab = new JLabel("choose your option");
        b1 = new JButton("Gondar");
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Hawassa");
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("NewYork");
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("London");
        b4.addActionListener(this);
        add(b4);
        
        add(jlab);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals(b1.getText())){
            jlab.setText("your city is: " + b1.getText());
        }
        
        if (ae.getActionCommand().equals(b2.getText())){
            jlab.setText("your city is: " + b2.getText());
        }
        
        if (ae.getActionCommand().equals(b3.getText())){
            jlab.setText("your city is: " + b3.getText());
        }
        
        if (ae.getActionCommand().equals(b4.getText())){
            jlab.setText("your city is: " + b4.getText());
        }
    }        
}

class ColorsPanel extends JPanel implements ItemListener{
    JLabel jlab;
    JCheckBox c1,c2,c3;
    ColorsPanel(){
    c1 = new JCheckBox("Green");
    c1.addItemListener(this);
    add(c1);
    
    c2 = new JCheckBox("Blue");
    c2.addItemListener(this);
    add(c2);
    
    c3 = new JCheckBox("Yellow");
    c3.addItemListener(this);
    add(c3);
    
    jlab = new JLabel("choose your color");    
    add(jlab);
    }
    
    public void itemStateChanged(ItemEvent e){
        String str = "";
        JCheckBox cb = (JCheckBox) e.getItem();
        
        if (c1.isSelected()){
            str+=c1.getText() + ", ";
        }
        if (c2.isSelected()){
            str+=c2.getText() + ", ";
        }
        if (c3.isSelected()){
            str+=c3.getText() + ", ";
        }
        
        jlab.setText("you selected " + str);        
    }
}

class FlavorsPanel extends JPanel implements ActionListener{
    JLabel jlab;
    JComboBox<String> cb = new JComboBox<String>();
    FlavorsPanel(){    
    cb.addItem("Vanilla");
    cb.addItem("Chocolate");
    cb.addItem("Strawberry");
    cb.addActionListener(this);
    
    jlab = new JLabel("choose your flavor");
    add(cb);
    add(jlab);
    }
    
    public void actionPerformed(ActionEvent ae){
        //JComboBox<String> cbb;
        //cbb = (JComboBox) 
        jlab.setText("you choosed " + cb.getSelectedItem());
    }
}
    

