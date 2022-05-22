package checkbox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CheckBox implements ItemListener {
    
    JLabel selected;
    JLabel changed;
    JCheckBox alpha;
    JCheckBox beta;
    JCheckBox gamma;
    
    CheckBox(){
       
        JFrame jfrm = new JFrame();
        
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300 , 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        selected = new JLabel("");
        changed = new JLabel("");
        
        alpha = new JCheckBox("alpha");
        beta = new JCheckBox("beta");
        gamma = new JCheckBox("gamma");
        
        alpha.addItemListener(this);
        beta.addItemListener(this);
        gamma.addItemListener(this);
        
        jfrm.add(alpha);
        jfrm.add(beta);
        jfrm.add(gamma);
        jfrm.add(changed);
        jfrm.add(selected);      
                
        jfrm.setVisible(true);        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
               new CheckBox();
            }
        });
    }
    public void itemStateChanged(ItemEvent e){
    
        String str="";
        
        JCheckBox cb = (JCheckBox) e.getItem();
        
        if (cb.isSelected())
            changed.setText(cb.getText() + " was just selected");
        else
            changed.setText(cb.getText() + " was just cleared");
        
        if (alpha.isSelected())
            str+="Alpha, ";
        if (beta.isSelected())
            str+="Beta, ";
        if (gamma.isSelected())
            str+="Gamma";
        
        selected.setText("selected checkboxes: " + str);
    }
    
}