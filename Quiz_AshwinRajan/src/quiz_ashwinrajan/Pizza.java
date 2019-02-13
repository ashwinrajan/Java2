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
public class Pizza {

    private String toppings = new String();
    private int diameter;
    private double price;
    
    
    public Pizza(){
        
        toppings=null;
        diameter=0;
        price=0.0;
        
    }
    
    
    public Pizza(String toppings,int diameter, double price){
        
        this.toppings = toppings;
        this.diameter= diameter;
        this.price= price;
        
        
    }
    
    
    public String getToppings(){
        
        return toppings;
    }
    
    public int getDiameter(){
        
        return diameter;
        
    }
    
    
    public double getPrice(){
        
        return price;
    }
    
    public void setToppings(String toppings){
        
        this.toppings=toppings;
    }
    
    public void setDiameter(int diameter){
        
        this.diameter=diameter;
    }
    
    public void setPrice(double price){
        
        this.price=price;
    }
    
    
}
