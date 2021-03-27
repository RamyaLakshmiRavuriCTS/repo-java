package com.assignment.bikeSpeed;

public class Main {

    public static void main(String[] args) {

        //assigning false input to speed
        int speed = 110;

        //creating objects for Yamaha and Pulsar classes
        Yamaha yamaha = new Yamaha();
        Pulsar pulsar = new Pulsar();
        
        yamaha.manufacturingStatus();
        System.out.println("Speed = "+yamaha.getSpeed());

        pulsar.manufacturingStatus();
        speed = pulsar.getSpeed();
        System.out.println("Speed = "+speed);

    }

}
