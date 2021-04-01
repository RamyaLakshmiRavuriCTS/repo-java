package com.assignmentweek2.speedlimit;

/*
This is the Yamaha class
 */
public class Yamaha implements Bike {
    /*
This is  Yamaha speed method
 */
    @Override
    public void speed(int speed) {
        System.out.println("Yamaha Bike speed is : " + speedLimit);
    }
    /*
This Is Yamaha manufacturing name method
 */
    public void ManufacturerName() {
        System.out.println("Yamaha Manufacturer");
    }

}
