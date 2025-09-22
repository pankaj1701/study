package com.study.saarthak.multithreading;

public class SynchronizeTest implements Runnable {
private String synctest;
public SynchronizeTest(String abc){
    synctest = abc;
}
public synchronized   void  printSynctest(){
    // this.synctest=input;
    synctest+=Thread.currentThread().getName();

    try{
        System.out.println("sleeping for 5 sec "+Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("exit form sleep");
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    //synctest=synctest+Thread.currentThread().getName();
    System.out.println("synctest="+this.synctest);
    // System.out.println("input="+input);

}
public static void main(String[] args) throws InterruptedException {
    long time1=System.currentTimeMillis();

    SynchronizeTest synchronizeTest = new SynchronizeTest("hello");
    Thread t1= new Thread(synchronizeTest);


    // SynchronizeTest synchronizeTest1 = new SynchronizeTest("helloworld");
    Thread t2= new Thread(synchronizeTest);

    t1.start();
    t2.start();
    t1.join();
    t2.join();
    long time2=System.currentTimeMillis();
    System.out.println("exiting main . time taken =" + (time2-time1));

    //synchronizeTest.printSynctest("hello");
}

@Override
public void run() {
    printSynctest();
}
}

