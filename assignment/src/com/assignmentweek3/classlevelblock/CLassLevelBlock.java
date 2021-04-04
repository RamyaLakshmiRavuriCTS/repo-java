package com.assignmentweek3.classlevelblock;

public class CLassLevelBlock implements Runnable {
    @Override
    public void run() {
        classLock();
    }
    /*
    This method is to lock the thread through out the class till completion of thread
     */
    public void classLock() {
        synchronized(CLassLevelBlock.class) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("in block" + Thread.currentThread().getName());
            System.out.println("in block " + Thread.currentThread().getName() + " end");
        }
    }
    /*
    This is the main method
     */
    public static void main(String[] args) throws InterruptedException {
        CLassLevelBlock test1 = new CLassLevelBlock();
        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test1);
        Thread thread3 = new Thread(test1);
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");
        thread1.start();
        thread1.sleep(1000);
        thread3.start();
        thread3.sleep(1000);
        thread2.start();
    }
}
