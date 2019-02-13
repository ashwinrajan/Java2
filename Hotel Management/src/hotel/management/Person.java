/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: Person.java
 Main class: CollegeList.java
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
public abstract class Person {

    public Name createName;
    public Address createAddress;
    private String phoneNumber;

    public Person() {

        createName = null;
        createAddress = null;

        phoneNumber = null;

    }

    public void setName(String firstName, String lastName) {

        createName = new Name(firstName, lastName);
    }

    public void setAddress(String streetNum, String streetName, String cityName, String provinceName, String postalCode) {

        createAddress = new Address(streetNum, streetName, cityName, provinceName, postalCode);
    }


    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + createName.getFirstName() + " " + createName.getLastName() + "\r\nAddress:" + createAddress.getStreetNum() + "" + createAddress.getStreetName()
                + ", " + createAddress.getCityName() + ", " + createAddress.getProvinceName() + ", " + createAddress.getPostalCode() + ", " + createAddress.getCountry()
                + "\r\nPhone Number: " + phoneNumber;
    }
}
