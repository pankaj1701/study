package com.study.saarthak.multithreading;

public class SingleThread extends Thread {
    public void run() {
        try {
            sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Hello SimpleThread "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t = new SingleThread();
        t.start();
        //t.start();
        Thread t1 = new SingleThread();
        t1.start();
        System.out.println("Main Method ends "+Thread.currentThread().getName());

    }
}
