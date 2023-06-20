package com.mapsa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo {


    public static void main(String[] args) throws InterruptedException {
        ExecutorService task = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            task.execute(()->{

                System.out.println("task num " + finalI + "started");
                try {
                    TimeUnit.MILLISECONDS.sleep(finalI *1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


            });
        }

       // task.shutdown();
        TimeUnit.SECONDS.sleep(1);
        task.shutdownNow();
      //  task.submit();

    }

/*    public static void main(String[] args) throws InterruptedException {
        Thread task = new Thread(()->{
            while (true){
                //try {
                 //   TimeUnit.MILLISECONDS.sleep(500);
                    System.out.println("Im running");

            }
        });
        task.start();

        TimeUnit.SECONDS.sleep(2);
        System.out.println(task.getState());

    }*/

}
