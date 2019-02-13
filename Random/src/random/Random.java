/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Ashwin Rajan
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        int[] num = new int[100];
        File file = new File("random.txt");
        PrintWriter myoutput = new PrintWriter(file);
        for (int i = 0; i <= 99; i++) {

            num[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i <= 99; i++){
            
            myoutput.println(num[i]);
            
        }

        myoutput.checkError();
        myoutput.close();
        
        

       


       
    }

   
}
