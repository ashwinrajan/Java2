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

/**
 *
 * @author Ashwin Rajan
 */
public class ArraySort {

    public static void main(String[] args) {

        int[] num = {3, 4, 5, 12, 34, 77, 5, 6, 9, 10, 1};


        Arrays.sort(num);
        for (int i : num) {
            System.out.println(i);
        }


    }
}

