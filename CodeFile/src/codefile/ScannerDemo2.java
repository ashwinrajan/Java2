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
/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.util.Scanner;
import java.io.*;

public class ScannerDemo2 {

    public static void main(String[] args) {
        Scanner in = null;
        File f = new File("c:\\prog24178\\MultiListener.java");
        try {
            in = new Scanner(f);

            while (in.hasNext()) {
                System.out.println(in.next());
            }
        } catch (IOException e) {
            System.out.println("File does not exists");

        } finally {
            in.close();
        }
    }
}
