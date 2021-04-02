package com.assignment.thread3;

public class Deadlock {
    public static void main(String[] args) throws InterruptedException
    {
        //creating object of the Object class
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = new Object();
        //creating constructor of the Thread class and passing SynchroniseThread object as a parameter
        Thread thread1 = new Thread(new SynchroniseThread(object1, object2), "thread1");
        Thread thread2 = new Thread(new SynchroniseThread(object2, object3), "thread2");
        //executing thread1
        thread1.start();
        //the sleep() method suspends the execution of the current thread (thread1) for the specific period
        Thread.sleep(2000);
        //executing thread2
        thread2.start();
        //suspends the execution of the current thread (thread2) for the specific period
        Thread.sleep(2000);
    }
}
