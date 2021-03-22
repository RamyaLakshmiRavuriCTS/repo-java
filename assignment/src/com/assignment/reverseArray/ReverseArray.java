package com.assignment.reverseArray;
import java.util.Scanner;

/**
 * 
 */
public class ReverseArray
{
    public static void main(String[] args)
    {
        String name = getString();
        reverseArray(name);
    }

    private static void reverseArray(String name) {
        char userInput[]=name.toCharArray();
        int len=userInput.length;
        StringBuffer reverse = new StringBuffer("");
        for(int i=len-1;i>=0;i--){
            reverse.append(userInput[i]);
        }
        System.out.println(reverse);
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
