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
public class SavingsAccount extends Account {
    
    private static final int FREE_TRANSACTIONS = 5;
    private static final double TRANSACTION_FEE = 2.0;
    private int transactionCount;
    private double fees;
    private double interest;
    
    
    public SavingsAccount(double interest,double amount) {

        this.interest = interest;
        transactionCount++;
        super.withdrawMoney(amount);
        
    }

    public void addInterest() {

        depositMoney(getBalance() * interest);

    }
    
    public void deductFees() {

        if (transactionCount > FREE_TRANSACTIONS) {

            fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            super.withdrawMoney(fees);

        }

    }
}
