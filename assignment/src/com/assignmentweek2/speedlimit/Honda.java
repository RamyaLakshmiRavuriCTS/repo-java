package com.assignmentweek2.speedlimit;
/*
This is the Honda class
 */
public class Honda implements Bike {

/*
This is  Honda speed method
 */
    @Override
    public void speed(int speed) {
        System.out.println("Honda Bike speed is : " + speedLimit);

    }
/*
This Is Honda manufacturing name method
 */
    @Override
    public void ManufacturerName() {
        System.out.println("Honda Manufacturer");
    }



}
