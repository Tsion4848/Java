package textcomparison;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
        
class TextComparison implements ActionListener {
   
    JTextField f1;
    JTextField f2;
    
    JButton jbtn;
    
    JLabel lab1, lab2;
    JLabel result;
    
    TextComparison(){
        
        JFrame jfrm = new JFrame();
        
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300 , 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        f1=new JTextField(10);
        f2=new JTextField(10);
        
        lab1=new JLabel("First Text");
        lab2 = new JLabel("Second Text");
        result= new JLabel("");
        
        ImageIcon im = new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\ttom.jpg");
        jbtn = new JButton(im);
        
        Color col=new Color(34,56,78);
        Font fon=new Font("Sans Serif" , Font.BOLD , 16);
        
        
        jbtn.setBackground(Color.LIGHT_GRAY);
        //jbtn.setIcon(im);
        jbtn.setFont(fon);
        jfrm.setBackground(Color.yellow);
        lab1.setForeground(Color.green);
        lab2.setForeground(Color.green);
        result.setForeground(Color.MAGENTA);
        f1.setBackground(Color.yellow);
        f2.setBackground(Color.yellow);
        //result.setIcon(im);
                        
        jbtn.addActionListener(this);
        
        f1.setActionCommand("first text");
        f2.setActionCommand("second text");
               
        jfrm.add(lab1);
        jfrm.add(f1);
        jfrm.add(lab2);
        jfrm.add(f2);
        jfrm.add(jbtn);
        jfrm.add(result);
        //jfrm.add(new JLabel(im));
        
        jfrm.setVisible(true);        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new TextComparison();
            }
        });
    }
    
    public void actionPerformed(ActionEvent e){
        int i=0 , j=0;
        
        if (f1.getText() == ""){
            result.setText("first text is missing");
        return;
        }
        if (f2.getText() == ""){
            result.setText("second file is missing");
        return;
        }
        
        if (f1.getText().equals(f2.getText())){
            result.setText("The texts are equal");            
        }
        else
            result.setText("The texts are not equal");
    }
    
}
