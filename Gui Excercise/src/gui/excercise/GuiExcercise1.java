/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.excercise;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ashwin Rajan
 */
public class GuiExcercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JFrame frame = new JFrame();
        FlowLayout Layout = new FlowLayout();

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(Layout);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        frame.add(panel1);
        frame.add(panel2);


        panel1.add(new JButton("Button1"));
        panel1.add(new JButton("Button2"));
        panel1.add(new JButton("Button3"));
        
        panel2.add(new JButton("Button1"));
        panel2.add(new JButton("Button2"));
        panel2.add(new JButton("Button3"));





    }
}
