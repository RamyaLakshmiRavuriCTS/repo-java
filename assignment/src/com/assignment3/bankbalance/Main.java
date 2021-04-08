package com.company;

public class Main implements Runnable{
    //main class object
    private BankAccount bankAccount=new BankAccount();
    private double amount=100;
    private double currentAmount=0;

    public static void main(String[] args) {
        Main testing=new Main();
        //initializing the threads
        Thread thread1=new Thread(testing);
        Thread thread2=new Thread(testing);
        //starting the threads
        thread1.start();
        thread2.start();

    }

    @Override
    public void run() {
        makeDeposit();
    }
    private void makeDeposit(){
        //allows only one thread at a time
        synchronized (this){
            //depositing amount in the bank
            currentAmount=bankAccount.deposit(amount);
            System.out.println("Depositing "+amount+", new balance is "+currentAmount);
        }
        makeWithdrawl();
    }
    private void makeWithdrawl(){
        synchronized (this){
            //withdrawing the amount from the bank
            currentAmount=bankAccount.withdraw(amount);
            System.out.println("Withdrawing "+amount+", new balance is "+currentAmount);
        }
    }
}
