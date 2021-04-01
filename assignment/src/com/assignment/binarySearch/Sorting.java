package com.assignment.binarySearch;

import java.util.*;

public class Sorting {
    public static void removeDuplicates(ArrayList<Integer> list){

        Scanner scanner=new Scanner(System.in);
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i=0;i<list.size();i++){
            set.add(list.get(i));
        }

        TreeSet<Integer> tree=new TreeSet<Integer>(set);
        System.out.println("Sorted array: "+tree);

        Object[] arr=tree.toArray();
        System.out.println("Enter number to be find: ");

        int search=scanner.nextInt();
        int rslt= Arrays.binarySearch(arr,search);
        if (rslt>0){
            System.out.println("Element "+search+" exists at index "+rslt);
        }else {
            System.out.println("Given element doesn't exists");
        }
    }
}
