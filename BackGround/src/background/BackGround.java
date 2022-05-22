package background;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BackGround implements ActionListener, MouseListener, MouseMotionListener{
    JButton cyan,btn;
    JButton black , blue;
    JPanel col;
    JFrame jfrm; 
    JLabel jlab;
    BackGround(){
        jfrm = new JFrame("Personal Info");
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(300, 300);
        
        
        cyan = new JButton("cyan");
        black = new JButton("black");
        blue = new JButton("blue");
        btn = new  JButton("mouse");
        jlab = new JLabel("your mouse event will be shown here");
        //col = new JPanel();
        
        cyan.addActionListener(this);
        mycolor col = new mycolor();
        black.addActionListener(col);
        btn.addMouseListener(this);
        btn.addMouseMotionListener(this);
        
    jfrm.add(cyan);
    jfrm.add(black);
    jfrm.add(btn);  
    jfrm.add(jlab);
    jfrm.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cyan){
            //col.setBackground(Color.red);
            jfrm.getContentPane().setBackground(Color.cyan);
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        jfrm.getContentPane().setBackground(new Color(204, 224, 255));
        jlab.setText("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jfrm.getContentPane().setBackground(new Color(255, 204, 255));
        jlab.setText("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        jfrm.getContentPane().setBackground(new Color(255, 255, 204));
        jlab.setText("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jfrm.getContentPane().setBackground(new Color(204, 255, 229));
        jlab.setText("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jfrm.getContentPane().setBackground(new Color(255, 214, 204));
        jlab.setText("mouse exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
         jfrm.getContentPane().setBackground(new Color(212, 212, 170));
        jlab.setText("mouse dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
         jfrm.getContentPane().setBackground(new Color(148, 184, 184));
        jlab.setText("mouse moved");
    }
    
class mycolor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == black){
            jfrm.getContentPane().setBackground(Color.black);
        }
    }
}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new BackGround();
            }
        });
    }
    
}

