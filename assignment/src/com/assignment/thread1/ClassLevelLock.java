package com.assignment.thread1;

public class ClassLevelLock implements Runnable{
    public void run() {
        Lock();
    }
    //method provides class level lock
    public void Lock()
    {
        //Allows only one thread at a time
        synchronized (this)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("in block "+ Thread.currentThread().getName());
            System.out.println("in block "+ Thread.currentThread().getName()+ " end");
        }
    }
    public static void main(String[] args)
    {
        ClassLevelLock classLevelLock = new ClassLevelLock();
        //Thread Initialization
        Thread th1 = new Thread(classLevelLock);
        Thread th2 = new Thread(classLevelLock);
        Thread th3 = new Thread(classLevelLock);

        //Setting name for threads
        th1.setName("thread1");
        th2.setName("thread2");
        th3.setName("thread3");

        //Starting the threads
        th1.start();
        th3.start();
        th2.start();
    }
}