package com.assignment.person;
public class Student extends Person {
    //constructer to get name and address
    public Student(String name, String address) {
        super(name, address);
    }

    //implimenting the abstract methods
    @Override
    public void role() {
        System.out.println(getName()+ " is a Student and stays at "+getAddress());
    }

    @Override
    public void workResponsibilities() {
        System.out.println("Lerning books, attending classes are resposibilities of "+getName());
    }

    @Override
    public void objectsUse() {
        System.out.println("students use objects like books, pens");
    }

    @Override
    public void timings() {
        System.out.println("Timings are 9:00am-3:00pm");
    }
}