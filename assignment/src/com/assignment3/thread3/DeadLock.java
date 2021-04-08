package com.assignment3.thread3;

public class DeadLock{
        public static void main(String[] args) throws InterruptedException
        {
            Object object1 = new Object();
            Object object2 = new Object();
            Thread thread1 = new Thread(new SynchroniseThread(object1,object2), "thread1");
            Thread thread2 = new Thread(new SynchroniseThread(object1,object2), "thread2");
            thread1.start();
            Thread.sleep(2000);
            thread2.start();
            Thread.sleep(2000);
        }
}