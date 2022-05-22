package treedemo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class TreeDemo {
    JLabel jlab;
    TreeDemo(){
        JFrame jfrm = new JFrame("Image Button");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(300,300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("options");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);
        
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("a1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("a2");
        a.add(a2);
        
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);
        
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("b1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("b2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("b3");
        b.add(b3);
        
        JTree tree = new JTree(top);
        JScrollPane jsp = new JScrollPane(tree);
        
        jlab = new JLabel();
        
        jfrm.add(jlab, BorderLayout.SOUTH);
        jfrm.add(tree);
        
        tree.addTreeSelectionListener(new TreeSelectionListener(){
            public void valueChanged(TreeSelectionEvent tse){
                jlab.setText("Selection is " + tse.getPath());
            }
        });
        jfrm.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
               new TreeDemo();
            }
        });
    }
    
}
