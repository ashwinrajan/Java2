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

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ashwin Rajan
 */
public class GuiExcersise4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Checker Board");
        GridLayout layout = new GridLayout(8, 8);


        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(layout);
        
        JButton[][] button = new JButton[8][8];

        for (int i = 0; i < button.length; i++) {

            

            for (int j = 0; j < button.length; j++) {

                frame.add(button[i][j] = new JButton());
                if (i % 2 == 0 && j % 2 == 0) {
                    button[i][j].setBackground(Color.BLACK);
                    
                } else if (i % 2 == 1 && j % 2 == 1) {
                    button[i][j].setBackground(Color.BLACK);
                    
                } else {
                    button[i][j].setBackground(Color.WHITE);
                }
            }


        }
        
    }
}
