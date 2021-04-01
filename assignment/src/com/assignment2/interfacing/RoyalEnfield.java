package com.assignment2.interfacing;

/*
 *creating a class and implementing it from interface
 */
public class RoyalEnfield implements IBike{
    //creating a integer field in pulsur class
    int gear;

    /*
     *overriding the methods declared in interface class
     */

    //method to start the royal enfield
    @Override
    public void start() {
        System.out.println("Royal Enfield is started");
    }

    //method to change the gears of royal enfield
    @Override
    public void gearChange(int gearChange) {
        gear = gearChange;
        System.out.println("Royal Enfield gear: "+ gear);
    }

    //method to stop the royal enfield
    @Override
    public void stop() {
        System.out.println("Royal Enfield stopped");

    }
}
