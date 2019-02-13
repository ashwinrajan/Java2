/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz_ashwinrajan;

/**
 *
 * @author Ashwin Rajan
 */
public class TestPizza {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pizza cheesePizza = new Pizza("pepperoni",12,13.99);
        
        System.out.println("Begining (using default values)");
       
        System.out.println(cheesePizza.getToppings());
        System.out.println(cheesePizza.getDiameter());
        System.out.println(cheesePizza.getPrice());
        
        
        cheesePizza.setToppings("cheese");
        cheesePizza.setDiameter(10);
        cheesePizza.setPrice(14.2);
        
        System.out.println("After changing values");
        
        System.out.println(cheesePizza.getToppings());
        System.out.println(cheesePizza.getDiameter());
        System.out.println(cheesePizza.getPrice());
        
        
    }

}
