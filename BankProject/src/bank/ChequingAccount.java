/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Ashwin Rajan
 */
public class ChequingAccount extends Account {

    private static final int FREE_TRANSACTIONS = 10;
    private static final double TRANSACTION_FEE = 2.0;
    private int transactionCount;
    private double fees;
    
    
    
    public ChequingAccount(double amount) {

        transactionCount++;
        super.withdrawMoney(amount);

    }

    public void deductFees() {

        if (transactionCount > FREE_TRANSACTIONS) {

            fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            super.withdrawMoney(fees);

        }

    }
}
