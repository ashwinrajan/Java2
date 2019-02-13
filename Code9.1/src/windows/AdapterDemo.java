/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author Ashwin Rajan
 */
public class AdapterDemo extends JFrame {

    public static void main(String[] args) {
        AdapterDemo frame = new AdapterDemo();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("AdapterDemo");
        frame.setSize(220, 80);
        frame.setVisible(true);
    }

    public AdapterDemo() {
        addWindowListener(new WindowAdapter() {

            public void windowActivated(WindowEvent event) {
                System.out.println("Window activated");
            }
        });
    }
}
