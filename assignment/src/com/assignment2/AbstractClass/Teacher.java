package com.company;

public class Teacher extends Roles{
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
        return "Teacher has the responsibility to mentor and nurture students";
    }
}
