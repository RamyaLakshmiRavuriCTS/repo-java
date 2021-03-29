package com.company;

public class Speed implements SpeedLimit{
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void print() {
        System.out.println("Speed of Ducati is restricted");
    }
}
