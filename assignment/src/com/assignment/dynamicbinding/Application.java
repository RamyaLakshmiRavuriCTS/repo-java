package com.assignment.dynamicbinding;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        int input = getUserInput();

        displaySelection(input);

    }

    private static void displaySelection(int input) {
        if (input == 1) {
            Tv blackandwhite = new BlackAndWhite();
            blackandwhite.print();
        } else if (input == 2) {
            Tv colortv = new ColorTv();
            colortv.print();
        } else {
            System.out.println("invalid Input");
        }
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the options");
        System.out.println("Type 1 if you want to select Black and White TV");
        System.out.println("type 2 if you want to select Colour TV");
        return scanner.nextInt();
    }
}
