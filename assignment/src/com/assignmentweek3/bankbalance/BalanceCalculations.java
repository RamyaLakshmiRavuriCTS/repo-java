package com.assignmentweek3.bankbalance;

public class BalanceCalculations {

   public double currentBalance;
   /*
   This method is to update after deposition
    */
   public double deposite(double amount){
       currentBalance=currentBalance+amount;
       return currentBalance;
   }
   /*
   This method is to update after withdraw
    */
   public double withdraw(double amount){
       currentBalance= currentBalance-amount;
       return currentBalance;
   }
}
