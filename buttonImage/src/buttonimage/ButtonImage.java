package buttonimage;

import java.awt.*;
import javax.swing.*;

public class ButtonImage extends JApplet {

    ButtonImage(){
        JFrame jfrm = new JFrame("Image Icon");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300 , 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon im = new ImageIcon("C:\\Users\\hp\\Pictures\\wallpapers\\mik.jpg");
        JLabel jlab = new JLabel(" here is the image " , im , JLabel.CENTER);
        
        jfrm.add(jlab);
        jfrm.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
               new ButtonImage();
            }
        });
    }
    
}
