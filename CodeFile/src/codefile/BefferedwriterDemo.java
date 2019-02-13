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
import java.io.*;
import java.util.*;

public class BefferedwriterDemo {

    public static void main(String[] args) throws Exception {
        String name;
        Scanner in = new Scanner(System.in);
        name = in.next();
        File f = new File(name);
        PrintWriter fileOut = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));


        // Write formatted output to the file
        fileOut.write("Bob Ford ");
        fileOut.write("560");
        fileOut.write("smith Jones ");
        fileOut.write("85");

        // Close the file
        fileOut.flush();

        fileOut.close();
    }
}
