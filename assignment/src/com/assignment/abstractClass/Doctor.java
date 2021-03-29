package com.assignment.abstractClass;

//doctor class extends from abstract class
public class Doctor extends RolesAndResponsibilities{

    //implementing the abstract methods
    @Override
    String getName() {
        return name;
    }

    @Override
    void setName(String name) {
        this.name=name;
    }

    @Override
    String getAddress() {
        return address;
    }

    @Override
    void setAddress(String address) {
        this.address=address;
    }

    @Override
    String rolesAndResponsibilities() {
        return "Doctor the has the responsibility to provide proper treatment.";
    }
}
