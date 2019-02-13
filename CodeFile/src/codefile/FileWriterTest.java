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

public class FileWriterTest {

    public static void main(String[] args) throws Exception {
        File file = new File("demoFileWrite.txt");

        FileWriter myoutput = new FileWriter(file, true);

        // Write formatted output to the file
        myoutput.write("java ");
        myoutput.write("programming");
        myoutput.write("good");
        myoutput.write("good");

        myoutput.close();
    }
}
