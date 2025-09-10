package com.study.saarthak.multithreading;

public class Main {
    public static void main(String[] args) {
        MainAfterThread t1 = new MainAfterThread();
        MainAfterThread t2 = new MainAfterThread();
        MainAfterThread t3 = new MainAfterThread();

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main after Threads");
    }
}
