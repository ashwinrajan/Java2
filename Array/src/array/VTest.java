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

/**
 *
 * @author Ashwin Rajan
 */
public class VTest {

    public static void main(String[] args) {
        int[] i = {1, 1, 1};
        for (int j = 0; j < 3; j++) {
            System.out.println("Value of i before the method call:"
                    + " " + i[j]);
        }

        methoda(i);
        for (int j = 0; j < 3; j++) {
            System.out.println("Value of i after the method call:"
                    + " " + i[j]);
        }
    }

    public static void methoda(int[] i) {
        for (int j = 0; j < i.length; j++) {
            i[j]++;
        }

    }
}
