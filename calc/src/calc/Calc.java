package calc;

import java.awt.*;
import java.awt.event.*;
import static java.lang.Integer.parseInt;
import java.util.EventListener;
import javax.swing.*;
import javax.swing.border.Border;
/*
class RoundedBorder implements Border{
    int rad;
    RoundedBorder(int rad){
        this.rad = rad;
    }
    
    public Insets getBorderInsets(Component c){
        return new Insets(this.rad+1, this.rad+1, this.rad+1, this.rad);
    }
    public boolean isBorderOpaque(){
        return true;
    }
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
        g.drawRoundRect(x, y, width, height, width, height);
    }
}
*/
public class Calc implements ActionListener {

    JTextField tf;
    JLabel jlab;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot, badd, bsub, bmul, bdiv, beq, bcl,bim;
    double x=0 , y=0, result=0;
    int op=0;
    
    Calc(){
        JFrame jfrm = new JFrame("calculator");
        jfrm.setLayout(null);
        jfrm.setSize(350, 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setResizable(false);
        jfrm.getContentPane().setBackground(new Color(255, 255, 230));
        
        tf = new JTextField();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bdot = new JButton(".");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        beq = new JButton("=");
        bcl = new JButton("clear");
        
        ImageIcon im = new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\enj.jpg");
        jlab = new JLabel(im);
        
        
        tf.setBounds(30,40,280,30);
        
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        
        bdot.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        
        bcl.setBounds(100,380,100,40);
        
        jlab.setBounds(220,380,100,40);
        
        b0.addActionListener(this);
        b1.addActionListener(this);        
        b2.addActionListener(this);        
        b3.addActionListener(this);        
        b4.addActionListener(this);        
        b5.addActionListener(this);        
        b6.addActionListener(this);        
        b7.addActionListener(this);        
        b8.addActionListener(this);        
        b9.addActionListener(this);        
        bdot.addActionListener(this);        
        badd.addActionListener(this);        
        bsub.addActionListener(this);        
        bmul.addActionListener(this);        
        bdiv.addActionListener(this);        
        beq.addActionListener(this);        
        bcl.addActionListener(this);
     
        Font fon = new Font("Sans Serif" , Font.BOLD , 18);
        
        b1.setBackground(new Color(102, 102, 153));
        b1.setFont(fon);
        b2.setBackground(new Color(102, 102, 153));
        b2.setFont(fon);
        b3.setBackground(new Color(102, 102, 153));
        b3.setFont(fon);
        b4.setBackground(new Color(102, 102, 153));
        b4.setFont(fon);
        b5.setBackground(new Color(102, 102, 153));
        b5.setFont(fon);
        b6.setBackground(new Color(102, 102, 153));
        b6.setFont(fon);
        b7.setBackground(new Color(102, 102, 153));
        b7.setFont(fon);
        b8.setBackground(new Color(102, 102, 153));
        b8.setFont(fon);
        b9.setBackground(new Color(102, 102, 153));
        b9.setFont(fon);
        b0.setBackground(new Color(102, 102, 153));
        b0.setFont(fon);
        badd.setBackground(new Color(102, 102, 153));
        badd.setFont(fon);
        bsub.setBackground(new Color(102, 102, 153));
        bsub.setFont(fon);
        bmul.setBackground(new Color(102, 102, 153));
        bmul.setFont(fon);
        bdiv.setBackground(new Color(102, 102, 153));
        bdiv.setFont(fon);
        bdot.setBackground(new Color(102, 102, 153));
        bdot.setFont(fon);
        beq.setBackground(new Color(102, 102, 153));
        beq.setFont(fon);
        bcl.setBackground(new Color(102, 102, 153));
        bcl.setFont(fon);
        tf.setBackground(new Color(230, 255, 255));
        tf.setFont(fon);
        
        //b1.setBorder(new RoundedBorder(15));
        
        jfrm.add(tf);
        jfrm.add(b7);
        jfrm.add(b8);
        jfrm.add(b9);
        jfrm.add(bdiv);
        jfrm.add(b4);
        jfrm.add(b5);
        jfrm.add(b6);
        jfrm.add(bmul);
        jfrm.add(b1);
        jfrm.add(b2);
        jfrm.add(b3);
        jfrm.add(bsub);
        
        jfrm.add(bdot);
        jfrm.add(b0);
        jfrm.add(beq);
        jfrm.add(badd);
        jfrm.add(bcl);
        
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Calc();
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == b1){
            tf.setText(tf.getText().concat("1"));
        }
        if (ae.getSource() == b2){
            tf.setText(tf.getText().concat("2"));
        }
        if (ae.getSource() == b3){
            tf.setText(tf.getText().concat("3"));
        }
        if (ae.getSource() == b4){
            tf.setText(tf.getText().concat("4"));
        }
        if (ae.getSource() == b5){
            tf.setText(tf.getText().concat("5"));
        }
        if (ae.getSource() == b6){
            tf.setText(tf.getText().concat("6"));
        }
        if (ae.getSource() == b7){
            tf.setText(tf.getText().concat("7"));
        }
        if (ae.getSource() == b8){
            tf.setText(tf.getText().concat("8"));
        }
        if (ae.getSource() == b9){
            tf.setText(tf.getText().concat("9"));
        }
        if (ae.getSource() == b0){
            tf.setText(tf.getText().concat("0"));
        }
        if (ae.getSource() == bdot){
            tf.setText(tf.getText().concat("."));
        }
        
        if (ae.getSource() == badd){
            x = Double.parseDouble(tf.getText());
            op = 1;
            tf.setText("");
            //tf.setText(tf.getText().concat("+"));
        }
        if (ae.getSource() == bsub){
            x = Double.parseDouble(tf.getText());
            op = 2;
            tf.setText("");
            //tf.setText(tf.getText().concat("-"));
        }
        if (ae.getSource() == bmul){
            x = Double.parseDouble(tf.getText());
            op = 3;
            tf.setText("");
            //tf.setText(tf.getText().concat("x"));
        }
        if (ae.getSource() == bdiv){
            x = Double.parseDouble(tf.getText());
            op = 4;
            tf.setText("");
            //tf.setText(tf.getText().concat("/"));
        }        
        if (ae.getSource() == beq){
            y = Double.parseDouble(tf.getText());
            switch(op){
                case 1: result = x + y;
                    break;
                case 2: result = x - y;
                    break;
                case 3: result = x * y;
                    break;
                case 4: 
                    //if (y != 0){
                    try{
                        result = x / y;
                        break;
                    }
                    catch(ArithmeticException exc){
                        tf.setText("division by 0 exception");
                    }
                default: result = 0;
            }
            tf.setText(""+result);
            
        }
        if (ae.getSource() == bcl){
            tf.setText("");
        }
    }    
}
