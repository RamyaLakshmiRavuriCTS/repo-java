package com.assignment2.SumPairs;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //reading the number of elements from the that we want to enter
        int numberOfElements;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        numberOfElements = scanner.nextInt();

        //creates an array in the memory of length given by the user
        int[] array = new int[numberOfElements];
        System.out.println("Enter the elements of the array: ");

        //reading array elements from the user
        for (int k = 0; k < numberOfElements; k++) {
            array[k] = scanner.nextInt();
        }

        //reading the sumnumber from the user
        System.out.println("enter the sum number to find pairs");
        int sumNumber = scanner.nextInt();

        //method for finding the sum pairs in the array
        findpairs(array, sumNumber);
    }

    //finding the sum pairs in the array
    private static void findpairs(int[] array, int sumNumber) {
        System.out.println("Pairs of elements and their sum : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sumNumber) {
                    System.out.println(array[i] + " + " + array[j] + " =  " + sumNumber);
                }
            }

        }
    }
}
