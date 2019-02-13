/*
Name:  [Asma M Paracha]
Description:[Java code]
 */
package humanresource;

public class TCommissionEmployee extends CommissionEmployee {
    
    
    public double getPay()
    {
        return getRate()*getSales();
    }
}
