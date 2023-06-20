###   synchronization mechanisms   :   Synchronized Block
-----------------------------------------

Synchronized blocks provide a way to synchronize a specific block of code within a method or code block,
allowing only one thread to execute it at a time. It gives you more fine-grained control over synchronization compared to synchronized methods.

Here's how you can use synchronized blocks:

1. Specify the Object for Synchronization:
To create a synchronized block, you need to specify the object on which the lock will be acquired. 
This object acts as a monitor or mutex.
It ensures that only one thread can execute the synchronized block at a time. 
Typically, you create a dedicated object solely for synchronization purposes. For example:

2. Define the Synchronized Block:
Once you have the lock object, you can define the synchronized block using the synchronized keyword.
The syntax is as follows:

```java
synchronized (lock) {
    // Code to be synchronized
}

```
The block of code within the curly braces will be synchronized,
meaning only one thread can execute it at a time.

3. Acquire and Release the Lock:
The synchronized block automatically acquires the lock associated with the specified object 
when a thread enters the block and releases it when the thread exits the block.
This ensures mutual exclusion, preventing multiple threads from executing the synchronized block simultaneously.

It's important to note that the lock object must be the same across all threads that need to synchronize access to the shared resource. 
If different threads use different lock objects, synchronization will not work as intended.

Here's an example to illustrate synchronized blocks:
```java
public class SynchronizedBlockExample {
    private final Object lock = new Object();
    private int counter = 0;

    public void increment() {
        // Synchronized block
        synchronized (lock) {
            counter++;
        }
    }
}

```

In this example, the increment() method uses a synchronized block to ensure that only one thread can increment the counter at a time.
When a thread enters the synchronized block, it acquires the lock on the lock object. 
Other threads trying to enter the synchronized block will be blocked until the lock is released by the current executing thread.

Synchronized blocks are particularly useful when you want to synchronize only a specific portion of a method or code block,
allowing other parts to execute concurrently. It provides a balance between granularity and synchronization control, 
helping to prevent data races and maintain thread safety.