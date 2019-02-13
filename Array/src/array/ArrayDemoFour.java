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
public class ArrayDemoFour {

    public static void main(String[] args) {
        int size;
        double[] marks;// Array declaration
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of elements you want");
        size = in.nextInt();
        marks = new double[size];// Array Creation
        double avg;
        double sum = 0.0;
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Enter a number");
            marks[i] = in.nextDouble();
            sum += marks[i];  //sum=sum+marks[i];

        }
        avg = sum / size;
        System.out.printf("The average of the numbers is %5.2f :", avg);
        int count = 0;
        // Printing all the numbers using Enhanced For Loop
        System.out.println("Marks Entered are");

        for (double i : marks) {
            System.out.println(i);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }




        for (int i = 0; i < size; i++) {
            if (marks[i] < avg) {
                marks[i] = marks[i] + 5;
            }
            count++;
        }
        System.out.printf(" \n Number of elements below average are %d", count);

    }
}

