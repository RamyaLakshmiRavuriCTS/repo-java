package com.assignment.exception1;

public class Exception1 {
    public static void main(String[] args) {

        int num1 = 30, num2 = 0;
        String str = null;

        //catching Arithmetic exception in the catch block
        try{
            System.out.println(num1/num2);
        }
        catch(ArithmeticException e) {
            System.out.println("End of main");
        }

        //catching NullPointerException exception in the catch block
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException f) {
            System.out.println("End of main");
        }
    }
}
