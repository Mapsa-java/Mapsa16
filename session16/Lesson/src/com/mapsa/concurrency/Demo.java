package com.mapsa.concurrency;

public class Demo {

    public static void main(String[] args) throws InterruptedException {

//        Thread[] threads = new Thread[Thread.activeCount()] ;
//       Thread.enumerate(threads) ;
//
//        for(Thread item : threads) {
//            System.out.println("name : " + item.getName());
//            System.out.println("Priority : " + item.getPriority());
//            System.out.println("State : " + item.getState());
//            System.out.println("Daemon : " + item.isDaemon());
//            System.out.println("==============================");
//        }
//
//
//        System.out.println(Runtime.getRuntime().availableProcessors());
       // System.out.println(Thread.enumerate(te));
       // System.out.println("mmdm");


//        Thread thread = new Thread(new TaskIncrement() , "MyThread") ;
//        thread.start();

       // System.out.println("------------" + Thread.activeCount());


//        Thread thread  = new TaskIncrementThread() ;
//        thread.start();
//        System.out.println("main finished");

        Thread thread = new Thread(new TaskIncrement() , "MyThread") ;
        System.out.println("1 - MyThread Status : " + thread.getState());
        thread.start();
        System.out.println("1 - MyThread Status : " + thread.getState());


        Thread.sleep(2000);
        System.out.println("1 - MyThread Status : " + thread.getState());


        thread.join();

        System.out.println("MyThread Status : " + thread.getState());
        System.out.println("Main Done");

    }
}
