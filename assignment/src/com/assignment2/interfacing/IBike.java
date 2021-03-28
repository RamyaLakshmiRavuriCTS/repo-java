package com.assignment2.interfacing;

//creating an interface and declaring the fields
public interface IBike {

    //setting final to restrict the speedlimit field
    final int speedLimit=90;

    //creating void methods
    void start();
    void gearChange(int gearChange);
    void stop();
}

