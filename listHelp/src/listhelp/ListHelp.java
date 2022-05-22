package listhelp;

import java.awt.*;
import static java.awt.FlowLayout.CENTER;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ListHelp implements ListSelectionListener , ActionListener{
    
    DefaultListModel model;
    JLabel jlab;
    JList<String> list , list2;
    JScrollPane scroll,scroll2;
    JTextField tf1;
    JButton jbtn1;
//    JButton jbtn2;
    
    String names[] = {"if" , "if...else" , "switch" , "for" , "do...while"};
    
    
    ListHelp(){
        
        JFrame jfrm = new JFrame("Help GUI");
        
        jfrm.setLayout(new FlowLayout(CENTER , 30 , 20));
        jfrm.setSize(400 , 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Font fon=new Font("Sans Serif" , Font.BOLD , 16);
        Color col=new Color(255, 204, 255);
        
        jbtn1 =new JButton("add");
        jbtn1.addActionListener(this);
//        jbtn2 =new JButton("from textfield");
//        jbtn2.addActionListener(this);
        
        
        model = new DefaultListModel();
        
        jlab = new JLabel("choose the item you want to get the syntax of");
               
        list = new JList (names);
        scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(100 , 200));       
        
        list.setFont(fon);
        list.setBackground(col);
        list.setForeground(new Color(0, 143, 179));
        
        
        jlab.setForeground(new Color(0, 128, 0));
        jlab.setFont(new Font("Sans Serif" , Font.BOLD , 18));
        
        
        list2 = new JList(model);
        scroll2 = new JScrollPane(list2);
        scroll2 .setPreferredSize(new Dimension(100 , 200));
        
        list2.setFont(fon);
        list2.setBackground(new Color(0, 143, 179));
        list2.setForeground(col);
        
        
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);
        //jbtn1.addActionListener(this);
        
        
        
        tf1 = new JTextField(10);
        
//        tf1.addMouseListener(new MouseAdapter() {
//         @Override
//         public void mouseClicked(MouseEvent me) {
//            tf1.setText("");
//         }
//      });
//        tf1.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent event) {
//            //if (jbtn2.getActionCommand().equals("from textfield")){
//                model.addElement(tf1.getText());
//                //JOptionPane.showMessageDialog(null, jtf.getText());
//                //jtf.setText("Type something and Hit Enter");
//         }
//      });             
                     
        jfrm.add(scroll);
        jfrm.add(jlab);
        jfrm.add(tf1);
        jfrm.add(jbtn1);
        jfrm.add(scroll2);
        //jfrm.add(jbtn2);
        jfrm.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
               new ListHelp();
            }
        });
    }
    
    
   
    
    @Override
    public void valueChanged(ListSelectionEvent e){
        
        //if (jbtn1.getActionCommand().equals("from list")){
        switch(list.getSelectedValue()){                     
            case "if":
                jlab.setText("<html>if (condition){ <br> Statement; <br> }</html>");
                break;
            case "if...else":
                jlab.setText("<html> if(condition){ <br> Statement1; <br> } <br> else{ <br> Statement2 <br> }</html>");
                break;
            case "switch":
                jlab.setText("<html> switch(operation){ <br> case: <br> statement; <br> break; <br> ... <br> default action;</html>");
                break;
            case "for":
                jlab.setText("<html> for (initialization ; condition ; increment){ <br> statement; <br> } </html>");
                break;
            case "while":
                jlab.setText("<html> initialization; <br> while(condition){ <br> statement; <br><br> increment; <br> } </html>");
                break;
            case "do...while":
                jlab.setText("<html> do{ <br> Statement; <br> }while(condition); ");
                break;
            default:
                jlab.setText("please choose");
        }
    }
    @Override
     public void actionPerformed(ActionEvent e){
             if (e.getActionCommand().equals("add")){
                 //tf1.setText("");
                 model.addElement(tf1.getText());
             }
       }
}