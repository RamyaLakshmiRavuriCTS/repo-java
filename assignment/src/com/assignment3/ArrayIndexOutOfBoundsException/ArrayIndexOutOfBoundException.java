package com.assignment3.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int[] InputArray = {1, 5, 9, 7, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the required number:");
        try{
            int number = scanner.nextInt();
            System.out.println("Index is " +number+ " = " +InputArray[number]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("End of main");
        }
    }
}
