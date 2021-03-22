package com.assignment.dynamicbinding;

public class Main extends MyChoice {
    public static void main(String args[]) {
        System.out.println("Choices Available :\n1. Black and White TV\n2. Color TV");
        Main ob = new Main();
        ob.getChoices();
        ob.printMessage();
    }

}
