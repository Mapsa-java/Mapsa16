package com.mapsa.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskIncrementThread extends Thread{

    //static AtomicInteger num = new AtomicInteger(0) ;

    static Lock lock = new ReentrantLock() ;
    static int num = 0 ;

    public static void main(String[] args) throws InterruptedException {
        Thread task1  = new Thread(()->{
            for(int i = 0 ; i< 100_000 ; i++){
                lock.lock();
                num++;
                lock.unlock();
            }
        });

        Thread task2  = new Thread(()->{
            for(int i = 0 ; i< 100_000 ; i++){
                lock.lock();
                num++;
                lock.unlock();
            }
        });

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        System.out.println("num is : " + num);
    }
}
