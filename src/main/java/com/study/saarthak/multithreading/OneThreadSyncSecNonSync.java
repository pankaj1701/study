package com.study.saarthak.multithreading;

public class OneThreadSyncSecNonSync {
    String taskName;
    boolean callSync;

    /**public void run() {
        if (callSync) {
            syncMethod1();
        } else {
            nonSyncMethod1();
        }
    }*/

    OneThreadSyncSecNonSync(String  taskName, boolean callSync) {
        this.taskName = taskName;
        this.callSync = callSync;
    }

    public synchronized void syncMethod1() {
        for (int i = 1; i < 4; i++) {

            System.out.println(taskName + " SyncMethod1 running: " + i + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public void nonSyncMethod1 () {
            for (int i = 1; i < 4; i++) {
                System.out.println(taskName + " NonsyncMethod1 running: " + i + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        public static synchronized void staticSyncMethod1() {
            for (int i = 1; i < 4; i++) {

                System.out.println(" StaticSyncMethod1 running: " + i + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    public static synchronized void staticSyncMethod2() {
        for (int i = 1; i < 4; i++) {

            System.out.println(" StaticSyncMethod2 running: " + i + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void staticNonSyncMethod3() {
        for (int i = 1; i < 4; i++) {

            System.out.println(" StaticNonSyncMethod3 running: " + i + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    }


