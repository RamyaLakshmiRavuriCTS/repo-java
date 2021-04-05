package com.company;

import java.util.*;
//Sorting class
public class Sorting{
    //initializing the parameters
    int size;
    Object[] arr;
    ArrayList<Number> list =  new ArrayList<Number>();
    Scanner scan = new Scanner(System.in);
    //method to get arraylist size and elements and display it
    public void getVal() {
        System.out.println("\nEnter the size :");
        size = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the elements :");
        for(int i=0; i<size; i++) {
            list.add(scan.nextInt());
        }
        System.out.println("Input Array: "+list);
    }
    //method to remove duplicates and sort the array
    public int removeDuplicates() {
        LinkedHashSet<Number> set = new LinkedHashSet<Number>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        TreeSet<Number> tree=new TreeSet<Number>(set);
        System.out.println("Sorted array: "+tree);
        arr=tree.toArray();
        return 1;
    }
    //method to search the array element
    public void searchArray(){
        System.out.println("Enter number to be find: ");
        int search=scan.nextInt();
        int rslt=Arrays.binarySearch(arr,search);
        if (rslt>0){
            System.out.println("Element "+search+" exists at index "+rslt);
        }else {
            System.out.println("Given element doesn't exists");
        }

    }
}
