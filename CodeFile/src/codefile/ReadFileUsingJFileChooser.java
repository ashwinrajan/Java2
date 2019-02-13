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
import javax.swing.JFileChooser;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import javax.swing.SwingUtilities;

public class ReadFileUsingJFileChooser {

    public static void main(String[] args) throws Exception {

        File f = new File("c:\\prog24178\\book\\book");  //it should encapsulate a directory
        JFileChooser fileChooser = new JFileChooser(f);

        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            // Get the selected file
            java.io.File file = fileChooser.getSelectedFile();  // returns a file name

            // Create a Scanner for the file
            Scanner input = new Scanner(file);

            // Read text from the file
            while (input.hasNext()) {
                System.out.println(input.nextLine());
            }

            // Close the file
            input.close();
        } else {
            System.out.println("No file selected");
        }
    }
}
