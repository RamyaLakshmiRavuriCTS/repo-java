package com.assignment.dynamicBinding;

import java.util.Scanner;

public class Test {

    //main method to invoke the objects
    public static void main(String args[]){
        Black b = new Black();
        White w = new White();
        Colour c = new Colour();

        System.out.println("Enter your choice:");
        //input from the user
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();

        //switching the methods based on user's input
        switch (st){
            case "black":
                b.display();
                break;
            case "white":
                w.display();
                break;
            case "colour":
                c.display();
                break;
        }
    }
}
