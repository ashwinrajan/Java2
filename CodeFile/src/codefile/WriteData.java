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

public class WriteData {

    public static void main(String[] args) throws Exception {

        File file = new File("lecturedemowrite.txt");

        // to make sure i dont overwrite the contents of an already existing file

        if (file.exists()) {
            System.out.println("File already exists");
        }
        PrintWriter myoutput = new PrintWriter(file);
        writeMethod(myoutput);
        System.exit(0);
    }

    // Create a file
    public static void writeMethod(PrintWriter myoutput) {

        // Write formatted output to the file
        myoutput.print("java");
        myoutput.println("programming");
        myoutput.print("good");
        myoutput.println("good");
        myoutput.checkError();
        myoutput.close();
    }
}
