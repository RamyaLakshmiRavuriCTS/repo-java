package com.assignment2.abstraction;

/*
 *creating a class of teacher and extending it from the person class
 */
public class Teacher extends Person{
    //constructer to get name and address
    public Teacher(String name, String address) {
        super(name, address);
    }

    /*
     *implimenting the abstract methods
     *methods to know role, responsibilities, objects, work timings of a doctor
     */
    @Override
    public void role() {
        System.out.println(getName()+ " is a teacher and stays at "+getAddress());
    }

    @Override
    public void workResponsibilities() {
        System.out.println( "Teaching students, marking attendance are responsibilities of " +getName());
    }

    @Override
    public void objectsUse() {
        System.out.println("Teachers use objects like board, chalk");

    }

    @Override
    public void timings() {
        System.out.println("Timings are 9:00am-5:00pm");
    }
}
