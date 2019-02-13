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
public class Employee {
    
    private int employeeID;
    private double hourlyWage;
    
    public Employee(int employeeID){
        
        this.employeeID= employeeID;
        
    }
    
    public Employee(int employeeID,double hourlyWage)throws EmployeeException{
        
        this.employeeID= employeeID;
        
        this.setHourlyWage(hourlyWage);
        
        
    }
    
    
    public void setHourlyWage(double hourlyWage)throws EmployeeException{
        
        if (hourlyWage<8.00||hourlyWage>60.00){
            
            throw new EmployeeException("Employee id: "+employeeID+" hourlyWage: "+hourlyWage);
        }
        else{
            
            this.hourlyWage=hourlyWage;
            
        }
        
    }
}
