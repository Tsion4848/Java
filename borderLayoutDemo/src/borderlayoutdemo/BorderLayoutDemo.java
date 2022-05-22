package borderlayoutdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame {

    BorderLayoutDemo(){
        
        add(new Button("top"), BorderLayout.NORTH);
        add(new Label("footer"), BorderLayout.SOUTH);
        add(new Button("right"), BorderLayout.EAST);
        add(new Button("left"), BorderLayout.WEST);
        setBackground(Color.CYAN);
        
        String msg = "The reasonable man adapts " + 
                    "himself to the world;\n" + 
                    "the unreasonable one persists in " + 
                    "trying to adapt the world to himself.\n" + 
                    "Therefore all progress depends " + 
                    "on the unreasonable man.\n\n" + 
                    " - George Bernard Shaw\n\n";
        
        
        add(new TextArea(msg), BorderLayout.CENTER);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public Insets getInsets(){
            return new Insets(20, 20, 20, 20);
        }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                BorderLayoutDemo bld = new BorderLayoutDemo();
                bld.setTitle("border layout");
                bld.setSize(300, 220);
                bld.setVisible(true);
            }
        });
    }
}
