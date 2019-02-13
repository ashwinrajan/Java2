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
public class TestVariablePass {

    public static void main(String[] args) {
        int[] i = {1, 1, 1, 1};
        System.out.println("Before the method:");
        for (int value : i) {
            System.out.println(value);
        }
        inc(i[0]);
        System.out.println("After the method:");
        for (int value : i) {
            System.out.println(value);
        }
    }

    public static void inc(int array) {
        //for(int j=0;j<array.length;j++)
        array++;

    }
}
