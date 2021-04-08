package com.assignment.interfaceClass;

public class Speed implements SpeedLimit{

    //implementing interface methods
    @Override
    public int getSpeed(){
        return speed;
    }

    @Override
    public void print() {
        System.out.println("Speed of the RX100 is restricted.");
    }

}
