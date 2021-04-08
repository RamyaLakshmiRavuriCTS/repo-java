package com.company;
//class bankAccount
public class BankAccount {
    private double balance;
//withdraws amount from the bank
    public double withdraw(double amount) {
        balance-=amount;
        return balance;
    }
//deposits amount in the bank
    public double deposit(double amount) {
        balance+=amount;
        return balance;
    }
}
