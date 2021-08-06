package swingborderlayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Ankur-Agg
 */
public class BorderLayoutDemo
 {
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        f.add(new JButton("This is across the top."), BorderLayout.NORTH);
        f.add(new JLabel("The footer message might go here."), BorderLayout.SOUTH);
        f.add(new JButton("Right"), BorderLayout.EAST);
        f.add(new JButton("Left"), BorderLayout.WEST);
        String msg = "The reasonable man adapts";
        f.add(new JTextArea(msg), BorderLayout.CENTER);
        f.setSize(400,400);
        f.setVisible(true);
    }

}
