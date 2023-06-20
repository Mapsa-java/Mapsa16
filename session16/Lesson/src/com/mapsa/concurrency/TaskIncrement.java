package com.mapsa.concurrency;

public class TaskIncrement implements  Runnable{

    @Override
    public void run() {
//        System.out.println("------- in TaskIncrement : " + Thread.currentThread().getName());
//        System.out.println("-------in TaskIncrement activeCount " + Thread.activeCount());
        for ( int i = 0 ; i <= 1_000_000 ; i++ ){
            if( i%10_000 == 0 )
                System.out.println(i);


            if (Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("Thread Interrupted");
                return;
            }

//            if ( i == 500_000){
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    System.out.println("Interrupted Exit");
//                   return;
//                }
//            }

        }

    }
}
