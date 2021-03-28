package com.assignmentweek2.speedlimit;

public class Main {
    public static void main(String[] args) {
        Honda bike2= new Honda(80);
        bike2.ManufacturerName();
        bike2.speed(10);
        Jawa bike3 =new Jawa (120);
        bike3.ManufacturerName();
        bike3.speed(10);
        Yamaha bike4= new Yamaha(-1);
        bike4.ManufacturerName();
        bike4.speed(10);
    }
}
