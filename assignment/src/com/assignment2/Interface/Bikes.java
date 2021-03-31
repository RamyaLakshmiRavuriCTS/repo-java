package com.company;
//creating an interface and declaring the fields
public interface Bikes {

    //setting final to restrict the speedlimit field
    final int speedLimit=90;

    //creating void methods
    void start();
    void gearChange(int gearChange);
    void stop();
}
