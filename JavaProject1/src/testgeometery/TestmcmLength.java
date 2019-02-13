/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testgeometery;

/**
 *
 * @author Ashwin Rajan
 */
public class TestmcmLength {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        McmLength l1 = new McmLength((int) (Math.random() * 999), (int) (Math.random() * 999), (int) (Math.random() * 999));
        McmLength l2 = new McmLength((int) (Math.random() * 999), (int) (Math.random() * 999), (int) (Math.random() * 999));
        //adding
        System.out.println("Adding l1 and l2 equals ");
        McmLength add = l1.add(l2);

        //subtract
        System.out.println("Subtracting l1 and l2 equals ");
        McmLength subtract = l1.subtract(l2);

        //multiply
        System.out.println("Multiplying l1 and l2 equals ");
        McmLength multiply = l1.multiply(l2);

        //divide
        int divide = l1.divide(l2);
        System.out.println("Dividing l1 and l2 equals to " + divide);

    }
}
