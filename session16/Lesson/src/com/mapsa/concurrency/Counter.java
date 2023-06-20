package com.mapsa.concurrency;

public class Counter {
    private int count = 0;
    private int average = 2000;

    Object lockCount = new Object();
    Object lockAverage = new Object();

   /* public void increment() {
        synchronized (lockCount){
            count++;
        }

    }
*/


    public synchronized void increment() {
            count++;
    }

    public synchronized void incrementAve() {
           average++;
    }

   /* public void incrementAve() {
        synchronized (lockAverage){
            average++;
        }

    }*/

    public int getCount() {
        return count;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}