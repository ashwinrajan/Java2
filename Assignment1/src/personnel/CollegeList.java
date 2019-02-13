/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 Assignment: Assignment 1
 
 This program is for Sheridan college to use in various student services and personnel applications.
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import javax.swing.JOptionPane;

/**
 *
 * @author Ashwin Rajan
 */
public class CollegeList {

    public static void main(String[] args) {
        // TODO code application logic here

        //************************Declaring Variable***********************************************
        int optionNum = 0;
        int countCollegeEmployee = 0;
        int countFaculty = 0;
        int countStudent = 0;
        boolean tenurned = false;
        boolean correctFormat = true;
        String streetNum = " ";
        String streetName = " ";

        Person[] personCollegeEmployee = new CollegeEmployee[50];
        Person[] personFaculty = new Faculty[50];
        Person[] personStudent = new Student[50];

        //do loop for executing the program again and again until user chose to quit
        do {
            //Shows Message Dialog
            String options[] = {"Create a Person", "View existing Persons", "Quit Program"};
            optionNum = JOptionPane.showOptionDialog(null, "Welcome to Sheridan College", "Sheridan College",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);


            //**************Execute the following code if user want to create Person*********************
            if (optionNum == 0) {

                ++countCollegeEmployee;

                //Shows Message Dialog
                String options1[] = {"College Employee", "Faculty", "Student"};
                optionNum = JOptionPane.showOptionDialog(null, "Choose one of the Person Member", "Sheridan College",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options1, null);


                //***********Execute the following code if user want to create College Employee********************
                if (optionNum == 0) {



                    String firstName;

                    //********Name Validation***************************************************************************
                    do {
                        firstName = JOptionPane.showInputDialog(null, "Enter First Name:", "");

                        if ("".equals(firstName)) {

                            firstName = "0";

                        }

                        for (int i = 0; i < firstName.length(); i++) {

                            if (Character.isLetter(firstName.charAt(i)) == false) {

                                correctFormat = false;
                                JOptionPane.showMessageDialog(null, "Names should contain only alphabets, no digits, no spaces.");
                                break;

                            } else {

                                correctFormat = true;

                            }

                        }

                    } while (correctFormat != true);

                    String lastName;

                    do {
                        lastName = JOptionPane.showInputDialog(null, "Enter Last Name:", "");

                        if ("".equals(lastName)) {

                            lastName = "0";

                        }

                        for (int i = 0; i < lastName.length(); i++) {

                            if (Character.isLetter(lastName.charAt(i)) == false) {

                                correctFormat = false;
                                JOptionPane.showMessageDialog(null, "Names should contain only alphabets, no digits, no spaces.");
                                break;

                            } else {

                                correctFormat = true;

                            }

                        }

                    } while (correctFormat != true);
                    //**************************************************************************************************

                    String dateOfBirth = JOptionPane.showInputDialog(null, "Enter Date Of Birth:", "");
                    String phoneNumber = JOptionPane.showInputDialog(null, "Enter Phone Number:", "");
                    String departmentName = JOptionPane.showInputDialog(null, "Enter Department Name:", "");

                    //*******************Social Security Number Validation***********************************************
                    String socialSecurityNumber;
                    do {
                        socialSecurityNumber = JOptionPane.showInputDialog(null, "Enter Social Security Number:", "");

                        if (socialSecurityNumber.length() != 9) {

                            JOptionPane.showMessageDialog(null, "SIN number should be 9 digits");

                        }

                    } while (socialSecurityNumber.length() != 9);
                    //*************************************************************************************************

                    String annualSalary = JOptionPane.showInputDialog(null, "Enter Annual Salary:", "");
                    //************Assigning string as 0 if it is null**************************************************
                    if ("".equals(annualSalary)) {

                        annualSalary = "0";

                    }
                    double annualSalaryDouble = Double.parseDouble(annualSalary);
                    //**************************************************************************************************

                    String streetAddress = JOptionPane.showInputDialog(null, "Enter Street address( Street number, Street name):", "");
                    String cityName = JOptionPane.showInputDialog(null, "Enter City name:", "");

                    //********Separating street number and street name***************************************************
                    for (int i = 0; i < streetAddress.length(); i++) {

                        streetNum += streetAddress.charAt(i);

                        if (streetAddress.charAt(i) == ' ') {

                            for (int j = i + 1; j < streetAddress.length(); j++) {

                                streetName += streetAddress.charAt(j);

                            }
                            break;

                        }
                    }
                    //***************************************************************************************************


                    //*******************Postal Code Validation*********************************************************
                    String postalCode;
                    do {
                        postalCode = JOptionPane.showInputDialog(null, "Enter Postal Code:", "");

                        if (postalCode.length() == 6) {

                            if (Character.isLetter(postalCode.charAt(0)) & Character.isLetter(postalCode.charAt(2)) & Character.isLetter(postalCode.charAt(4))
                                    & Character.isDigit(postalCode.charAt(1)) & Character.isDigit(postalCode.charAt(3)) & Character.isDigit(postalCode.charAt(5))) {

                                correctFormat = true;

                            } else {

                                JOptionPane.showMessageDialog(null, "Postal code should be in the format (alphabet digit alphabet digit alphabet digit)");

                                correctFormat = false;

                            }
                        } else {

                            JOptionPane.showMessageDialog(null, "Postal code should be in the format (alphabet digit alphabet digit alphabet digit)");
                            correctFormat = false;
                        }

                    } while (correctFormat != true);
                    postalCode = postalCode.toUpperCase();
                    //***************************************************************************************************

                    //*****************Province Name Validation**********************************************************
                    String provinceName;
                    do {
                        provinceName = JOptionPane.showInputDialog(null, "Enter Province: (Only 2 character long.For example: ON)", "");

                        if (provinceName.length() != 2) {

                            JOptionPane.showMessageDialog(null, "Province should be 2 character long");

                        }

                    } while (provinceName.length() != 2);

                    provinceName = provinceName.toUpperCase();

                    //*******************************************************************************************************

                    //**************Creates College Employee****************************************************************
                    personCollegeEmployee[countCollegeEmployee] = new CollegeEmployee(firstName, lastName, streetNum, streetName, cityName, provinceName, postalCode,
                            dateOfBirth, phoneNumber, socialSecurityNumber, departmentName, annualSalaryDouble);

                    //************************************************************************************************************


                    //************Execute the following code if user want to create Faculty***************************************
                } else if (optionNum == 1) {

                    ++countFaculty;

                    String firstName;

                    //********Name Validation***************************************************************************
                    do {
                        firstName = JOptionPane.showInputDialog(null, "Enter First Name:", "");

                        if ("".equals(firstName)) {

                            firstName = "0";

                        }

                        for (int i = 0; i < firstName.length(); i++) {

                            if (Character.isLetter(firstName.charAt(i)) == false) {

                                correctFormat = false;
                                JOptionPane.showMessageDialog(null, "Names should contain only alphabets, no digits, no spaces.");
                                break;

                            } else {

                                correctFormat = true;

                            }

                        }

                    } while (correctFormat != true);

                    String lastName;

                    do {
                        lastName = JOptionPane.showInputDialog(null, "Enter Last Name:", "");

                        if ("".equals(lastName)) {

                            lastName = "0";

                        }

                        for (int i = 0; i < lastName.length(); i++) {

                            if (Character.isLetter(lastName.charAt(i)) == false) {

                                correctFormat = false;
                                JOptionPane.showMessageDialog(null, "Names should contain only alphabets, no digits, no spaces.");
                                break;

                            } else {

                                correctFormat = true;

                            }

                        }

                    } while (correctFormat != true);
                    //**************************************************************************************************

                    String dateOfBirth = JOptionPane.showInputDialog(null, "Enter Date Of Birth:", "");
                    String phoneNumber = JOptionPane.showInputDialog(null, "Enter Phone Number:", "");
                    String departmentName = JOptionPane.showInputDialog(null, "Enter Department Name:", "");

                    String options2[] = {"Yes", "No"};
                    optionNum = JOptionPane.showOptionDialog(null, "Is the Faculty member tenured?", "Sheridan College",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options2, null);

                    if (optionNum == 0) {

                        tenurned = true;

                    }


                    //*******************Social Security Number Validation***********************************************
                    String socialSecurityNumber;
                    do {
                        socialSecurityNumber = JOptionPane.showInputDialog(null, "Enter Social Security Number:", "");

                        if (socialSecurityNumber.length() != 9) {

                            JOptionPane.showMessageDialog(null, "SIN number should be 9 digits");

                        }

                    } while (socialSecurityNumber.length() != 9);
                    //****************************************************************************************************

                    String annualSalary = JOptionPane.showInputDialog(null, "Enter Annual Salary:", "");
                    //************Assigning string as 0 if it is null**************************************************
                    if ("".equals(annualSalary)) {

                        annualSalary = "0";

                    }
                    double annualSalaryDouble = Double.parseDouble(annualSalary);
                    //**************************************************************************************************

                    String streetAddress = JOptionPane.showInputDialog(null, "Enter Street address( Street number, Street name):", "");
                    String cityName = JOptionPane.showInputDialog(null, "Enter City name:", "");

                    //********Separating street number and street name***************************************************
                    for (int i = 0; i < streetAddress.length(); i++) {

                        streetNum += streetAddress.charAt(i);

                        if (streetAddress.charAt(i) == ' ') {

                            for (int j = i + 1; j < streetAddress.length(); j++) {

                                streetName += streetAddress.charAt(j);

                            }
                            break;

                        }
                    }
                    //***************************************************************************************************

                    //*******************Postal Code Validation*********************************************************
                    String postalCode;
                    do {
                        postalCode = JOptionPane.showInputDialog(null, "Enter Postal Code:", "");

                        if (postalCode.length() == 6) {

                            if (Character.isLetter(postalCode.charAt(0)) & Character.isLetter(postalCode.charAt(2)) & Character.isLetter(postalCode.charAt(4))
                                    & Character.isDigit(postalCode.charAt(1)) & Character.isDigit(postalCode.charAt(3)) & Character.isDigit(postalCode.charAt(5))) {

                                correctFormat = true;

                            } else {

                                JOptionPane.showMessageDialog(null, "Postal code should be in the format (alphabet digit alphabet digit alphabet digit)");

                                correctFormat = false;

                            }
                        } else {

                            JOptionPane.showMessageDialog(null, "Postal code should be in the format (alphabet digit alphabet digit alphabet digit)");
                            correctFormat = false;
                        }

                    } while (correctFormat != true);
                    postalCode = postalCode.toUpperCase();
                    //****************************************************************************************************

                    //*****************Province Name Validation**********************************************************
                    String provinceName;
                    do {
                        provinceName = JOptionPane.showInputDialog(null, "Enter Province: (Only 2 character long.For example: ON)", "");

                        if (provinceName.length() != 2) {

                            JOptionPane.showMessageDialog(null, "Province should be 2 character long");

                        }

                    } while (provinceName.length() != 2);

                    provinceName = provinceName.toUpperCase();
                    //******************************************************************************************************

                    //*****************Create Faculty**********************************************************************
                    personFaculty[countFaculty] = new Faculty(firstName, lastName, streetNum, streetName, cityName, provinceName, postalCode,
                            dateOfBirth, phoneNumber, socialSecurityNumber, departmentName, annualSalaryDouble, tenurned);

                    //**********************************************************************************************************

                    //*************Execute the following code if user want to create Student*********************************
                } else {

                    ++countStudent;

                    String firstName;

                    //********Name Validation***************************************************************************
                    do {
                        firstName = JOptionPane.showInputDialog(null, "Enter First Name:", "");

                        if ("".equals(firstName)) {

                            firstName = "0";

                        }

                        for (int i = 0; i < firstName.length(); i++) {

                            if (Character.isLetter(firstName.charAt(i)) == false) {

                                correctFormat = false;
                                JOptionPane.showMessageDialog(null, "Names should contain only alphabets, no digits, no spaces.");
                                break;

                            } else {

                                correctFormat = true;

                            }

                        }

                    } while (correctFormat != true);

                    String lastName;

                    do {
                        lastName = JOptionPane.showInputDialog(null, "Enter Last Name:", "");

                        if ("".equals(lastName)) {

                            lastName = "0";

                        }

                        for (int i = 0; i < lastName.length(); i++) {

                            if (Character.isLetter(lastName.charAt(i)) == false) {

                                correctFormat = false;
                                JOptionPane.showMessageDialog(null, "Names should contain only alphabets, no digits, no spaces.");
                                break;

                            } else {

                                correctFormat = true;

                            }

                        }

                    } while (correctFormat != true);
                    //**************************************************************************************************

                    String dateOfBirth = JOptionPane.showInputDialog(null, "Enter Date Of Birth:", "");
                    String phoneNumber = JOptionPane.showInputDialog(null, "Enter Phone Number:", "");
                    String majorFieldOfStudy = JOptionPane.showInputDialog(null, "Enter your Major Field Of Study:", "");

                    String gradePointAverage = JOptionPane.showInputDialog(null, "Enter Grade Point Average:", "");
                    //************Assigning string as 0 if it is null**************************************************
                    if ("".equals(gradePointAverage)) {

                        gradePointAverage = "0";

                    }
                    double gpa = Double.parseDouble(gradePointAverage);
                    //*************************************************************************************************

                    String streetAddress = JOptionPane.showInputDialog(null, "Enter Street address( Street number, Street name):", "");
                    String cityName = JOptionPane.showInputDialog(null, "Enter City name:", "");

                    //********Separating street number and street name***************************************************
                    for (int i = 0; i < streetAddress.length(); i++) {

                        streetNum += streetAddress.charAt(i);

                        if (streetAddress.charAt(i) == ' ') {

                            for (int j = i + 1; j < streetAddress.length(); j++) {

                                streetName += streetAddress.charAt(j);

                            }
                            break;

                        }
                    }
                    //****************************************************************************************************

                    //*******************Postal Code Validation*********************************************************
                    String postalCode;
                    do {
                        postalCode = JOptionPane.showInputDialog(null, "Enter Postal Code:", "");

                        if (postalCode.length() == 6) {

                            if (Character.isLetter(postalCode.charAt(0)) & Character.isLetter(postalCode.charAt(2)) & Character.isLetter(postalCode.charAt(4))
                                    & Character.isDigit(postalCode.charAt(1)) & Character.isDigit(postalCode.charAt(3)) & Character.isDigit(postalCode.charAt(5))) {

                                correctFormat = true;

                            } else {

                                JOptionPane.showMessageDialog(null, "Postal code should be in the format (alphabet digit alphabet digit alphabet digit)");

                                correctFormat = false;

                            }
                        } else {

                            JOptionPane.showMessageDialog(null, "Postal code should be in the format (alphabet digit alphabet digit alphabet digit)");
                            correctFormat = false;
                        }

                    } while (correctFormat != true);
                    postalCode = postalCode.toUpperCase();
                    //*******************************************************************************************************

                    //*****************Province Name Validation**********************************************************
                    String provinceName;
                    do {
                        provinceName = JOptionPane.showInputDialog(null, "Enter Province: (Only 2 character long.For example: ON)", "");

                        if (provinceName.length() != 2) {

                            JOptionPane.showMessageDialog(null, "Province should be 2 character long");

                        }

                    } while (provinceName.length() != 2);

                    provinceName = provinceName.toUpperCase();
                    //*******************************************************************************************************


                    //****Course registeration*******************************************************************************
                    //Shows Message Dialog
                    String options3[] = {"Yes", "No"};
                    optionNum = JOptionPane.showOptionDialog(null, "Would you like to register a course", "Sheridan College",
                            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options3, null);


                    //*******Execute the following code if user want to register a course************************************
                    if (optionNum == 0) {


                        //Shows Message Dialog
                        String options4[] = {"Yes", "No"};
                        optionNum = JOptionPane.showOptionDialog(null, "Does this course have lab?", "Sheridan College",
                                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options4, null);


                        //*******Execute the following code if user have a lab course************************************
                        if (optionNum == 0) {

                            boolean labCourse = true;
                            String department = JOptionPane.showInputDialog(null, "Enter Course Name:", "");
                            String courseNumber = JOptionPane.showInputDialog(null, "Enter Course Number:", "");
                            //************Assigning string as 0 if it is null**************************************************
                            if ("".equals(courseNumber)) {

                                courseNumber = "0";

                            }
                            int courseNumberInt = Integer.parseInt(courseNumber);
                            //**************************************************************************************************

                            String credits = JOptionPane.showInputDialog(null, "Enter Course credits:", "");
                            //************Assigning string as 0 if it is null**************************************************
                            if ("".equals(credits)) {

                                credits = "0";

                            }
                            int creditsInt = Integer.parseInt(credits);
                            //************************************************************************************************

                            //********Creates Student****************************************************************************
                            personStudent[countStudent] = new Student(firstName, lastName, streetNum, streetName, cityName, provinceName, postalCode,
                                    dateOfBirth, phoneNumber, majorFieldOfStudy, gpa, department, courseNumberInt, creditsInt, labCourse);

                            //*******Execute the following code if its not lab course************************************
                        } else {

                            String department = JOptionPane.showInputDialog(null, "Enter Course Name:", "");
                            String courseNumber = JOptionPane.showInputDialog(null, "Enter Course Number:", "");
                            //************Assigning string as 0 if it is null**************************************************
                            if ("".equals(courseNumber)) {

                                courseNumber = "0";

                            }
                            int courseNumberInt = Integer.parseInt(courseNumber);
                            //**************************************************************************************************

                            String credits = JOptionPane.showInputDialog(null, "Enter Course credits:", "");
                            //************Assigning string as 0 if it is null**************************************************
                            if ("".equals(credits)) {

                                credits = "0";

                            }
                            int creditsInt = Integer.parseInt(credits);
                            //************************************************************************************************

                            //********Creates Student****************************************************************************
                            personStudent[countStudent] = new Student(firstName, lastName, streetNum, streetName, cityName, provinceName, postalCode,
                                    dateOfBirth, phoneNumber, majorFieldOfStudy, gpa, department, courseNumberInt, creditsInt);

                        }

                        //*******Execute the following code if user chose not to register a course************************************   
                    } else {

                        //********Creates Student****************************************************************************
                        personStudent[countStudent] = new Student(firstName, lastName, streetNum, streetName, cityName, provinceName, postalCode,
                                dateOfBirth, phoneNumber, majorFieldOfStudy, gpa);

                    }


                }

                //**************Execute the following code if user want to view existing persons*********************
            } else if (optionNum == 1) {

                //Shows Message Dialog
                String options4[] = {"College Employee", "Faculty", "Student"};

                optionNum = JOptionPane.showOptionDialog(null, "Choose one of the Person member", "Sheridan College",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options4, null);

                //***********Execute the following code if user want to view existing College Employee********************
                if (optionNum == 0) {

                    if (countCollegeEmployee != 0) {

                        JOptionPane.showMessageDialog(null, personCollegeEmployee, "", JOptionPane.INFORMATION_MESSAGE);

                    } else {

                        JOptionPane.showMessageDialog(null, "No College Employee is created", "Sheridan College", JOptionPane.INFORMATION_MESSAGE);

                    }

                    //***********Execute the following code if user want to view existing Faculty********************
                } else if (optionNum == 1) {

                    if (countFaculty != 0) {

                        JOptionPane.showMessageDialog(null, personFaculty, "", JOptionPane.INFORMATION_MESSAGE);

                    } else {

                        JOptionPane.showMessageDialog(null, "No Faculty is created", "Sheridan College", JOptionPane.INFORMATION_MESSAGE);

                    }

                    //***********Execute the following code if user want to view existing Student********************
                } else {

                    if (countStudent != 0) {

                        JOptionPane.showMessageDialog(null, personStudent, "", JOptionPane.INFORMATION_MESSAGE);

                    } else {

                        JOptionPane.showMessageDialog(null, "No Student is created", "Sheridan College", JOptionPane.INFORMATION_MESSAGE);

                    }

                }

                //************Execute the following code if user want to exit the program********************************
            } else {
                System.exit(0);
            }



        } while (true);


    }
}
