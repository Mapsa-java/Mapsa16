package com.mapsa.concurrency;

public class RaceConditionExample {

   /* public static void main(String[] args) throws InterruptedException {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        // Create multiple threads to increment the counter concurrently
        Runnable task = ()-> {
            for (int i = 0; i < 100_000; i++) {
                counter1.increment();
            }
        };

        Thread thread1 = new Thread(task);

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter2.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count: " + (counter1.getCount() + counter2.getCount()));
    }*/


    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();


        // Create multiple threads to increment the counter concurrently
        Runnable task = ()-> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
                counter.incrementAve();
            }
        };

        Thread thread1 = new Thread(task);

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                counter.increment();
                counter.incrementAve();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count: " + counter.getCount());
        System.out.println("Final Count: " + counter.getAverage());
    }
}
