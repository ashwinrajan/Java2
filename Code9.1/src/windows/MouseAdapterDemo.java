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

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ashwin Rajan
 */
public class MouseAdapterDemo extends JFrame {

    private JPanel jp;
    private JButton jbt;

    public MouseAdapterDemo() {
        jp = new JPanel();
        jbt = new JButton("I am push button");

        jbt.addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseDragged(MouseEvent e) {
                System.out.println("Hello");
            }
        });
        jp.add(jbt);
        add(jp);

        jp.addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseDragged(MouseEvent e) {
                System.out.println("HI I am the Panel");
            }
        });



    }

    public static void main(String[] args) {
        MouseAdapterDemo frame = new MouseAdapterDemo();
        frame.setTitle("MouseMotionDemo");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);

    }
}
