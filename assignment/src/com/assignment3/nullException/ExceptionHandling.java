package com.company;

import java.util.Scanner;
//ExceptionHandling class
public class ExceptionHandling {
    Scanner scanner=new Scanner(System.in);
    //method to handle ArithmeticException
    public void divideByZero(){
        System.out.println("Input the first number: ");
        int a=scanner.nextInt();
        System.out.println("Input the second number: ");
        int b=scanner.nextInt();
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("End of main");
        }
        scanner.close();
    }
    //method to handle NullPointerException
    public void nullPointer(){
       String x=null;
        try {
            System.out.println(x.length());
        }catch (NullPointerException e){
            System.out.println("End of main");
        }
    }


}
