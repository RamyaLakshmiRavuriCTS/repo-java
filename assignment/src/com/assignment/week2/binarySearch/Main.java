package com.assignment.week2.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23,23,46,56,78,29,90,56,34,2,78));

        System.out.println("Enter the element to be searched");
        int n = sc.nextInt();

        list = BinarySearch.removeDuplicates(list);

        list = BinarySearch.sorting(list);

        BinarySearch.search(list, n);
    }

}