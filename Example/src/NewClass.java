/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ashwin Rajan
 */
public class NewClass {

    public static void main(String[] args) {
        String string;
        String replace;


        
        Scanner in = null;
        File file = new File("File.txt");
        try {

            in = new Scanner(file);

            while (in.hasNext()) {
                string=in.nextLine();
            }

            in.close();

        } catch (IOException e) {
            System.out.println("File not found");

        }
        
        System.out.println("enter the text that you need to search");
        Scanner input;
        input = new Scanner(System.in);
        string = input.nextLine();
        System.out.println("enter the text with which to replace");

        input = new Scanner(System.in);

        replace = input.nextLine();
        
        FileWriter myinput = null;
                try {

                    File file1 = new File("File.txt");
                    myinput = new FileWriter(file1, true);

                    // Write formatted output to the file
                    myinput.write(search(string,replace));
                    myinput.close();


                } catch (IOException ex) {
                    System.out.println("The string is not found");
                } finally {
                    try {
                        myinput.close();
                    } catch (IOException ex) {
                        System.out.println("The string is not found");
                    }
                }


        
    }

    public static String search(String string, String replace) {
        
        return string.replace(string, replace);
        
    }
}
