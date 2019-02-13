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
public class KeyEventDemo extends JFrame {

    private JPanel jp;
    private JTextField jtf;

    public KeyEventDemo() {
        jp = new JPanel();
        jtf = new JTextField(12);
        jp.add(jtf);
        add(jp);
        jtf.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
            }
        });
    }

    public static void main(String[] args) {
        KeyEventDemo frame = new KeyEventDemo();
        frame.setTitle("KeyEventDemo");
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}
