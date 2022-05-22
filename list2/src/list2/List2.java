package list2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class List2 {
    JLabel jlab;
    
    String [] cities = {"Gondar", "BahirDar", "Addis Ababa", "mekelle", "Haremaya", "London", "New York"};
    List2(){
        JFrame jfrm = new JFrame();
        
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300 , 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JList<String> jlst = new JList<String>(cities);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane jsp = new JScrollPane(jlst);
        jsp.setPreferredSize(new Dimension(100 , 200));
        
        jlab = new JLabel("Choose your city");
        
        jlst.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent le){
                int idx = jlst.getSelectedIndex();
                
                if(idx != -1){
                    jlab.setText("You choose " + jlst.getSelectedValue());
                }
                else
                    jlab.setText("Choose your city");
            }
        });
        
        jfrm.add(jsp);
        jfrm.add(jlab);
        
        jfrm.setVisible(true);        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new List2();
            }
        });
    }
}
