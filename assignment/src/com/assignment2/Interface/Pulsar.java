package com.company;
//creating another class and implementing it from interface
public class Pulsar implements Bikes {
    //creating a integer field in pulsar class
    int gear;

    //overriding the methods declared in interface class
    @Override
    public void start() {
        System.out.println("pulsar started");
    }

    @Override
    public void gearChange(int gearChange) {
        gear=gearChange;
        System.out.println("pulsar gear:" +gear);
    }

    @Override
    public void stop() {
        System.out.println("pulsar stopped");

    }
}
