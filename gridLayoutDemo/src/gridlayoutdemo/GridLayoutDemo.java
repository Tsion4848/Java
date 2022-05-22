package gridlayoutdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends Frame {

    int n = 4;
    GridLayoutDemo(){
        setLayout(new GridLayout(n, n));
        setFont(new Font("SansSerif", Font.BOLD, 24));
        
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                int k = i * n + j;
                if (k >= 0){
                    add (new Button("" + k));
                }
            }
        }
        
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
                
                GridLayoutDemo gld = new GridLayoutDemo();
                gld.setSize(300, 300);
                gld.setTitle("Grid Layout");
                gld.setVisible(true);
            }
        });
    }
}
