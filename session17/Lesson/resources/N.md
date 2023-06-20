###  Atomic Object
----------------------------- ------------
In Java, the java.util.concurrent.atomic package provides a set of classes that support atomic operations
on single variables without the need for explicit locking. 
These classes are designed to be used in scenarios where multiple threads access and modify shared variables concurrently.

The java.util.concurrent.atomic package includes various classes, 
such as AtomicInteger, AtomicLong, AtomicBoolean, and more. 
These classes provide atomic operations on their corresponding primitive types.

Key features of atomic objects:

1. Atomicity: The operations performed on atomic objects are atomic, meaning they are executed as a single, indivisible unit. 
   These operations are thread-safe and do not require explicit synchronization.
2. Lock-free synchronization: Atomic objects use low-level hardware support, such as compare-and-swap (CAS) instructions,
   to achieve lock-free synchronization. This eliminates the need for explicit locks and reduces contention between threads.
3. Ordering guarantees: Atomic objects provide ordering guarantees, ensuring that 
   the operations performed on them are visible to other threads in a consistent 
   and predictable order.
   They support both volatile-like and synchronized-like semantics.


```java
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();//
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final Count: " + counter.get());
    }
}

```