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
public class Payment {

    private String name;
    private String creditCardType;
    private String creditCardNum;
    
    public Payment(){
        
    }
    
    public Payment(String name,String creditCardType, String creditCardNum){
        
        this.name=name;
        this.creditCardType=creditCardType;
        this.creditCardNum=creditCardNum;
        
    }
    
    public String toString() {

        return "\r\nCredit Card Type: " + creditCardType +"\r\nCredit Card name: " + name + "\r\nCredit Card Number: "+ creditCardNum +"\r\n\r\n";

    }
}
