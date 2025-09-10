package com.study.saarthak.multithreading;

public class MainAfterThread extends Thread {
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try { Thread.sleep(100); }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
