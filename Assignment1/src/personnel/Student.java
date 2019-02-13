/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 File: Student.java
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
public class Student extends Person {

    public CollegeCourse createCourse;
    public LabCourse createLabCourse;
    private String majorFieldOfStudy;
    private double gradePointAverage;
    private boolean labCourse = false;

    public Student() {
        majorFieldOfStudy = null;
        gradePointAverage = 0.0;

    }

    public Student(String firstName, String lastName, String streetNum, String streetName, String cityName,
            String provinceName, String postalCode, String dateOfBirth, String phoneNumber, String majorFieldOfStudy,
            double gradePointAverage) {

        super.setName(firstName, lastName);
        super.setAddress(streetNum, streetName, cityName, provinceName, postalCode);
        super.setDateOfBirth(dateOfBirth);
        super.setPhoneNumber(phoneNumber);
        this.majorFieldOfStudy = majorFieldOfStudy;
        this.gradePointAverage = gradePointAverage;

    }

    public Student(String firstName, String lastName, String streetNum, String streetName, String cityName,
            String provinceName, String postalCode, String dateOfBirth, String phoneNumber, String majorFieldOfStudy,
            double gradePointAverage, String department, int courseNumber, int credits) {

        super.setName(firstName, lastName);
        super.setAddress(streetNum, streetName, cityName, provinceName, postalCode);
        super.setDateOfBirth(dateOfBirth);
        super.setPhoneNumber(phoneNumber);
        this.majorFieldOfStudy = majorFieldOfStudy;
        this.gradePointAverage = gradePointAverage;

        createCourse = new CollegeCourse(department, courseNumber, credits);

    }

    public Student(String firstName, String lastName, String streetNum, String streetName, String cityName,
            String provinceName, String postalCode, String dateOfBirth, String phoneNumber, String majorFieldOfStudy,
            double gradePointAverage, String department, int courseNumber, int credits, boolean labCourse) {

        super.setName(firstName, lastName);
        super.setAddress(streetNum, streetName, cityName, provinceName, postalCode);
        super.setDateOfBirth(dateOfBirth);
        super.setPhoneNumber(phoneNumber);
        this.majorFieldOfStudy = majorFieldOfStudy;
        this.gradePointAverage = gradePointAverage;
        this.labCourse = labCourse;

        createLabCourse = new LabCourse(department, courseNumber, credits, labCourse);

    }

    @Override
    public String toString() {

        if (labCourse == true) {
            return super.toString() + "\nMajor Field Of Study: " + majorFieldOfStudy + "\nGrade Point Average: " + gradePointAverage
                    + "\n" + createLabCourse.toString() + "\n\n";
        } else if (createCourse == null) {
            return super.toString() + "\nMajor Field Of Study: " + majorFieldOfStudy + "\nGrade Point Average: " + gradePointAverage
                    + "\n\n";

        } else {
            return super.toString() + "\nMajor Field Of Study: " + majorFieldOfStudy + "\nGrade Point Average: " + gradePointAverage
                    + "\n" + createCourse.toString() + "\n\n";
        }

    }
}
