/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: CollegeEmployee.java
 Main class: CollegeList.java
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Ashwin Rajan
 */
public class CollegeEmployee extends Person {

    protected String socialSecurityNumber;
    protected double annualSalary;
    protected String departmentName;

    public CollegeEmployee() {
        socialSecurityNumber = null;
        annualSalary = 0.0;
        departmentName = null;

    }

    public CollegeEmployee(String firstName, String lastName, String streetNum, String streetName, String cityName,
            String provinceName, String postalCode, String dateOfBirth, String phoneNumber, String socialSecurityNumber,
            String departmentName, double annualSalary) {

        super.setName(firstName, lastName);
        super.setAddress(streetNum, streetName, cityName, provinceName, postalCode);
        super.setDateOfBirth(dateOfBirth);
        super.setPhoneNumber(phoneNumber);
        this.socialSecurityNumber = socialSecurityNumber;
        this.departmentName = departmentName;
        this.annualSalary = annualSalary;

    }

    @Override
    public String toString() {

        return super.toString() + "\r\nDepartment Name: " + departmentName + "\r\nSocial Security Number: " + socialSecurityNumber + "\r\nAnnual Salary: "
                + annualSalary + "\r\n\r\n";

    }
}
