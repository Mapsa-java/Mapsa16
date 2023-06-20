package com.mapsa.concurrency;

public class MyThread extends Thread {
    public void run() {
        while (!isInterrupted()) {
            // Code to be executed in the thread
            System.out.println("Thread is running.");

            // Long-running operation
//            try {
//                Thread.sleep(1000); // Sleep for 1 second
//            } catch (InterruptedException e) {
//                System.out.println("isInterrupted : " + Thread.currentThread().isInterrupted());
//                // Handle InterruptedException and exit the thread if needed
//                System.out.println("Thread interrupted. Exiting.");
//
//            }
        }

        System.out.println(isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println(isInterrupted());
    }
}