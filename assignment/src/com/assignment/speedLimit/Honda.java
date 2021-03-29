package com.assignment.speedLimit;

public class Honda implements Bike{
    private double speed;
    public Honda(double speed) {
        this.speed = speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    @Override
    public void ManufacturerName(){
        System.out.println("Honda Manufacturer");
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
    public double getSpeed() {
        return speed;
    }
}