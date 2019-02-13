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
public class Account {

    private double balance;
    private String id;
    private double interestRate;
    
    public Account() {

        balance = 0.0;

    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdrawMoney(double amount) {
        this.balance -= amount;
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
