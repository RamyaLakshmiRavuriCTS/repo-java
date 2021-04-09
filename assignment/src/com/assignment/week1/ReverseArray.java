package com.assignment.week1;

import java.util.Scanner;

public class ReverseArray {
    public static Scanner in =new Scanner(System.in);

    public static char[] readIntegers() {
        System.out.println("Enter the elements into array");
        char[] array =in.next().toCharArray();
        return array;
    }

    public static void reverse(char[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        char[] x = readIntegers();
        reverse(x);
    }

}