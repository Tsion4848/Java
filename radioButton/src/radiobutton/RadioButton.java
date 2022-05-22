package radiobutton;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class RadioButton implements ActionListener {
    
    JLabel jlab;
            
    RadioButton(){
        JFrame jfrm = new JFrame("Image Button");
        //jfrm.setLayout(new FlowLayout());
        jfrm.setSize(500,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        JRadioButton b1 = new JRadioButton("A");
//        b1.addActionListener(this);
//        jfrm.add(b1);
//        
//        JRadioButton b2 = new JRadioButton("B");
//        b2.addActionListener(this);
//        jfrm.add(b2);
//        
//        JRadioButton b3 = new JRadioButton("C");
//        b3.addActionListener(this);
//        jfrm.add(b3);
//        
//        ButtonGroup bg = new ButtonGroup();
//        bg.add(b1);
//        bg.add(b2);
//        bg.add(b3);
//        
//        jlab = new JLabel("choose a button");
//        jfrm.add(jlab);

    JTextField jtf  = new JTextField(30);
    JPanel jp = new JPanel();
    jp.setLayout(new GridLayout(4,4));
    
    for (int i = 1 ; i < 4 ; i++){
            for (int j = 0 ; j < 4 ; j++){
                int k = i * 4 + j;
                if (k >= 0){
                    jp.add (new Button("" + k));
                }
            }
    }
    
    
    jfrm.add(jtf, BorderLayout.NORTH);
    jfrm.add(jp, BorderLayout.CENTER);
        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        jlab.setText("you choose " + ae.getActionCommand());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new RadioButton();
            }
        });
    }    
}
