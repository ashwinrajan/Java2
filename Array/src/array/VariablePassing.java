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
public class VariablePassing {

    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 2;

        System.out.println("a before method call" + a + "b before"
                + " method call" + b);
        method(a, b);
        System.out.println("a after method call" + a
                + "b after method call" + b);
    }

    public static void method(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;

        System.out.println("in method: a is " + a + " b is:" + b);
    }
}
