package com.assignment3.thread3;

class SynchroniseThread implements Runnable
{
    private Object object1;
    private Object object2;
    public SynchroniseThread(Object o1, Object o2)
    {
        this.object1="Lock1";
        this.object2 ="Lock2";
    }
    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println(name + " acquire lock on " + object1);
        synchronized (object1)
        {
            System.out.println(name + " acquired lock on " + object1);
        }
        System.out.println(name + " released lock of " + object1);
        synchronized (object2)
        {
            System.out.println(name + " acquire lock on " + object2);
        }
        System.out.println(name + " released lock of " + object2);
        System.out.println(name + " execution is completed.");
    }
}