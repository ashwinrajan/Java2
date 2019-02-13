/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package turner;

/**
 *
 * @author Ashwin Rajan
 */
public class DemoTurners {
    
     public static void main(String[] args) {
        // TODO code application logic here
         
         Turner turnLeaf = new Leaf();
         Turner turnPage = new Page();
         Turner turnPancake = new Pancake();
         
         turnLeaf.turn();
         turnPage.turn();
         turnPancake.turn();
         
         
    }

}
