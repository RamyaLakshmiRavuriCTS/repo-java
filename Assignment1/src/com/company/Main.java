package com.company;
import java.util.Scanner;

public class Main {
    public static int option;
    public static Scanner scanner=new Scanner(System.in);
    public void printmessage(){

    }
    public static class Main2 extends Main{
        @Override
        public void printmessage() {
            if (option==1){
                System.out.println("You have selected Black and White TV");
            }else if (option==2){
                System.out.println("You have selected Color TV");
            }else {
                System.out.println("You have selected wrong option!");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Available choices:\n 1. Black and White TV\n 2. Color TV\n Choose one!");
        System.out.println("Enter your choice:");
        option=scanner.nextInt();
        Main2 main2=new Main2();
        main2.printmessage();
    }

}

