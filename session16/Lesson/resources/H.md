###  Thread confinement
-----------------------------------------

Thread confinement is a strategy for achieving thread safety by
ensuring that data is confined to individual threads, 
meaning that each thread has its own copy of the data and cannot directly
access or modify data belonging to other threads. 
This eliminates the need for synchronization mechanisms like locks or atomic operations.

```java
public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        // Create multiple counters for each thread
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        // Create multiple threads to increment the counters concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter1.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter2.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count for Counter 1: " + counter1.getCount());
        System.out.println("Final Count for Counter 2: " + counter2.getCount());
    }
}

```