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
public class VowelsCount {

    public static void main(String[] args) {

        String[] array1 = new String[10];
        System.out.println("enter 10 Character");

        for (int i = 0; i < 10; i++) {

            System.out.println("Character " + (i + 1));
            Scanner in;
            in = new Scanner(System.in);


            array1[i] = in.nextLine();

        }
        
        System.out.println("Number of vowels are "+vowelsCount(array1));

    }

    public static int vowelsCount(String[] array1) {
        int count = 0;
        String character;
        
        for (int i = 0; i < array1.length; i++) {
           character=array1[i];
            if ("a".equals(character) || "e".equals(character) || "i".equals(character) || "o".equals(character) || "u".equals(character)) {
                count++;
            }
        }


        return count;

    }
}
