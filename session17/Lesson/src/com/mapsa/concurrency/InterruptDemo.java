package com.mapsa.concurrency;

public class InterruptDemo {

//    public static void main(String[] args) throws InterruptedException {
//        Thread task = new Thread(new TaskIncrement());
//        task.start();
//
//
//        task.interrupt();
//    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // Interrupt the thread after 5 seconds
        try {
            Thread.sleep(1000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.interrupt(); // Interrupt the thread
    }
}
