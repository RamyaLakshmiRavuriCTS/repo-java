package com.company;
//Student class extends from abstract class
public class Student extends Person {

    public Student() {
        super();
    }
//implementing the abstract methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setAddress(String address) {
        this.address=address;
    }

    @Override
    public String Roles() {
        return "Student has the responsibility of meeting academic expectations";
    }
}
