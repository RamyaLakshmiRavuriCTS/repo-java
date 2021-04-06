package com.assignment3.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

/*
* creating a class to handle array index out of bound exception
 */
public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {

        //Taking input array
        int[] InputArray = {1, 5, 9, 7, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the required number:");

        //Handling the exception using try catch block
        try{
            int number = scanner.nextInt();
            System.out.println("Index is " +number+ " = " +InputArray[number]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("End of main");
        }
    }
}
