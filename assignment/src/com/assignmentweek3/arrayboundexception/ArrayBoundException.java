package com.assignmentweek3.arrayboundexception;
import java.util.Scanner;
/*
This is the ArrayBound Exception class
 */
public class ArrayBoundException {
    /*
    This is the main method
     */
        public static void main(String[] args)
        {
            int size;
            Scanner sc=new Scanner(System.in);
            size = getArraySize(sc);
            int[] array = getArrayElements(size, sc);
            try {
                searchingMethod(size, sc, array);
            }
          catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("End of main");
              searchingMethod(size, sc, array);
        }
        }
        /*
        This is the searching method
         */
    private static void searchingMethod(int size, Scanner sc, int[] array) {
        int indexFound=0;
        System.out.println("Search Element :");
        int searchElement = sc.nextInt();
        indexFound = getIndexFound(size, array, indexFound, searchElement);
        getIndexNotFound(indexFound);
    }
    /*
    This is the catch block of Index not found error
     */
    private static void getIndexNotFound(int indexFound) {
        if (indexFound !=1) {
               throw new ArrayIndexOutOfBoundsException();
        }
    }
    /*
    This method is to get the index of element
     */
    private static int getIndexFound(int size, int[] array, int indexFound, int searchElement) {
        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                indexFound++;
                System.out.println("Index is " + i + " = " + searchElement);
            }
        }
        return indexFound;
    }
    /*
    This method is to get Array Elements
     */
    private static int[] getArrayElements(int size, Scanner sc) {
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++)
        {
            array[i]=sc.nextInt();
        }
        return array;
    }
    /*
    This method is to get ArraySize
     */
    private static int getArraySize(Scanner sc) {
        int size;
        System.out.print("Array Size: ");
        size=sc.nextInt();
        return size;
    }
}