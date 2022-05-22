package combobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox {
    JLabel jlab;
    String [] favs = {"mik", "min", "win"};
    ComboBox(){
        JFrame jfrm = new JFrame("Image Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300,300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JComboBox<String> cb = new JComboBox<String>(favs);
        jfrm.add(cb);
//        cb.addItem("mik");
//        cb.addItem("ttom");
//        cb.addItem("win");
        
        //cb.addActionListener(this);
//        cb.addActionListener(new ActionListener(){;
//        public void actionPerformed(ActionEvent ae){
//        jlab.setText("you choosed " + cb.getSelectedItem());
//        }
//    });
    jlab = new JLabel(new ImageIcon("choose your favorite movie "));
  cb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            String s = (String) cb.getSelectedItem();
        jlab.setIcon(new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\" + s + ".jpg"));
        }
    });       
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new ComboBox();
            }
        });
    }
}
