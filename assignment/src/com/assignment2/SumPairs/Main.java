package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input,sum;
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> initial=new ArrayList<Integer>(5);
        System.out.println("Enter numbers: ");
        for (input=0;input<5;input++){
            initial.add(scanner.nextInt());
        }
        System.out.println("Input array: "+initial);
        System.out.println("Input number: ");
        sum=scanner.nextInt();
        System.out.println("Pairs of element whose sum is "+sum+" are:");
        for (int i=0;i<5;i++){
            for (int j=i+1;j<5;j++){
                if (initial.get(i)+initial.get(j)==sum){
                    System.out.println(initial.get(i)+" + "+initial.get(j)+" = "+sum);
                }
            }
        }

    }
}
