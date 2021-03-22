package com.assignment.reversestring;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inp="";
        Scanner sc = new Scanner(System.in);
        inp = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        int len=inp.length();
        for(int i=len-1;i>=0;i--){
            builder.append(inp.charAt(i));
        }
        System.out.println(builder);
    }
}
