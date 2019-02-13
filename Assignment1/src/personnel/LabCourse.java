/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: LabCourse.java
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
public class LabCourse extends CollegeCourse {

    private final int labFee = 50;
    private boolean labCourse;

    public LabCourse() {
    }

    public LabCourse(String department, int courseNumber, int credits, boolean labCourse) {

        super.department = department;
        super.courseNumber = courseNumber;
        super.credits = credits;
        this.labCourse = labCourse;
        super.courseFee(labFee);


    }

    public void addFee() {

        super.courseFee(labFee);

    }

    @Override
    public String toString() {

        return "The course is a lab course " + "\nCourse name: " + department + "\nCourse Number: " + courseNumber + "\nCourse credits: " + credits
                + "\nCourse fee: " + courseFee;

    }
}
