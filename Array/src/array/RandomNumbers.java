/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashwin Rajan
 */
public class RandomNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();

        int value, key;

        do {
            value = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter a value ,enter -1 to end", "Search",
                    JOptionPane.QUESTION_MESSAGE));
            array.add(new Integer(value));

            array.add(value);

        } while (value != -1);


        key = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Enter a value to search for.", "Search",
                JOptionPane.QUESTION_MESSAGE));

        if (array.contains(key)) {
            System.out.println("the position of the element " + key + "  is   " + array.indexOf(new Integer(key)));
        }


        /*
         * for (int i=0; i<numbers.length; i++) { numbers[i] =
         * (int)(Math.random() * 100 + 1); // for debugging
         * System.out.println(numbers[i]); } int key =
         * Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a value to
         * search for.", "Search", JOptionPane.QUESTION_MESSAGE));
         * Arrays.sort(numbers); int location = Arrays.binarySearch(numbers,
         * key); if (location >= 0) { JOptionPane.showMessageDialog(null, "Value
         * " + key + " found at position " + location + "."); } else {
         * JOptionPane.showMessageDialog(null, "Value " + key + " not found.");
		}
         */

    }
}

