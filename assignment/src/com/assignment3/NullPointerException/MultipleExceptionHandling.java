package com.assignment3.NullPointerException;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try{
            int num1=30;
            int num2=0;
            int div = num1/num2;
            String str=null;

            System.out.println(str.length());
            System.out.println("result"+div);

        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println("End of main");
        }
    }
}
