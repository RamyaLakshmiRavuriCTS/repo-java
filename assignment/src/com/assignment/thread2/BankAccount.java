package com.assignment.thread2;

public class BankAccount {
    private double balance;

    //Withdraws amount from the bank account
    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    //Deposits amount to the bank account
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}
