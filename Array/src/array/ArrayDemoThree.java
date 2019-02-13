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
public class ArrayDemoThree {

    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS = 10;
        double[] marks;// Array declaration
        marks = new double[NUMBER_OF_ELEMENTS];// Array Creation
        double avg;
        double sum = 0.0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            System.out.printf("Enter a number");
            marks[i] = in.nextDouble();
            sum += marks[i];  //sum=sum+marks[i];

        }

        //arrayname.length;
        avg = sum / NUMBER_OF_ELEMENTS;
        System.out.printf("The average of the four number is %5.2f :", avg);
        int count = 0;
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            if (marks[i] < avg) {
                count++;
            }
        }
        System.out.printf(" \n Number of elements below average are %d", count);

    }
}

