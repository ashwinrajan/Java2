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
public class OutOfBoundExample {

    public static void main(String[] args) {

        int[] array = new int[50];
        int num;
        for (int i = 0; i < 50; i++) {

            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("enter the index of the array ");
        Scanner in;
        in = new Scanner(System.in);

        num=in.nextInt();
        
        try{
            
            System.out.println("Element value is "+array[num]);
        }
        catch(IndexOutOfBoundsException e){
            
            System.out.println("you are accessing an element in an array outside the bounds of the array");
        }


    }
}
