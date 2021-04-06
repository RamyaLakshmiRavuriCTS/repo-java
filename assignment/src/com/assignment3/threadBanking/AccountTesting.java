package com.assignment3.threadBanking;

/*
*creating a class account testing and implementing runnable
*/
public class AccountTesting implements Runnable{
    private BankAccount bankAccount = new BankAccount();
    private double amount = 200;
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

    //calling a method run
    public void run() {
        makeDeposit();
    }

    //defining method makeDeposit for operating deposits
    private void makeDeposit() {
        //allows only one thread at a time
        synchronized (this) {
            //depositing amount in the bank account
            currentAmount = bankAccount.deposit(amount);
            System.out.println("Depositing " + amount + ", new balance is " + currentAmount);
        }
        makeWithdrawal();
    }

    //defining method withdrawal for operating withdrawal
    private void makeWithdrawal() {
        synchronized (this) {
            //withdrawing account from bank account
            currentAmount = bankAccount.withdraw(amount);
            System.out.println("Withdrawing " + amount + ", new balance is " + currentAmount);
        }
    }
}
