package listdemo;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class ListDemo implements ListSelectionListener{
    
    JLabel jlab;
    JList<String> list;
    JScrollPane scroll;
    
    String names[] = {"Tsion" , "selina" , "Ema" , "Father" , "esked" , "bro" , "sis"};
    
    ListDemo(){
        
        JFrame jfrm = new JFrame();
        
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300 , 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jlab = new JLabel("Choose a name");
        list = new JList<String>(names);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        scroll = new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(200 , 100));
        
        list.addListSelectionListener(this);
        
        jfrm.add(scroll);
        jfrm.add(jlab);
        
        jfrm.setVisible(true);
        
    }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
            new ListDemo();   
            }
        });
    }
    
    public void valueChanged(ListSelectionEvent e){
        int [] idx = list.getSelectedIndices();
        String str = "";
       
        if (idx[0] != -1){
            //for (int i=idx[0] ; i<=idx.length ; i++)
            str+=list.getSelectedValuesList();
            jlab.setText("you have selected " + str + " , ");
        }
        else
            jlab.setText("please choose a name");
     
    }
    
}