/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionexercise;

/**
 *
 * @author Ashwin Rajan
 */
public class ExceptionExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 3; i++) {

            try {
                if (i == 0) {
                    Employee e1 = new Employee(10, 61);
                } else if (i == 1) {
                    Employee e2 = new Employee(20, 9);
                } else {
                    Employee e3 = new Employee(30, 1);
                }

            } catch (EmployeeException e) {

                System.out.println(e);


            }

        }

    }
}
