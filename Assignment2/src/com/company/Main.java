package com.company;
import java.lang.*;
import java.util.*;
class Main {
    public static void main(String[] args)
    {
        String rev="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input=scanner.nextLine();
        char[] array = input.toCharArray();
        for (int i = array.length - 1; i >= 0; i--){
            rev=rev+array[i];
        }
        System.out.println("Reversed string: "+rev);
    }
}

