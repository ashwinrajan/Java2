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

/**
 *
 * @author Ashwin Rajan
 */
public class TestArrayPassing {

    public static void main(String[] args) {


        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = 1;
        }

        int[] b = new int[3];
        for (int i = 0; i < 3; i++) {
            b[i] = 1;
        }

        System.out.println("Array a before method call");
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array b before method call");
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }
        method(a, b);



        System.out.println("Array a after method call");
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Array b after method call");
        for (int i = 0; i < 3; i++) {
            System.out.println(b[i]);
        }


    }

    public static void method(int[] a, int[] b) {
        for (int i = 0; i < 3; i++) {
            a[i]++;
            b[i]--;
        }

    }
}

