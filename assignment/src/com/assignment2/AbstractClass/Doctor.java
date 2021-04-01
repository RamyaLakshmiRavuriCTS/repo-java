package com.company;
//Doctor class extends from abstract class
public class Doctor extends Person {
    public Doctor() {
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
        return "Doctor has the responsibility to bring smiles on the faces of suffering humanity";
    }
}
