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

public class TestFleClass {

    public static void main(String[] args) {

        try {
            File file = new File("c:\\TESTFILE.txt");

            //   File    f = new File("c:\\prog24178");
            //    File f2  =new File (f,"Menus.docx");
            //   File f3 =new File("c:\\prog24178","Menus.docx");
            System.out.println("The file exists " + file.exists());
            System.out.println("The file has " + file.length() + " bytes");
            System.out.println("Can it be read? " + file.canRead());
            System.out.println("Can it be written? " + file.canWrite());
            System.out.println("Is it a directory? " + file.isDirectory());
            System.out.println("Is it a file? " + file.isFile());
            System.out.println("Is it absolute? " + file.isAbsolute());
            System.out.println("Is it hidden? " + file.isHidden());
            System.out.println("Absolute path is "
                    + file.getAbsolutePath());
            System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
            System.out.println("Canonical path is "
                    + file.getCanonicalPath());
            // System.out.println(file.delete());

        } catch (IOException e) {

            System.out.println("File not found");
        }


    }
}
