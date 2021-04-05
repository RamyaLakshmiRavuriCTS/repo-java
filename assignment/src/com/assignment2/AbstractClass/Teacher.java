package com.company;
//Teacher class extends from abstract class
public class Teacher extends Person {
    public Teacher() {
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
        return "Teacher has the responsibility to mentor and nurture students";
    }
}
