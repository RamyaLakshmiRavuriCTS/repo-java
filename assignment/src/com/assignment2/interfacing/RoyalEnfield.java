package com.assignment2.interfacing;

//creating a class and implementing it from interface
public class RoyalEnfield implements IBike{
    //creating a integer field in pulsur class
    int gear;

    //overriding the methods declared in interface class
    @Override
    public void start() {
        System.out.println("Royal Enfield is started");
    }

    @Override
    public void gearChange(int gearChange) {
        gear = gearChange;
        System.out.println("Royal Enfield gear: "+ gear);
    }

    @Override
    public void stop() {
        System.out.println("Royal Enfield stopped");

    }
}
