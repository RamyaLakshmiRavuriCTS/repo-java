package com.company;

public class Main {

    public static void main(String[] args) {
        SpeedLimit s;
        s= new Speed();
        s.print();
        s= new Bike();
        s.print();

        System.out.println(s.getSpeed());
    }
}
