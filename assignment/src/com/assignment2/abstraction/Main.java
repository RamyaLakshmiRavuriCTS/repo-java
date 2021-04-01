package com.assignment2.abstraction;
/*
 * main class to implement all the methods
 */
public class Main {
    public static void main(String[] args) {
    //calling student method
        student();
    //calling teacher method
        teacher();
    //calling doctor method
        doctor();
    }

    //instantiating the student class and calling the abstract methods
    private static void student() {
        Student student = new Student("yoshitha","Hyderabad");
        student.role();
        student.workResponsibilities();
        student.objectsUse();
        student.timings();
    }

    //instantiating the teacher class and calling the abstract methods
    private static void teacher() {
        Teacher teacher = new Teacher("lakshmi","Vizag");
        teacher.role();
        teacher.workResponsibilities();
        teacher.objectsUse();
        teacher.timings();
    }
    //instantiating the doctor class and calling the abstract methods
    private static void doctor() {
        Doctor doctor = new Doctor("Revanth","Bangalore");
        doctor.role();
        doctor.workResponsibilities();
        doctor.objectsUse();
        doctor.timings();
    }
}
