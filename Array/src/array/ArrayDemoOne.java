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
public class ArrayDemoOne {

    public static void main(String[] args) {
//variable declaration
        double[] mark;
        double sum = 0.0;
        int no;
        double high = 0.0;
        System.out.println(mark);
        Scanner in = new Scanner(System.in);
        // Taking Input       
        System.out.println("how many marks u want to enter");

        no = in.nextInt();

        mark = new double[no];

        for (int i = 0; i < mark.length; i++) //input values from the user
        {
            // mark[i]=Math.random();
            System.out.println("Enter a number:");
            mark[i] = in.nextDouble();
            sum += mark[i];
        }
        //finding the highest number
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] > high) {
                high = mark[i];
            }
        }

        //second for to calculate the avg
        // System.out.println("The average of the given numbers is"+sum/no);

        System.out.println("The highest marks entered by the user:" + high);

        System.out.println(mark);
        

    }
}
