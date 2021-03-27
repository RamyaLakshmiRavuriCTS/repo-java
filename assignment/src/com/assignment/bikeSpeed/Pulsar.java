package com.assignment.bikeSpeed;

//Pulsar Class implements all methods in Speed interface
public class Pulsar implements Speed{

    //returning speed value that is declared with final keyword in Speed interface
    @Override
    public int getSpeed() {
        return Speed.speed;
    }

    //implementing manufacturingStatus() method
    @Override
    public void manufacturingStatus() {
        System.out.println("200 pulsar bikes are manufactured");
    }
}
