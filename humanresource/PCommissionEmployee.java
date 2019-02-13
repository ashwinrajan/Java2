/*
Name:  [Asma M Paracha]
Description:[Java code]
 */
package humanresource;

public class PCommissionEmployee extends CommissionEmployee {
    
    private double pay;
    public double getPay()
    {
        return( pay+getRate()*getSales());
    }
    
}
