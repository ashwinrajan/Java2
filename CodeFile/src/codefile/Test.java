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

public class Test{
    public static void main(String[]a)throws Exception
    {
        java.io.PrintWriter output=new java.io.PrintWriter("temp.txt");
        output.printf("amount is %f %e\r\n",32.32,32.32);
        output.printf("amount is %5.4f %5.4e\r\n",32.32,32.32);
        output.printf("%6b\r\n",(1<2));
        output.printf("%6s\r\n","Java");
        output.close();

    }
}