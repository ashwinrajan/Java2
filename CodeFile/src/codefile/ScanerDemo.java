/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codefile;

/**
 *
 * @author Ashwin Rajan
 */
/*
 * Programmer Name: Asma M Paracha Course Code: PROG24178
 */
import java.util.Scanner;

public class ScanerDemo {

    public static void main(String[] a) {
        Scanner in = new Scanner("Today is 22nd March,2011");
        while (in.hasNext()) {
            System.out.println(in.next());
        }
        in.close();


        System.out.println("********************* Different Delimeter *****************");

        Scanner in2 = new Scanner("Today, is, 22nd, March,2011");
        in2.useDelimiter(",");
        while (in2.hasNext()) {
            if (in2.hasNextBoolean()) {
                System.out.println("The data type is boolean");
            }
            System.out.println(in2.next());
        }
        in2.close();
    }
}
