package com.assignmentweek2.speedlimit;

/*
This is the Jawa class
 */
public class Jawa implements Bike{
    /*
This is  Jawa speed method
 */
    @Override
    public void speed(int speed) {
        System.out.println("Jawa Bike speed is : " + speedLimit);
    }
    /*
This Is Jawa manufacturing name method
 */
    public void ManufacturerName(){
        System.out.println("Jawa Manufacturer");
    }
}
