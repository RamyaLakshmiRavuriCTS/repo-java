package com.assignment.abstractClass;

//Teacher class extends from abstract class
public class Teacher extends RolesAndResponsibilities{

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
        return "Teacher has the responsibility to make the subject interesting.";
    }
}
