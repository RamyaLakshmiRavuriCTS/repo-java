package com.assignment.findAllPairs;

import java.util.Scanner;
import java.util.ArrayList;

public class FindAllPairs {

    public static void main(String[] args) {

        //Instantiating Scanner obj for getting inputs
        Scanner sc = new Scanner(System.in);

        //This collection suits the given question
        ArrayList<Integer> pairs = new ArrayList<>();

        //Get the number of which the pair sum should be
        System.out.println("Enter the input number");
        int p = sc.nextInt();

        //Get the elements in an arraylist
        System.out.println("Enter the input array of elements:");
        while(sc.hasNextInt()) {
            pairs.add(sc.nextInt());
        }

        //Now, iterating the list in a for loop,
        //Inorder to find all pairs that equals
        //to the input number and displaying them.
        System.out.println("Pairs of elements whose sum is "+p+" are:");
        for(int i=0;i<pairs.size()-1;i++) {
            if(pairs.get(i)>=0) {
                for(int j=i+1;j<pairs.size();j++) {
                    if (pairs.get(i) + pairs.get(j) == p) {
                        System.out.println(pairs.get(i) + " + " + pairs.get(j) + " = " + p);
                    }
                }
            }
        }
    }
}