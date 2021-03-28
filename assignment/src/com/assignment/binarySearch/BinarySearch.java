package com.assignment.binarySearch;

import java.util.*;

public class BinarySearch {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> remove) {

        HashSet<Integer> set = new HashSet<>(remove);

        return new ArrayList<>(set);
    }

    public static ArrayList<Integer> sorting(ArrayList<Integer> sort) {

        TreeSet<Integer> treeSet = new TreeSet<>(sort);

        System.out.println("Sorted elements : "+treeSet);

        return new ArrayList<>(treeSet);

    }

    public static void search(ArrayList<Integer> search, int n) {

        Integer[] arr = search.toArray(new Integer[0]);
        int res = Arrays.binarySearch(arr,n);

        if(res>=0)
            System.out.println("Element "+n+" exists at index "+res);
        else
            System.out.println("Given element doesn’t exists");

        /*Integer[] arr = (Integer[]) search.toArray();
        int first=0, last=arr.length-1, middle, flag = 0;

        for(int i=0;i<arr.length/2;i++) {

            middle = (first + last)/2;

            if(arr[middle] == n) {
                flag = 1;
                System.out.println("Element "+n+" exists at index "+middle);
                break;
            }
            else if(arr[middle] > middle) {
                last = middle -1;
            }
            else {
                first = middle + 1;
            }
        }

        if(flag == 0) {
            System.out.println("Given element doesn’t exists");
        }*/
    }

}
