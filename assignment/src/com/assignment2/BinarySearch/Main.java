package com.company;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        int input;
        Scanner scanner=new Scanner(System.in);
        ArrayList<Number> initial=new ArrayList<Number>(5);
        System.out.println("Enter numbers: ");
        for (input=0;input<5;input++){
            initial.add(scanner.nextInt());
        }
        System.out.println("Input array: "+initial);
       Sorting.removeDuplicates(initial);
    }


}
