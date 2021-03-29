package com.assignment.sumArray;

import java.util.ArrayList;
import java.util.Scanner;
public class SumOfIntegers {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();

        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Input array: " + list);

        System.out.println("Input number: ");
        int num = sc.nextInt();

        System.out.println("Pair of elements whose sum is "+num+" are:");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (list.get(i) + list.get(j) == num) {
                    System.out.println(list.get(i)+" + "+list.get(j) + " = " + num);
                }
            }
        }
    }
}
