package com.assignment2.interfacing;

//creating another class and implementing it from interface
public class Pulsur implements IBike {
    //creating a integer field in pulsur class
    int gear;

    //overriding the methods declared in interface class
    @Override
    public void start() {
        System.out.println("pulsur started");
    }

    @Override
    public void gearChange(int gearChange) {
        gear=gearChange;
        System.out.println("pulsur gear:" +gear);
    }

    @Override
    public void stop() {
        System.out.println("pulsor stopped");

    }
}
