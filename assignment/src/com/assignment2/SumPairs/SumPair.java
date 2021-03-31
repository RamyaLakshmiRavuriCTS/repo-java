package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SumPair {
    int size;
    ArrayList<Integer> list =  new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    public void getVal() {
        System.out.println("\nEnter the size :");
        size = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the elements :");
        for(int i=0; i<size; i++) {
            list.add(scan.nextInt());
        }
        System.out.println("Input Array: "+list);
    }
    public void printPairs(){
    int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number: ");
        sum=scanner.nextInt();
        System.out.println("Pairs of element whose sum is "+sum+" are:");
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if (list.get(i)+list.get(j)==sum){
                    System.out.println(list.get(i)+" + "+list.get(j)+" = "+sum);
                }
            }
        }
    }
}
