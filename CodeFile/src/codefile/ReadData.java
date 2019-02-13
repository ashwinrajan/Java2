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
import java.util.Scanner;
import java.io.File;

public class ReadData {

    public static void main(String[] args) throws Exception {
        // Create a File instance
        File file = new File("c:\\24178Code\\File\\src\\file\\ReadDemo.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);
        //int firstName=0;
        //Read data from a file
        String firstName = null;
        int score = 0;
        String lastName = null;
        while (input.hasNext()) {
            firstName = input.next();
            lastName = input.next();
            score = input.nextInt();
            System.out.println(firstName + " " + lastName + " " + score);
        }

        // Close the file
        input.close();
    }
}
