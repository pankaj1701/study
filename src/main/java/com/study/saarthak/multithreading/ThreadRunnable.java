package com.study.saarthak.multithreading;

public class ThreadRunnable implements Runnable {
    boolean isOdd;
    public static Object lock = new Object();
    ThreadRunnable (){};
    public static int num =1;
    ThreadRunnable (boolean printOdd){
        isOdd = printOdd;
    }
    public synchronized void test(){
        System.out.println("Synchronized test");
    }
    public static synchronized void test1(){
        System.out.println("Synchronized test1");
    }
    public void run() {
        while (true) {
            synchronized (lock) {
                if (isOdd && num % 2 == 1) {
                    System.out.println("Odd number " + num);
                    lock.notify();
                    num++;
                } else if (!isOdd && num % 2 == 0) {
                    System.out.println("Even number " + num);
                    lock.notify();
                    num++;
                } else {
                    try { Thread.sleep(200);
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}



