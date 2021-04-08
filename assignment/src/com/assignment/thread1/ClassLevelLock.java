package com.assignment.thread1;

public class ClassLevelLock implements Runnable{

    public void run() {
        Lock();
    }

    //this method provides class level lock
    public void Lock()
    {
        //this allows only one thread at a time
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
        //Initializing threads
        Thread t1 = new Thread(classLevelLock);
        Thread t2 = new Thread(classLevelLock);
        Thread t3 = new Thread(classLevelLock);
        //Setting name for threads
        t1.setName("thread1");
        t2.setName("thread2");
        t3.setName("thread3");
        //Starting the thread
        t1.start();
        t3.start();
        t2.start();
    }
}
