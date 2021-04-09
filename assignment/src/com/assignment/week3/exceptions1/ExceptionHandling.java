package com.assignment.week3.exceptions1;

public class ExceptionHandling  {
    public static void main(String[] args) {

        int num1 = 30, num2 = 0;
        String str = null;

        //catching Arithmetic exception and Nullpointer Exception using single catch block
        try{
            System.out.println(num1/num2);

            System.out.println(str.length());
        }
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("End of main");
        }
    }
}

