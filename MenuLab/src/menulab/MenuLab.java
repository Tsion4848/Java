package menulab;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MenuLab implements ActionListener, ItemListener {
    JTextField tf1, tf2, tf3, tf4, tf5;
    JRadioButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JCheckBox c1, c2, c3, c4;
    JTextArea ta;
    JButton jbtn;
    String str1 = "";
    String str2 = "";
    String str3 = "";
    String str4 = "";
//    JComboBox<String> m;
//    JComboBox<String> d;
//    String [] month = {"January", "February", "March", "April", "May", "June", "July", "Augest", "September", "October", "November", "December"};
   MenuLab(){
       JFrame jfrm = new JFrame("Menu");
       jfrm.setLayout(null);
       jfrm.setSize(500, 700);
       jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JMenuBar jmb = new JMenuBar();
       
       JMenu jmFile = new JMenu("File");
       JMenuItem jmSave = new JMenuItem("Save");
       jmFile.add(jmSave);
       JMenu jmEdit = new JMenu("Edit");
       JMenu jmView = new JMenu("View");
       JMenu jmMain = new JMenu("Main");
       JMenuItem it1 = new JMenuItem("Sub1");
       JMenuItem it2 = new JMenuItem("Sub2");
       jmMain.add(it1);
       jmMain.add(it2);
              
       jmb.add(jmFile);
       jmb.add(jmEdit);
       jmb.add(jmView);
       jmb.add(jmMain);
                     
       l1 = new JLabel("First Name");
       tf1 = new JTextField(15);
       l1.setBounds(10,10,100,30);
       tf1.setBounds(100, 10, 200, 30);
       
       l2 = new JLabel("Last Name");
       tf2 = new JTextField(15);
       l2.setBounds(10, 50, 100, 30);
       tf2.setBounds(100, 50, 200, 30);
       
       l3 = new JLabel("Date");
       tf3 = new JTextField(15);
       l3.setBounds(10, 90, 100, 30);
       tf3.setBounds(100, 90, 200, 30);
       
       l7 = new JLabel("Month");
       tf4 = new JTextField(15);
       l7.setBounds(10, 130, 100, 30);
       tf4.setBounds(100, 130, 200, 30);
       
       l8 = new JLabel("Year");
       tf5 = new JTextField(15);
       l8.setBounds(10, 170, 100, 30);
       tf5.setBounds(100, 170, 200, 30);
       
       l4 = new JLabel("Gender");
       b1 = new JRadioButton("Male");
       b2 = new JRadioButton("Female");
       ButtonGroup bg = new ButtonGroup();
       bg.add(b1);
       bg.add(b2);
       l4.setBounds(10, 210, 50, 30);
       b1.setBounds(70, 210, 60, 30);
       b2.setBounds(130, 210, 100, 30);
       
       l5 = new JLabel("Hobby");
       c1 = new JCheckBox("Reading");
       c2 = new JCheckBox("Writing");
       c3 = new JCheckBox("Watching");
       c4 = new JCheckBox("Riding By");
       
       l5.setBounds(10, 250, 50, 30);
       c1.setBounds(70, 250, 80, 30);
       c2.setBounds(70, 290, 80, 30);
       c3.setBounds(150, 250, 130, 30);
       c4.setBounds(150, 290, 130, 30);
       
       jbtn = new JButton("Submit");
       jbtn.setBounds(100, 330, 100, 30);
       
       l6 = new JLabel("Text Area");
       ta = new JTextArea();
       l6.setBounds(10, 370, 100, 30);
       ta.setBounds(10, 400, 400, 200);
       
       jbtn.addActionListener(this);
       c1.addItemListener(this);
       c2.addItemListener(this);
       c3.addItemListener(this);
       c4.addItemListener(this);
       jmSave.addActionListener(this);
       
       jfrm.setJMenuBar(jmb);
       jfrm.add(l1);
       jfrm.add(tf1);
       jfrm.add(l2);
       jfrm.add(tf2);
       jfrm.add(l3);
       jfrm.add(tf3);
       jfrm.add(l7);
       jfrm.add(tf4);
       jfrm.add(l8);
       jfrm.add(tf5);
       jfrm.add(l4);
       jfrm.add(b1);
       jfrm.add(b2);
       jfrm.add(l5);
       jfrm.add(c1);
       jfrm.add(c2);
       jfrm.add(c3);
       jfrm.add(c4); 
       jfrm.add(jbtn);
       jfrm.add(l6);
       jfrm.add(ta);
       
       jfrm.setVisible(true);       
   }
   public void itemStateChanged(ItemEvent ie){
       //JCheckBox cb = (JCheckBox) ie.getItem();
       if (c1.isSelected()){
           str1="Reading, ";
       }
       if (c2.isSelected()){
           str2="Writing, ";
       }
       if (c3.isSelected()){
           str3="Watching, ";
       }
       if (c4.isSelected()){
           str4="Riding By, ";
       }
       
   }
   
    @Override
   public void actionPerformed(ActionEvent ae){
       String s = "";
       String text = "";
       int i;
       char [] readStr = new char[50];
       String save = ae.getActionCommand();
       FileOutputStream out;
       ObjectOutputStream objOut;
//       FileInputStream in;
//       ObjectInputStream objIn;
       
               
        if (save.equals("Save")){
//           try{
//            out = new FileOutputStream("menuBar.dat");
//            objOut = new ObjectOutputStream(out);
//            
//            text = ta.getText();
//            objOut.writeUTF(text);
//            //objOut.writeChars(text);
//            
//            objOut.flush();
//            objOut.close();
//            }
//        catch(IOException exc){
//            exc.getMessage();
//            }

            try{
                PrintWriter pw = new PrintWriter("menuBar.dat");
                text = ta.getText();
                pw.format(text);
                pw.flush();
                pw.close();
            }
            catch(IOException exc){
              exc.getMessage();
              }
        } 
        
        System.out.println();
        try(FileInputStream fin = new FileInputStream("menuBar.dat")){
             while((i = fin.read()) != -1){
                 System.out.print((char) i);
             }
        }
        catch(IOException exc){
         exc.getMessage();
        }
        
//        try(FileInputStream fin = new FileInputStream("menuBar.dat")){
//            PrintWriter wr = null;
//            wr = new PrintWriter(System.out, true);
//             while((i = fin.read()) != -1){
//                wr.printf("the data you entered is:%c" +  (char)i);
//                wr.flush();
//                wr.close();
//                fin.close();
//             }
//        }
//        catch(IOException exc){
//         exc.getMessage();
//        }

              


       
       if(b1.isSelected()){
           s = "Male";
       }
       if(b2.isSelected()){
           s = "Female";
       }
       ta.setText(tf1.getText().concat("\n" + tf2.getText()).concat("\n" + tf3.getText()).concat("\n" + tf4.getText()).concat("\n" + tf5.getText()).concat("\n" + s).concat("\n" + str1).concat(str2).concat(str3).concat(str4));
       
   }
   
    public static void main(String[] args) throws IOException {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new MenuLab();
            }
        });        
    }        
}
