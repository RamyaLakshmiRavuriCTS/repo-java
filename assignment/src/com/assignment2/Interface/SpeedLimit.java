package com.company;

public interface SpeedLimit {
    final int speed=90;
    default int getSpeed(){
        return speed;
    }
    void print();
}
