package com.company;
//class level lock
public class ClassLevelLock implements Runnable {
    public void run(){
        Lock();
    }
    public void Lock(){
        System.out.println(Thread.currentThread().getName());
        //thread acquired lock on ClassLevelLock class
        synchronized (ClassLevelLock.class){
            System.out.println("in block "+Thread.currentThread().getName());
            System.out.println("in block "+Thread.currentThread().getName()+" end");
        }
    }

}
