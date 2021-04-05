package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //main class object
        GetEvenNumbers num=new GetEvenNumbers();
        //assigning the methods
        num.getElements();
        num.printEvenElements();
        //getting user input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=scanner.nextInt();
        scanner.close();
        //implementing functional interface using lambda expression
        SquareRoot square=(int N)->N*N;
        //calculating square root of input number
        int ans=square.calculate(a);
        System.out.println("Square of a number: "+ans);
    }
}
