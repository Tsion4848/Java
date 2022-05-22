package scrollpane;

import java.awt.*;
import javax.swing.*;

public class ScrollPane{
    JLabel jlab;
    ScrollPane(){
        JFrame jfrm = new JFrame();
        
        jfrm.setSize(300 , 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20,20));
        jlab = new JLabel("choose your button");
        
        int b = 1;
        for (int i = 0 ; i < 20 ; i++){
            for (int j = 0 ; j < 20 ; j++){
                jp.add(new JButton("Button " + b));
                ++b;
            }
        }
        
        JScrollPane jsp = new JScrollPane(jp);
        jfrm.add(jsp , BorderLayout.CENTER);
        //jfrm.add(jlab);
        jfrm.setVisible(true);
    }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new ScrollPane();
            }     
        });   
    }
}
