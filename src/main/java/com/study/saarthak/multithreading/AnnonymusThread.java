package com.study.saarthak.multithreading;

public class AnnonymusThread {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int num =1;
                while(true){
                    System.out.println("Odd number "+ num);
                    num+=2;
                    try{
                        Thread.sleep(200);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int num =0;
                while(true){
                    System.out.println("Even number "+ num);
                    num+=2;
                    try{
                        Thread.sleep(200);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }
}
