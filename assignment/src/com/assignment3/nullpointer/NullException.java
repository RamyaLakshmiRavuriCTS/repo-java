package com.assignment3.nullpointer;

public class NullException {
    /*
    This is the main method
     */
    public static void main(String[] args) {
        try{
            int number1=30;
            int number2=0;

            int result =number1/number2;
        }
        catch(ArithmeticException e){
            System.out.print("End of main");
            System.out.println("");
        }
        try{
            String name=null;
            name.length();
        }
        catch(NullPointerException e)
        {
            System.out.print("End of main 2");
        }
    }
}