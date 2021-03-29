package com.company;

public class Student extends Roles{
    @Override
    String getName() {
        return name;
    }

    @Override
    String getAddress() {
        return address;
    }

    @Override
    void setName(String name) {
        this.name=name;
    }

    @Override
    void setAddress(String address) {
        this.address=address;
    }

    @Override
    String Roles() {
        return "Student has the responsibility of meeting academic expectations";
    }
}
