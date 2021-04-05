package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HandlingException {
    Scanner scanner=new Scanner(System.in);
    //method to handle ArrayIndexOutOfBoundsException
    public void arrayException(){
        int size;
        //getting user inputs
        System.out.println("Enter the size: ");
        size=scanner.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0;i<size;i++){
            a[i]=scanner.nextInt();
        }
        //displaying the input array
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the index of the required element: ");
        try {
            int element=scanner.nextInt();
            System.out.println("Index is "+element+" = "+a[element]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("End of main");
        }
    }
}
