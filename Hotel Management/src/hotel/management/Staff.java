/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;

/**
 *
 * @author Ashwin Rajan
 */
public class Staff extends Person {

    private int userId;
    private String nationality;
    
    public Staff() {
    }

    public void setNationality(String nationality){
        
        this.nationality=nationality;
        
    }
    
    public void generateUserId(){
        
        this.userId = 1000000 + (int) (Math.random() * ((9999999 - 1000000) + 1));
    }

    @Override
    public String toString() {

        return super.toString() + "\r\nNationality: " + nationality + "\r\nUser Id: " + userId ;

    }
}
