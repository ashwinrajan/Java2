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
public class ArrayCopy {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        System.out.println("array1");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("array2");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


        methodcopy(array1, array2);

        System.out.println("After the method call");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("array2");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }

    public static void methodcopy(int[] array1, int[] array2) {
        array2 = array1;

        /*
         * for(int i=0;i<5;i++) { array1[i]=1; array2[i]=2;
         *
         * }
         */
    }
}
