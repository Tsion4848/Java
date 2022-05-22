package layoutmanager2;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutManager2 extends JFrame {
    
    JButton submit;
    LayoutManager2(){
         Container cp = getContentPane();
        setSize(500,800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      
      JLabel label = new JLabel("Student Info");
      JPanel jp = new JPanel();
      jp.add(label);
      
      cp.add(jp,BorderLayout.NORTH);
      
      JPanel field = new JPanel();
       cp.add(field,BorderLayout.CENTER);
       field.setLayout(new GridLayout(7,2));
       field.add(new JLabel("First Name:"));
       field.add(new JTextField());
       field.add(new JLabel("Last Name:"));
       field.add(new JTextField());
       field.add(new JLabel("ID NO:"));
       field.add(new JTextField());
       field.add(new JLabel("Gender:"));
       ButtonGroup gender = new ButtonGroup();
       JRadioButton male = new JRadioButton("Male");
       JRadioButton female = new JRadioButton("Female");
      
       gender.add(male);
       gender.add(female);
       
       JPanel g = new JPanel();
       g.add(female);
       g.add(male);
       
       field.add(g);
       field.add(new JLabel("Age:"));
       field.add(new JTextField());
       field.add(new JLabel("Hobby:"));
       JPanel h = new JPanel();
       h.setLayout(new GridLayout(2,2));
       JCheckBox cb1 = new JCheckBox("Reading");
       JCheckBox cb2 = new JCheckBox("Watching TV");
       JCheckBox cb3 = new JCheckBox("Writing");
       JCheckBox cb4 = new JCheckBox("Riding Bycycle");
       h.add(cb1);
       h.add(cb2);
       h.add(cb3);
       h.add(cb4);
       field.add(h);
       field.add(new JLabel("Educational Level:"));
       JComboBox el = new JComboBox();
       el.addItem("High school");
       el.addItem("University");
       el.addItem("College");
       field.add(el);
       submit = new JButton("Submit");
       JPanel bottom = new JPanel();
       bottom.setLayout(new FlowLayout());
       bottom.add(submit);
       
       JTextArea ta = new JTextArea(5, 100);
       bottom.add(ta);
       cp.add(bottom, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                LayoutManager2 lm = new LayoutManager2();
                lm.setVisible(true);
            }
        });
    }    
}
