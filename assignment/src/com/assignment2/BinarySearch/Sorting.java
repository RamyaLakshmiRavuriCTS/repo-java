package com.company;

import java.util.*;

public class Sorting{

    public static void removeDuplicates(ArrayList<Number> initial){
        Scanner scanner=new Scanner(System.in);
        LinkedHashSet<Number> set = new LinkedHashSet<Number>();
        for (int i=0;i<initial.size();i++){
            set.add(initial.get(i));
        }
        TreeSet<Number> tree=new TreeSet<Number>(set);
        System.out.println("Sorted array: "+tree);
        Object[] arr=tree.toArray();
        System.out.println("Enter number to be find: ");
        int search=scanner.nextInt();
        int rslt=Arrays.binarySearch(arr,search);
       if (rslt>0){
           System.out.println("Element "+search+" exists at index "+rslt);
       }else {
           System.out.println("Given element doesn't exists");
       }

    }
}
