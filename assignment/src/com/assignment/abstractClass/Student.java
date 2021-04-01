package com.assignment.abstractClass;

//student class extends from abstract class
public class Student extends RolesAndResponsibilities{

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
        return "Student has the responsibility to concentrate on studies.";
    }
}
