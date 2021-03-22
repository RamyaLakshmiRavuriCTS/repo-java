package com.assignment.dynamicBinding;

import java.util.Scanner;
public  class Telivision
{
    public void display()
    {
        System.out.println(" You have selected Black and White Telivision");
    }
    public static void main(String[] args) {
        int userInput = getUserInput();

        displayUserOutput(userInput);
    }

    private static void displayUserOutput(int userInput) {
        switch (userInput){
            case 1:
            {
                Telivision black =new Telivision ();
                black.display();
                break;
            }
            case 2:
            {
                ColourTelevision colour = new ColourTelevision();
                colour.display();
                break;
            }
            default:
            {
                System.out.println("Invalid Input");
            }
        }
    }

    private static int getUserInput() {
        System.out.println("Select Telivision");
        System.out.println("1.Black And White ");
        System.out.println("2.Colour T.V");
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();
    }
}
