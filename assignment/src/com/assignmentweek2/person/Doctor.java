package com.assignmentweek2.person;

public class Doctor extends Person{
    private String name;
    private String address;
    public Doctor(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    void display() {
        System.out.println("Doctor Role: "+getName());
    }

    @Override
    void Address() {
        System.out.println("Doctor Address: " + getAddress());
    }
}
