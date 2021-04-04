package com.assignmentweek3.bankbalance;

public class BankBalance implements Runnable{
  public  double amount=100;
   public double currentBalance=0;
   public BalanceCalculations balance = new BalanceCalculations();
   /*
   This is the main method
    */
    public static void main(String[] args) throws InterruptedException {
         BankBalance bankBalance=new BankBalance();
        Thread thread1 =new Thread(bankBalance);
        Thread thread2 =new Thread(bankBalance);
        thread1.start();
        thread1.sleep(2000);
        thread2.start();
    }
    @Override
    public  void run() {
        depositing();
    }
    /*
    This method to deposite amout
     */
    public void depositing(){
        synchronized (this) {
            currentBalance = balance.deposite(amount);
            System.out.println("Depositing " + amount + " new Balance is " + currentBalance);
        }
        withdrawing();
    }
    /*
    This method is to withdraw amount
     */
    public void withdrawing(){
        synchronized (this) {
            currentBalance = balance.withdraw(amount);
            System.out.println("Withdrawing " + amount + " new Balance is " + currentBalance);
        }
    }
}
