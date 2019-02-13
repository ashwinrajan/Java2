/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package handle.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Ashwin Rajan
 */
public class HandleEvent {

    public static void main(String[] args) {
        // create frame and set its size and title
        JFrame frame = new JFrame();
        frame.setTitle("Handle Event");
        frame.setSize(200, 150);

        // Create a panel to hold buttons
        JPanel panel = new JPanel();

        JButton jbtOK = new JButton("OK");
        JButton jbtCancel = new JButton("Cancel");

        panel.add(jbtOK);
        panel.add(jbtCancel);

        frame.add(panel); // Add panel to the frame

        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Register listeners
        OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();
        jbtOK.addActionListener(listener1);
        jbtCancel.addActionListener(listener2);
    }
}

class OKListenerClass implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("OK button clicked");
    }
}

class CancelListenerClass implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel button clicked");
    }
}
