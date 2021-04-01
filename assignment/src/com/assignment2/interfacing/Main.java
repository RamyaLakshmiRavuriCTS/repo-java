package com.assignment2.interfacing;

//importing the default field
import static com.assignment2.interfacing.IBike.speedLimit;

/*
 *main method for calling the classes and creating the instances
 */
public class Main {

    public static void main(String[] args) {
        royalenfield();
        pulsur();
    }

    //creating intance of pulsur
    private static void pulsur() {
        Pulsur pulsur =new Pulsur();
        pulsur.gearChange(3);
        pulsur.start();
        pulsur.stop();
        System.out.println("pulsur speedlimit:"+speedLimit );
    }

    //creating instance of royalenfield
    private static void royalenfield() {
        RoyalEnfield royalenfield =new RoyalEnfield();
        royalenfield.gearChange(2);
        royalenfield.start();
        royalenfield.stop();
        System.out.println("royal enfield speedlimit:"+speedLimit);
    }
}
