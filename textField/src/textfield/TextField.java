package textfield;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TextField implements ActionListener {
    
    JTextField jtf;
    JButton reverse;
    JLabel prompt, content;

    TextField(){
        
        JFrame jfrm = new JFrame();
        
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300 , 300);
        
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jtf = new JTextField(10);
        
        jtf.setActionCommand("my text field");
        
        reverse = new JButton("reverse");
        jtf.addActionListener(this);
        reverse.addActionListener(this);
        
        prompt = new JLabel("insert a text");
        content = new JLabel("");
        
        jfrm.add(jtf);
        jfrm.add(reverse);
        jfrm.add(prompt);
        jfrm.add(content);
        
        jfrm.setVisible(true);
              
        }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new TextField();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if (e.getActionCommand().equals("reverse")){
              String org = jtf.getText();
              String rev = "";
             
            for (int i=org.length()-1 ; i>=0 ; i--){
                rev+=org.charAt(i);
            }
            content.setText(rev);
          }
          else
              content.setText("you pressed ENTER: the text you entered is: " + jtf.getText());
    }
}
    