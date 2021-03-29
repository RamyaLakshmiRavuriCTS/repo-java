package com.assignment.person;

public class Main {
    public static void main(String[] args) {

        student();

        teacher();

        doctor();
    }

    //instantiating the student class and calling the abstract methods
    private static void student() {
        Student student = new Student("Hari","Vijayawada");
        student.role();
        student.workResponsibilities();
        student.objectsUse();
        student.timings();
    }

    //instantiating the teacher class and calling the abstract methods
    private static void teacher() {
        Teacher teacher = new Teacher("Vijay","Hyderabad");
        teacher.role();
        teacher.workResponsibilities();
        teacher.objectsUse();
        teacher.timings();
    }
    //instantiating the doctor class and calling the abstract methods
    private static void doctor() {
        Doctor doctor = new Doctor("Chaitanya","Vizag");
        doctor.role();
        doctor.workResponsibilities();
        doctor.objectsUse();
        doctor.timings();
    }
}