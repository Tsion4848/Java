package background2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;


public class Background2 extends MouseAdapter implements MouseWheelListener {
    JFrame jfrm;
    JLabel jlab;
    Background2(){
       jfrm = new JFrame("Menu");
       jfrm.setLayout(new FlowLayout());
       jfrm.setSize(300, 300);
       jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       jfrm.addMouseListener(this);
//       jfrm.addMouseMotionListener(this);
       jfrm.addMouseListener(this);
       jlab = new JLabel("your event will be shown here");
       jfrm.addMouseWheelListener(this);
       
       jfrm.add(jlab);
       jfrm.setVisible(true);
    
    }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
               new Background2();
            }
        });
    }
    
public void mouseClicked(MouseEvent e) 
  {
    if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
     jfrm.getContentPane().setBackground(new Color(204, 224, 255));
     jlab.setText("left mouse");
    }
 
    if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
     jfrm.getContentPane().setBackground(new Color(255, 204, 255));
     jlab.setText("right mouse");
    }
  }
public void mouseWheelMoved(MouseWheelEvent e) {
//    if (e.getWheelRotation() < 0) {
//          jfrm.getContentPane().setBackground(Color.BLUE);
//          jlab.setText("scroll");
//        } else {
//          jfrm.getContentPane().setBackground(Color.red);
//        }
        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
          jfrm.getContentPane().setBackground(Color.gray);
          jlab.setText("scroll");
                 
        }
        if (e.getScrollType() == MouseWheelEvent.WHEEL_BLOCK_SCROLL) {
         jfrm.getContentPane().setBackground(Color.PINK);
        }
    }
//
//    public void mouseClicked(MouseEvent e) {
//        jfrm.getContentPane().setBackground(new Color(204, 224, 255));
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        jfrm.getContentPane().setBackground(new Color(255, 204, 255));
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        jfrm.getContentPane().setBackground(new Color(255, 255, 204));
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        jfrm.getContentPane().setBackground(new Color(204, 255, 229));
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//        jfrm.getContentPane().setBackground(new Color(255, 214, 204));
//    }
//
//    @Override
//    public void mouseDragged(MouseEvent e) {
//        jfrm.getContentPane().setBackground(new Color(212, 212, 170));
//    }
//
//    @Override
//    public void mouseMoved(MouseEvent e) {
//        jfrm.getContentPane().setBackground(new Color(148, 184, 184));
//    }
//   
}
