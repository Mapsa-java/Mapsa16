###  Volatile 
----------------------------- ------------
The volatile keyword in Java is used to indicate that a variable's value may be modified 
by multiple threads, and therefore, proper synchronization should be applied to ensure visibility and consistency of the variable across threads.
It provides the following guarantees:



1. Visibility: When a variable is declared as volatile, changes made to that variable by one thread are immediately visible to other threads.
   It ensures that the most up-to-date value of the variable is always read from the main memory and not from a thread's local cache.

2. Atomicity: The volatile keyword does not provide atomicity guarantees for compound actions.
   It only ensures visibility.
   If you need atomic operations, you would need to use other synchronization mechanisms like locks or atomic classes.

```java
public class SharedFlagExample {
    private volatile boolean flag = false;

    public void setFlag() {
        flag = true;
    }

    public boolean getFlag() {
        return flag;
    }
}

```



```java
public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        SharedFlagExample sharedFlag = new SharedFlagExample();

        // Create a thread to continuously print the flag's value
        Thread printThread = new Thread(() -> {
            while (true) {
                System.out.println("Flag value: " + sharedFlag.getFlag());
            }
        });

        // Create a thread to modify the flag after a delay
        Thread modifyThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Delay for 2 seconds
                sharedFlag.setFlag();
                System.out.println("Flag modified!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        printThread.start();
        modifyThread.start();

        // Wait for a while before stopping the threads
        Thread.sleep(5000);

        // Stop the threads
        printThread.interrupt();
        modifyThread.interrupt();
    }
}


```