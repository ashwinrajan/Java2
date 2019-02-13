/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: Name.java
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
public class Name {

    private String firstName = new String();
    private String lastName = new String();

    public Name() {

        firstName = "";
        lastName = "";

    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Name(String firstName) {
        this.firstName = firstName;

    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }
}
