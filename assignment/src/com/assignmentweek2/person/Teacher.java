package com.assignmentweek2.person;

public class Teacher extends Person {
    protected String name;
    protected String address;
    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName()
    {
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
    void Studentdisplay() {
    }
    void Teacherdisplay(){
        System.out.println("Teacher Role: "+getName());
    }
    @Override
    void Doctordisplay() {
    }
    @Override
    void StudentAddress() {
    }
    @Override
    void TeacherAddress() {
        System.out.println("Teacher Address: "+getAddress());
    }
    @Override
    void DoctorAddress() {
    }
}
