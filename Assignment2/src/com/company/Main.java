package com.company;
import java.lang.*;
import java.util.*;
class Main {
    public static void main(String[] args)
    {
        String input="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        input = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        int len=input.length();
        for(int i=len-1;i>=0;i--){
            builder.append(input.charAt(i));
        }
        System.out.println("Reversed string: "+builder);
    }
}

