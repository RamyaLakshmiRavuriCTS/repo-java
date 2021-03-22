package com.assignment.dynamicbinding;

import java.util.Scanner;
public class MyChoice {
    int choice;
    Scanner in = new Scanner(System.in);

    public void getChoices() {
        System.out.println("Enter your choice :");
        choice = in.nextInt();
    }
    public void printMessage() {
        if(choice == 1)
            System.out.println("You have selected Black and White TV.");
        else if(choice == 2)
            System.out.println("You have selected Color TV.");
        else
            System.out.println("You have selected wrong option.");
    }

}
