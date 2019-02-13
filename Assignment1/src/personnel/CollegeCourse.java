/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: CollegeCourse.java
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
public class CollegeCourse {

    protected String department;
    protected int courseNumber;
    protected int credits;
    protected int courseFee;
    protected final int creditHourRate = 120;

    public CollegeCourse() {
        this.department = null;
        this.courseNumber = 0;
        this.credits = 0;
        this.courseFee = 0;

    }

    public CollegeCourse(String department, int courseNumber, int credits) {

        this.department = department;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.courseFee();


    }

    public void courseFee(int labFee) {

        courseFee = (creditHourRate * credits) + labFee;

    }

    private void courseFee() {

        courseFee = (creditHourRate * credits);
    }

    @Override
    public String toString() {


        return "The course is not a lab course" + "\nCourse name: " + department + "\nCourse Number: " + courseNumber + "\nCourse credits: " + credits
                + "\nCourse fee: " + courseFee;



    }
}
