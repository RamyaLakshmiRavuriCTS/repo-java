package com.assignment.speedLimit;


public class Yamaha implements Bike{
    public double speed;
    public Yamaha(double speed) {
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void speed(double speed) {
        if (this.speed <= 90 && this.speed>0) {
            System.out.println("Speed of Bike is : "+getSpeed());
        }
        else if(this.speed>90)
        {
            System.out.println("Restricting Speed");
        }
        else{ System.out.println("Invalid Speed");
        }
    }
    public void ManufacturerName(){
        System.out.println("Yamaha Manufacturer");
    }
}