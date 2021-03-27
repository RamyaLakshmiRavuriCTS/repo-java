package com.assignment.bikeSpeed;

//Yamaha Class implements all methods in Speed interface
public class Yamaha implements Speed {

    //returning speed value that is declared with final keyword in Speed interface
    @Override
    public int getSpeed() {
        return Speed.speed;
    }

    //implementing manufacturingStatus() method
    @Override
    public void manufacturingStatus() {
        System.out.println("100 yamaha bikes are manufactured");
    }
}
