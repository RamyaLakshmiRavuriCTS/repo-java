package com.company;

public class Doctor extends Roles{
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
        return "Doctor has the responsibility to bring smiles on the faces of suffering humanity";
    }
}
