/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: Faculty.java
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
public class Faculty extends CollegeEmployee {

    private boolean tenuredMember;
    private String stringTenuredMember;

    public Faculty(String firstName, String lastName, String streetNum, String streetName, String cityName,
            String provinceName, String postalCode, String dateOfBirth, String phoneNumber, String socialSecurityNumber,
            String departmentName, double annualSalary, boolean tenuredMember) {

        super.setName(firstName, lastName);
        super.setAddress(streetNum, streetName, cityName, provinceName, postalCode);
        super.setDateOfBirth(dateOfBirth);
        super.setPhoneNumber(phoneNumber);
        super.socialSecurityNumber = socialSecurityNumber;
        super.departmentName = departmentName;
        super.annualSalary = annualSalary;
        this.tenuredMember = tenuredMember;

    }

    @Override
    public String toString() {

        if (tenuredMember == true) {

            stringTenuredMember = "tenured";

        } else {
            stringTenuredMember = "non-tenured";
        }

        return "Faculty is " + stringTenuredMember + "\n" + super.toString();
    }
}
