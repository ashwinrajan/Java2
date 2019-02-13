/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example extends JFrame {

    JButton jbtred = new JButton("Red");
    JButton jbtblue = new JButton("Blue");
    JButton jbtgreen = new JButton("Green");
    JTextField jtf = new JTextField("Hello");
    RedListener l1 = new RedListener();
    BlueListener l2 = new BlueListener();
    GreenListener l3 = new GreenListener();

    public Example() {
        setSize(400, 400);
        setTitle("My test Frame");
        setLocation(10, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 4));
        add(jtf);
        add(jbtred);
        add(jbtblue);
        add(jbtgreen);
        jbtred.addActionListener(l1);
        jbtgreen.addActionListener(l3);
        jbtblue.addActionListener(l2);
        setVisible(true);


    }

    public static void main(String[] args) {
        Example myframe = new Example();
    }

    private class RedListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            jtf.setBackground(Color.RED);
        }
    }

    private class BlueListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            jtf.setBackground(Color.BLUE);
        }
    }

    private class GreenListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            jtf.setBackground(Color.GREEN);
        }
    }
}
