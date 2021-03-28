package com.assignment2.binarysearch;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        //Taking size of the list from user
        int size;
        System.out.println("enter the size of the list:");

        //Taking input list from the user and sorting
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        System.out.println("Enter numbers: ");

        //method to sort the list
        Set<Number> set = sorting(size, scanner);

        //method to search a number in an array
        search(scanner, set);

    }

    private static Set<Number> sorting(int size, Scanner scanner) {
        Set<Number> set = new TreeSet<Number>();
        for(int i=0;i<size;i++){
            set.add(scanner.nextInt());
        }
        System.out.println("sorted array:" +set);
        return set;
    }

    private static void search(Scanner scanner, Set<Number> set) {
        //searching the number in an array
        Object[] arr=set.toArray();
        System.out.println("Enter number to be find: ");
        int find=scanner.nextInt();
        int output= Arrays.binarySearch(arr,find);
        if(output>0){
            System.out.println("Element " +find+ " exists at index: " +output);
        }
        else{
            System.out.println("Given element doesnt exists");
        }
    }
}
