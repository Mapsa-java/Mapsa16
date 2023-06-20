###  Race condition
-----------------------------------------
A race condition is a concurrency-related issue that occurs when multiple threads
or processes access
shared resources or data simultaneously, leading to unpredictable and undesired outcomes. 
It arises due to the non-deterministic interleaving of operations performed by concurrent entities.


Race conditions typically occur when multiple threads or processes perform read and write operations on shared data concurrently, 
without proper synchronization or coordination. 



```java
public class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create multiple threads to increment the counter concurrently
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}

```


```java
public class Threads_02_01 {
    static double a = 10;
    static double b; 
 
    public static void main(String[] args) {
         Runnable r1 = ()->
            {
                if(a == 10)
             try {
                 Thread.sleep(0);
                 b = a/2.0;
                 System.out.println(Thread.currentThread().getName() + ": " + b);
             } catch (InterruptedException e) { }
            };
         Runnable r2 = () -> {
               a = 12;   
            };
        Thread thdA = new Thread(r1, "Thread A");
        Thread thdB = new Thread(r2, "Thread B");
        thdA.start();
        thdB.start();
        
    }
    
}
```