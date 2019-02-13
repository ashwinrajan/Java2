/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bankproject;

import bank.Person;



/**
 *
 * @author Ashwin Rajan
 */
public class BankApplication {
    
     /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
         
         
         
         Person p1 = new Person("Ashwin","Rajan","48","Cannon Crescent","Brampton","ON","L6Y 4L8","Canada");
         Person p2 = new Person("Akhil","Rajan","48","Cannon Crescent","Brampton","ON","L6Y 4L8","Canada");
         
         
         p2.address.setStreetNum("42");
         
         System.out.println(p1.name.getFirstName());
         System.out.println(p2.name.getFirstName());
         System.out.println(p2.address.getStreetNum());
         System.out.println(p1.address.getStreetName());
         System.out.println(p1.address.getCityName());
         System.out.println(p1.address.getProvinceName());
         
         
         
    }

}
