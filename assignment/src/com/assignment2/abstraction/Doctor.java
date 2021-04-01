package com.assignment2.abstraction;

/**
 * creating a class doctor and extending from person
 */
public class Doctor extends Person {

    //constructer to get name and address
    public Doctor(String name, String address) {
        super(name, address);
    }

    /*
     *implimenting the abstract methods
     *methods to know role, responsibilities, objects, work timings of a doctor
     */
    @Override
    public void role() {
        System.out.println(getName()+ " is a doctor and stays at " +getAddress());
    }

    @Override
    public void workResponsibilities() {
        System.out.println("curing diseases of patients, operating patients are rsponsibilities");
    }

    @Override
    public void objectsUse() {
        System.out.println("stethoscope is the main object used by doctors");
    }

    @Override
    public void timings() {
        System.out.println("should be ready for 24 hours of service");

    }
}
