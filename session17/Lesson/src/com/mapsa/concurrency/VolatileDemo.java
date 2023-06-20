package com.mapsa.concurrency;


import java.util.concurrent.TimeUnit;

public class VolatileDemo {

    private static  int num = 0;
    private static  boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        volatileWorksHere();
      //  volatileNotWorksHere();
    }


    public static void volatileNotWorksHere() throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                num++;
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


    public static void volatileWorksHere() throws InterruptedException {

        Runnable task = () -> {


            while (flag) {
               // try {
//                try {
//                    TimeUnit.SECONDS.sleep(1);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                   System.out.println("I suppose flag is false! ");

            }
            System.out.println("I realized that flag becomes false! ");
        };

        Thread thread1 = new Thread(task);

        Thread thread2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                flag = false;
                System.out.println("flag becomes false");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


    }
}
