package com.study.saarthak.multithreading;

public class TwoSyncOneNonSync implements Runnable{
    String taskName;
    public void run() {
        syncMethod1();
        syncMethod2();
        nonSyncMethod1();
    }
    TwoSyncOneNonSync(String taskName){
        this.taskName = taskName;
    }
    public synchronized void syncMethod1(){
        for(int i=1;i<4;i++){
            System.out.println(taskName+" syncMethod1 running: "+i+Thread.currentThread().getName());

        }try { Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized void syncMethod2(){
        for(int i=1;i<4;i++){
            System.out.println(taskName+" syncMethod2 running: "+i+Thread.currentThread().getName());
        }
        try { Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void nonSyncMethod1(){
        for(int i=1;i<4;i++){
            System.out.println(taskName+" nonSyncMethod1 running: "+i+Thread.currentThread().getName());
        }
    }

}
