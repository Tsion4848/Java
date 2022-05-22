package textfieldlist;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
 
public class TextfieldList {
  
   private DefaultListModel model;
   private JList list;
   private JTextField jtf;
   
     TextfieldList() {
      JFrame jfrm = new JFrame();              
              
      jfrm.setTitle("JTextfieldToJList Test");
      model = new DefaultListModel();
      jtf = new JTextField("Type something and Hit Enter");
      jtf.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent me) {
            jtf.setText("");
         }
      });
      list = new JList(model);
      list.setBackground(Color.lightGray);
      jtf.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
            model.addElement(jtf.getText());
            //JOptionPane.showMessageDialog(null, jtf.getText());
            //jtf.setText("Type something and Hit Enter");
         }
      });
      jfrm.add(jtf,BorderLayout.NORTH);
      jfrm.add(new JScrollPane(list),BorderLayout.CENTER);
      jfrm.setSize(375, 250);
      jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jfrm.setLocationRelativeTo(null);
      jfrm.setVisible(true);
   }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new TextfieldList();
            }
        });
    }   
}