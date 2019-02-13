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

public class TestRandomAccessFile {
  public static void main(String[] args) throws IOException {
    // Create a random access file
    RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");

    // Clear the file to destroy the old contents if exists
    inout.setLength(0);

    // Write new integers to the file
    
      inout.writeUTF("hello \n nello");

    //Display the current length of the file
    System.out.println("Current file length is " + inout.length());

    // Retrieve the first number
    inout.seek(0); // Move the file pointer to the beginning
    System.out.println("The first number is " + inout.readInt());

    // Retrieve the second number
    inout.seek(1 * 4); // Move the file pointer to the second number
    System.out.println("The second number is " + inout.readInt());

    // Retrieve the tenth number
    inout.seek(9 * 4); // Move the file pointer to the tenth number
    System.out.println("The tenth number is " + inout.readInt());

    // Modify the eleventh number
    inout.writeInt(555);

    // Append a new number
    inout.seek(inout.length()); // Move the file pointer to the end
    inout.writeInt(999);

    // Display the new length
    System.out.println("The new length is " + inout.length());

    // Retrieve the new eleventh number
    inout.seek(10 * 4); // Move the file pointer to the eleventh number
    System.out.println("The eleventh number is " + inout.readInt());


  
    inout.close();
  }
}

