package swingborderlayout;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingBorderLayout {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        JLabel l1 = new JLabel("Element1");
        JLabel l2 = new JLabel("Element2");
        JLabel l3 = new JLabel("Element3");
        JLabel l4 = new JLabel("Element4");
        JLabel l5 = new JLabel("Element5");
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(20, 20));
        
        f.add(l1,BorderLayout.NORTH);
        f.add(l2,BorderLayout.SOUTH);
        f.add(l3,BorderLayout.WEST);
        f.add(l4,BorderLayout.EAST);
        f.add(l5,BorderLayout.CENTER);
        
        f.setSize(500,500);
        
        f.setVisible(true);
    }
    
}
