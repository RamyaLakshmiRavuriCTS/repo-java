package com.assignment.speedLimit;

public class Main {
    public static void main(String[] args) {
        Honda bike2= new Honda(80);
        bike2.ManufacturerName();
        bike2.speed(10);
        Bajaj bike3 =new Bajaj(120);
        bike3.ManufacturerName();
        bike3.speed(10);
        Yamaha bike4= new Yamaha(-1);
        bike4.ManufacturerName();
        bike4.speed(10);
    }
}