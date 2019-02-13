/*
Name:  [Asma M Paracha]
Description:[Java code]
 */
package humanresource;

public class PartTimeEmployee extends Employee {
    private double hrs;
    private double rate;
    
    public double getPay()
    {
        return hrs*rate;
    }
    
}
