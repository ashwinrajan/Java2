/*
Name:  [Asma M Paracha]
Description:[Java code]
 */
package humanresource;

public abstract class CommissionEmployee extends Employee{
    
    private double crate;
    private double sales;
    
    public double getRate()
    {
        return this.crate;
    }
    
    public double getSales()
    {
        return this.sales;
    }
    
}
