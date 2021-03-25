package com.assignment.stringReverse;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){

        System.out.println("Enter the string");
        Scanner sc;
        sc = new Scanner(System.in);
        //input from the user
        String s=sc.nextLine();
        //displaying the reversed string by call the method
        System.out.println(reverse(s));



    }

    public static String reverse(String s) {
        //storing the string in character array
        char ch[]=s.toCharArray();
        //creating the empty string reverse to store the reversed string
        String reverse="";
        //reversing the string
        for(int i=s.length()-1;i>=0;i--){
            reverse+=ch[i];
        }
        return reverse;

    }
}
