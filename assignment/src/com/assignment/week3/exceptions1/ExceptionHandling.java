package com.assignment.week3.exceptions1;

public class ExceptionHandling  {
    public static void main(String[] args) {

        int num1 = 30, num2 = 0;
        String str = null;

        //catching Arithmetic exception in the catch block
        try{
            System.out.println(num1/num2);
        }
        catch(ArithmeticException a) {
            System.out.println("End of main");
        }

        //catching NullPointerException exception in the catch block
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException n) {
            System.out.println("End of main");
        }
    }
}

