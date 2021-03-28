package com.assignmentweek2.person;

public class Student  extends Person{
    protected String name;
    protected String address;
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
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
     void Studentdisplay(){
        System.out.println("Student Role: "+getName());
    }
    @Override
    void Teacherdisplay() {
    }
    @Override
    void Doctordisplay() {
    }
    @Override
    void StudentAddress() {
        System.out.println("Student Address: "+getAddress());
    }
    @Override
    void TeacherAddress() {
    }
    @Override
    void DoctorAddress() {
    }
}
