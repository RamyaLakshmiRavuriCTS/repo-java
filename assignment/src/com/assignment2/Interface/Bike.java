package com.company;

public class Bike implements SpeedLimit{
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("Speed of RE is restricted");
    }
}
