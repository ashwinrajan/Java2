/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sin.project;

import java.util.Scanner;

/**
 *
 * @author Ashwin Rajan
 */
public class SinProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int number;
        int firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit, sixthDigit, seventhDigit, eighthDigit, checkDigit, product, product2 , step5Solution;
        int firstHalf, secondHalf,highestNumber, count=0;

        System.out.println("Enter a 9 digit SIN Num");
        Scanner in;
        in = new Scanner(System.in);
        number = in.nextInt();

        firstDigit = number / 100000000;
        secondDigit = (number % 100000000) / 10000000;
        thirdDigit = (number % 10000000) / 1000000;
        fourthDigit = (number % 1000000) / 100000;
        fifthDigit = (number % 100000) / 10000;
        sixthDigit = (number % 10000) / 1000;
        seventhDigit = (number % 1000) / 100;
        eighthDigit = (number % 100)/10;
        checkDigit = number % 10;

        
        
        secondDigit = secondDigit * 2;
        fourthDigit = fourthDigit * 2;
        sixthDigit = sixthDigit * 2;
        eighthDigit = eighthDigit * 2;

        if (secondDigit > 9) {
            firstHalf = secondDigit / 10;
            secondHalf = secondDigit % 10;

            secondDigit = firstHalf + secondHalf;

        }

        if (fourthDigit > 9) {
            firstHalf = fourthDigit / 10;
            secondHalf = fourthDigit % 10;

            fourthDigit = firstHalf + secondHalf;

        }

        if (sixthDigit > 9) {
            firstHalf = sixthDigit / 10;
            secondHalf = sixthDigit % 10;

            sixthDigit = firstHalf + secondHalf;

        }

        if (eighthDigit > 9) {
            firstHalf = eighthDigit / 10;
            secondHalf = eighthDigit % 10;

            eighthDigit = firstHalf + secondHalf;

        }

        product = firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit + sixthDigit + seventhDigit + eighthDigit;
        product2=product;
        
        while (product2 > 0) {
            count++;
            product2 = product2 - 10;
        }

        highestNumber = count * 10;
        
        step5Solution = highestNumber - product;
        

        if (step5Solution==checkDigit){
            
            System.out.println("This is a valid SIN number");
            
        }
        else{
            
            System.out.println("This is not a valid SIN number");
            
        }

    }
}

