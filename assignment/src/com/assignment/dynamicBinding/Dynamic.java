package com.assignment.dynamicBinding;

import java.util.Scanner;

public class Dynamic {
    int option;
    Scanner sc = new Scanner(System.in);

    public void getChoices() {
        System.out.println("Enter your choice :");
        option = sc.nextInt();
    }

    public void printMessage() {
        //System.out.println(option);
        if(option == 1)
            System.out.println("You have selected Black and White TV.");
        else if(option == 2)
            System.out.println("You have selected Color TV.");
        else
            System.out.println("You have selected wrong option.");
    }

}
