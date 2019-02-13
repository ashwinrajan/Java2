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

import java.util.Scanner;

/**
 *
 * @author Ashwin Rajan
 */
public class PassTwoDimensionalArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and "
                + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m.length; i++) {
            sum(m[i]);
        }
    }

    public static void sum(int[] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {

            total += m[row];

        }

        System.out.println(total);
    }
}

