package com.assignment.interfaceClass;

public class Test {
    public static void main(String args[]) {
        //object for interface class
        SpeedLimit s;

        //object for speed class from interface class
        s = new Speed();
        //displaying methods of interface class
        s.print();
        //displays final speed initialized since getSpeed() method return speed in Speed class
        System.out.println(s.getSpeed());

        //object for bike class from interface class
        s=new Bike();
        //displaying methods of interface class
        s.print();
        //displays 0 since getSpeed() method return 0 in bike class
        System.out.println(s.getSpeed());

    }
}
