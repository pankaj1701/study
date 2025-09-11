package com.study.saarthak.multithreading;

public class EvenThread extends Thread {
    public void run() {
        int num = 0;
        while(true){
            System.out.println("Even Number:" + num);
            num+=2;
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
