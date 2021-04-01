package com.assignment2.abstraction;

/*
 *creating an abstract class person
 */
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

    //creating getters of the fields declared above(Name,Address)
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
