package com.mapsa.concurrency;

public class RaceConditionSecondExample {

    static double  a = 10;
    static double b;

    static Object lock = new Object();


    public static void main(String[] args) {
        Runnable r1 = ()->
        {
            synchronized (lock){
                if(a == 10)
                    try {
                        Thread.sleep(0 , 200000);
                        b = a/2.0;
                        System.out.println(Thread.currentThread().getName() + ": " + b);
                    } catch (InterruptedException e) {

                    }
            }

        };
        Runnable r2 = () -> {
            synchronized (lock){
                a = 12;
            }
            System.out.println("a becomes 12.");

        };
        Thread thdA = new Thread(r1, "Thread A");
        Thread thdB = new Thread(r2, "Thread B");
        thdA.start();
        thdB.start();

    }

}
