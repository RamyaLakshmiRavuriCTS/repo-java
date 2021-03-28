package com.assignmentweek2.elementpairs;

import java.util.Scanner;

/*
This is the main method
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = ArraySizeInput();
        int[] Array = EnteringArrayElements(sc);
        System.out.println("Enter the searching number :");
        Searchingpairs(sc, Array);
    }
/*
This method is used to enter the Array elements
 */
    private static int[] EnteringArrayElements(Scanner sc) {
        int ArraySize =sc.nextInt();
        int [] Array =new int[ArraySize];
        for (int i=0;i<ArraySize; i++){
            Array[i]=sc.nextInt();
        }
        return Array;
    }
/*
This method is used for searching pairs
 */
    private static void Searchingpairs(Scanner sc, int[] array) {
        int SearchingNumber = sc.nextInt();
        System.out.println("Pair of elements whose sum is "+ SearchingNumber + " are:");
        for (int i = 0; i< array.length; i++){
            for(int j = 1; j< array.length; j++)
            if (array[i]+ array[j]==SearchingNumber && i!=j && j!=i && array[i]>0 && array[j]>0){
                    System.out.println(array[i] + "+" + array[j] + "=" + (array[i] + array[j]));
            }
        }
    }
/*
This method is used for inputting Array size input
 */
    private static Scanner ArraySizeInput() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Size to Array");
        return sc;
    }
}
