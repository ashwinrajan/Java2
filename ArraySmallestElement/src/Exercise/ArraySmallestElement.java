/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Ashwin Rajan
 */
public class ArraySmallestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] array1 = new double[10];
        System.out.println("enter 10 number");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("numbers "+ (i+1));
            Scanner in;
            in = new Scanner(System.in);

            
            array1[i] = in.nextDouble();

        }
        System.out.println("Smallest number is in Element "+indexOfSmallestElement(array1));

        

    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int indexNum=0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                indexNum=i;
            }

        }

        return indexNum;

    }
}
