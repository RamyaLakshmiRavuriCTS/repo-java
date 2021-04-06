package com.assignment.exception2;

public class Exception2 {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 5,9,7,3};

        System.out.println("Index is 2 = "+arr[2]);

        //catching ArrayIndexOutOfBoundsException exception in catch block
        try {
            System.out.println("Index is 6 = " + arr[6]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("End of main");
        }
    }
}
