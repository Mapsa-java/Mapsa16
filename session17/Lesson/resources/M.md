###  wait(), notify(), and notifyAll() 
----------------------------- ------------
In Java, the wait(), notify(), and notifyAll() methods are used in conjunction with the synchronized keyword 
to enable communication and coordination between threads.
These methods are defined in the Object class and can be called on any object.

1. wait() method:

The wait() method is used to make a thread wait until another thread notifies it.
When a thread calls wait(), it releases the lock it holds on the object and enters a waiting state until it is notified by another thread.
The wait() method must be called inside a synchronized block or method to ensure proper synchronization and avoid IllegalMonitorStateException.
Syntax: object.wait()

2. notify() method:

The notify() method wakes up a single thread that is waiting on the same object.
It chooses one of the waiting threads and signals it to continue execution.
The choice of the thread to be notified is arbitrary and depends on the JVM's implementation.
Like wait(), the notify() method must be called inside a synchronized block or method.
Syntax: object.notify()


3. notifyAll() method:

The notifyAll() method wakes up all threads that are waiting on the same object.
It signals all waiting threads to continue execution.
Like wait() and notify(), the notifyAll() method must be called inside a synchronized block or method.
Syntax: object.notifyAll()



```java
public class WaitNotifyExample {
    public static void main(String[] args) {
        final Object lock = new Object();
        
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1: Waiting for lock...");
                    lock.wait(); // Thread 1 waits for a notification
                    System.out.println("Thread 1: Resumed execution.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2: Acquired lock.");
                System.out.println("Thread 2: Performing some task.");
                lock.notify(); // Thread 2 notifies one waiting thread (Thread 1)
            }
        });

        thread1.start();
        
        try {
            Thread.sleep(1000); // Delay to ensure Thread 1 starts waiting first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}

```


