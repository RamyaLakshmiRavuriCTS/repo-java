package com.assignment.thread2;

public class AccountTesting implements Runnable{

    private BankAccount bankAccount = new BankAccount();
    private double amount = 100;
    private double currentAmount = 0;


    public static void main(String[] args) {
        AccountTesting account = new AccountTesting();

        //Initializing threads
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);

        //Starting the threads
        t1.start();
        t2.start();
    }

    public void run() {
        makeDeposit();
    }
    private void makeDeposit() {

        //allows only one thread at a time
        synchronized (this) {

            //depositing amount in the bank account
            currentAmount = bankAccount.deposit(amount);
            System.out.println("Depositing " + amount + ", new balance is " + currentAmount);
        }
        makeWithdrawal();
    }
    private void makeWithdrawal() {
        synchronized (this) {

            //withdrawing account from bank account
            currentAmount = bankAccount.withdraw(amount);
            System.out.println("Withdrawing " + amount + ", new balance is " + currentAmount);
        }
    }
}
