package com.company;

public class Main {

    public static void main(String[] args) {
        //main class object
        ClassLevelLock threadsOne=new ClassLevelLock();
        //thread objects
        Thread thread1=new Thread(threadsOne);
        Thread thread2=new Thread(threadsOne);
        ClassLevelLock threadsTwo=new ClassLevelLock();
        Thread thread3=new Thread(threadsTwo);
        //setting names to threads
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
