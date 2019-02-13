/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;



/**
 *
 * @author Ashwin Rajan
 */
public class Person {
    
    public Name name;
    public Address address;
    private Account account;
    
    public Person(){
        
        name=null;
        address=null;
        account=null;
        
    }
    
    public Person(String firstName, String lastName, String streetNum, String streetName, String cityName, String provinceName, String postalCode, String country){
        
        name =new Name(firstName,lastName);
        address= new Address(streetNum,streetName,cityName,provinceName,postalCode,country);
        
    }
    
    
    
 


}
