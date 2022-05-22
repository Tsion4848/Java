package cardlayoutdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame {

     Checkbox windows10, windows7, windows8, android, linux, mac; 
     Panel osCards; 
     CardLayout cardLO; 
     Button win, other;
     
     CardLayoutDemo(){
         setLayout(new FlowLayout());
         win = new Button("Windows");
         other = new Button("Others");
         add (win);
         add (other);
         
         cardLO = new CardLayout();
         osCards = new Panel();
         osCards.setLayout(cardLO);
         
         windows7 = new Checkbox("windows 7" , true);
         windows8 = new Checkbox("windows 8");
         windows10 = new Checkbox("windows 10");
         android = new Checkbox("Android");
         linux = new Checkbox("Linux");
         mac = new Checkbox("Mac OS");
         
         Panel winPan = new Panel();
         winPan.add(windows7);
         winPan.add(windows8);
         winPan.add(windows10);
         
         Panel otPan = new Panel();
         otPan.add(android);
         otPan.add(linux);
         otPan.add(mac);
         
         osCards.add(winPan,"Windows");
         osCards.add(otPan,"Other");
         
         add (osCards);
         
         win.addActionListener((ae) -> cardLO.show(osCards, "windows"));
         other.addActionListener((ae) -> cardLO.show(osCards, "other"));
         
         addMouseListener(new MouseAdapter(){
             public void mousePressed(MouseEvent me){
                 cardLO.next(osCards);
             }
         });
     
         addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent we){
                 System.exit(0);
             }
         });
     }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                CardLayoutDemo cld = new CardLayoutDemo();
                cld.setTitle("Card Layout");
                cld.setSize(300, 300);
                cld.setVisible(true);
            }
        });
    }
}
