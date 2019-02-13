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
public class StringBackward {

    public static void main(String[] args) {
        String s;
        char[] a;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");

        s = in.next();
        a = s.toCharArray();
        /*
         * for(i=a.length-1;i>=0;i--) { System.out.println(a[i]);
        }
         */
//s=new String(a);
//System.out.println(s);
        char ch1, ch2;
        System.out.println("enter the char to search for and the one to replace with");
        s = in.next();
        ch1 = s.charAt(0);
        ch2 = s.charAt(1);
        for (i = 0; i < a.length; i++) {
            if (a[i] == ch1) {
                a[i] = ch2;
            }
        }
        s = new String(a);
        System.out.println(s);
        //for(char value:a)
        // System.out.println(value);*/
    }
}

