package com.assignment.binarySearch;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int input;
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();

        System.out.println("Enter the length of array: ");
        int n=scanner.nextInt();

        System.out.println("Enter numbers: ");
        for (input=0;input<n;input++){
            list.add(scanner.nextInt());
        }
        System.out.println("Input array: "+list);
        Sorting.removeDuplicates(list);
    }
}
