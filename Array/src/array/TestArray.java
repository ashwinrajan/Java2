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
public class TestArray {

    public static void main(String[] a) {
        int[] list1 = {1, 2};
        int[] list2 = {3, 4};

        list1 = list2;
        for (int i = 0; i < 2; i++) {
            list1[i]++;
            System.out.println("list1:" + list1[i] + " list2:" + list2[i]);
        }
        int[] list3 = {1, 2};
        int[] list4 = {3, 4};

        for (int i = 0; i < 2; i++) {
            list4[i] = list3[i];
        }
        for (int i = 0; i < 2; i++) {
            list4[i]++;
            System.out.println("list3:" + list3[i] + " "
                    + "list4:" + list4[i]);
        }
    }
}

