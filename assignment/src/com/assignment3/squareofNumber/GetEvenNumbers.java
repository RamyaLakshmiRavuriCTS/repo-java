package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class GetEvenNumbers {
    int size;
    ArrayList<Integer> list =  new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    //method to get arraylist size and elements and display it
    public void getElements() {
        System.out.println("\nEnter the size :");
        size = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the elements :");
        for(int i=0; i<size; i++) {
            list.add(scan.nextInt());
        }
        System.out.println("Input Array: "+list);
    }
    //method to print pair of element whose sum is given
    public void printEvenElements(){
        Predicate<Integer> isEven= (number)->number%2==0;
        System.out.println("Even numbers: ");
        list.stream().filter(isEven).forEach(System.out::println);
    }
}
