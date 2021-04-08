package com.assignment.interfaceClass;

public class Bike implements SpeedLimit{

    //implementing interface methods
    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Speed of the KTM is restricted");
    }
}
