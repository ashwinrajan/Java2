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


import java.util.Date;

/**
 *
 * @author Ashwin Rajan
 */
public class Customer extends Person {
    
    public Reservation newReservation;
    public Payment newPayment;
    private String passportNum;
    private String nationality;
    
    public Customer() {
    }
    
    public Customer(String firstName, String lastName, String streetNum, String streetName, String cityName,
            String provinceName, String postalCode, String phoneNumber, String roomType, String roomNum, Date checkIn, Date checkOut, String creditCardType,
            String name,String creditCardNum,String nationality,String passportNum) {
        
        super.setName(firstName, lastName);
        super.setAddress(streetNum, streetName, cityName, provinceName, postalCode);
        super.setPhoneNumber(phoneNumber);
        this.nationality=nationality;
        this.passportNum=passportNum;
        
        
        newReservation  = new Reservation(checkIn,checkOut, roomType, roomNum);
        newPayment = new Payment(name,creditCardType,creditCardNum);
    }
    
    @Override
    public String toString() {

        return super.toString() + "\r\nPassport Num: " + passportNum + "\r\nNationality: " + nationality + newReservation.toString()+ newPayment.toString() ;

    }
    
}

