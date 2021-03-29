package com.assignment.reversestring;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
        String str = scanner.nextLine();
        String words[] = str.split(" ");
        String reversedString = "";
        for (int i=words.length-1;i>=0; i--)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }

        System.out.print("Reversed string : " + reversedString);
    }
}
