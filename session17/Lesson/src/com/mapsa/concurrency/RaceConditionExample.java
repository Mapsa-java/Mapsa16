package com.mapsa.concurrency;

public class RaceConditionExample {

    private static volatile int num = 0 ;


    public static void main(String[] args) throws InterruptedException {



        // Create multiple threads to increment the counter concurrently
        Runnable task = ()-> {
            for (int i = 0; i < 100_000; i++) {
               num++ ;
            }
        };

        Thread thread1 = new Thread(task);

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                num++;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final num: " + num);

    }



}
