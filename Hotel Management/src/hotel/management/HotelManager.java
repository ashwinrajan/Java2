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
public class HotelManager extends Staff{
    
    private String annualSalary;
    
    public HotelManager(){
        
        
    }
    
    public HotelManager(String firstName, String lastName, String streetNum, String streetName, String cityName,
            String provinceName, String postalCode, String phoneNumber, String annualSalary, String nationality) {

        super.setName(firstName, lastName);
        super.setAddress(streetNum, streetName, cityName, provinceName, postalCode);
        super.setPhoneNumber(phoneNumber);
        super.setNationality(nationality);
        super.generateUserId();
        this.annualSalary = annualSalary;


    }

    @Override
    public String toString() {

        return super.toString() + "\r\nAnnual Salary: " + annualSalary + "\r\n\r\n";

    }

}
