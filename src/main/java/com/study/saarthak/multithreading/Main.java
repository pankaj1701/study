package com.study.saarthak.multithreading;

public class Main {
    public static void main(String[] args) {
        /**OddThread t1 = new OddThread();
        EvenThread t2 = new EvenThread();
        t1.start();
        t2.start();*/
        /**ThreadRunnable tr1 = new ThreadRunnable(true);
        ThreadRunnable tr2 = new ThreadRunnable(false);
        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        t1.start();
        t2.start();*/
        /**TwoSyncOneNonSync task=new TwoSyncOneNonSync("Thread");
        Thread t1= new Thread(task);
        Thread t2= new Thread(task);
        t1.start();
        t2.start();*/

        OneThreadSyncSecNonSync t1 = new OneThreadSyncSecNonSync(" Synced task ",true);
        Class cls = OneThreadSyncSecNonSync.class;
        //OneThreadSyncSecNonSync t2 = new OneThreadSyncSecNonSync(" Non Sync Task ",true);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t1.taskName+" syncMethod1 running"+Thread.currentThread().getName());
                t1.syncMethod1();
                System.out.println("exit from syncMethod1"+Thread.currentThread().getName());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t1.taskName+" nonsyncMethod1 running"+Thread.currentThread().getName());
                t1.nonSyncMethod1();
                System.out.println("exit from nonsyncMethod1"+Thread.currentThread().getName());
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(t1.taskName+" syncMethod1 running"+Thread.currentThread().getName());
                t1.syncMethod1();
                System.out.println("exit from syncMethod1"+Thread.currentThread().getName());
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
