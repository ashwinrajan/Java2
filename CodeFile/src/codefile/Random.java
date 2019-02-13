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
import java.util.*;
import java.io.*;

public class Random {

    public static void main(String[] args) throws Exception {
        // Check if source file exists
        File file = new File("random.txt");
        if (!file.exists()) {
            // Create the file
            PrintWriter output = new PrintWriter(file);
            for (int i = 1; i <= 100; i++) {
                output.print((int) (Math.random() * 100) + " ");
            }
            output.close();
        }

        Scanner input = new Scanner(file);
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
            numbers[i] = input.nextInt();
        }

        // Arrays.sort(numbers);

        for (int i = 0; i < 100; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
