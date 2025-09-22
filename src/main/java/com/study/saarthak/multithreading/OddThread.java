package com.study.saarthak.multithreading;

public class OddThread extends Thread {
    public void run(){
        int num=1;
        while(true){
            System.out.println("Odd number "+num);
            num+=2;
            try{
                Thread.sleep(150);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
