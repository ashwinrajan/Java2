/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acronym;

/**
 *
 * @author Ashwin Rajan
 */
import javax.swing.JOptionPane;

public class Acronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String letter = " ";

        String input = JOptionPane.showInputDialog(null, "Please Enter Three Or More Words", "");
        letter += input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {

                letter += input.charAt(i + 1);

            }
        }

        letter = letter.toUpperCase();

        if (letter.length() < 4) {

            JOptionPane.showMessageDialog(null, " Please Enter Three Or More Words ");
        } 
        else {

            String output = "Original name was " + input + "\n Three letter acronym is " + letter;
            JOptionPane.showMessageDialog(null, output);
        }

    }
}
