package com.company;
import static com.company.Bikes.speedLimit;

public class Main {

    public static void main(String[] args) {
        royalEnfield();
        pulsar();
    }

    //creating instance of pulsar
    private static void pulsar() {
        Pulsar pulsar =new Pulsar();
        pulsar.gearChange(3);
        pulsar.start();
        pulsar.stop();
        System.out.println("pulsar speedlimit:"+speedLimit );
    }

    //creating instance of royalenfield
    private static void royalEnfield() {
        RoyalEnfield royalenfield =new RoyalEnfield();
        royalenfield.gearChange(2);
        royalenfield.start();
        royalenfield.stop();
        System.out.println("royal enfield speedlimit:"+speedLimit);
    }
}
