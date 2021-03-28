package com.assignment2.abstraction;

public abstract class Person {
    //creating fields of name and address
    private String name;
    private String address;

    //creating a contructor to get name and address
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //creating abstract methods
    public abstract void role();
    public abstract void workResponsibilities();
    public abstract void objectsUse();
    public abstract void timings();

    //creating getters of the fields declared above
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
