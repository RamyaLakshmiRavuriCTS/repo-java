package com.assignment.stringReversal;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char a[] = str.toCharArray();
        int n = str.length();
        char t;
        for(int i=0;i<str.length()/2;i++) {
            t = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = t;
        }
        String res = String.valueOf(a);
        System.out.println(res);
    }
}
