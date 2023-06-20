###   synchronization mechanisms  :  Synchronized Method
-----------------------------------------

Synchronized methods in Java provide a way to synchronize entire methods, ensuring that only one thread can execute the method at a time.
They simplify synchronization by automatically acquiring and releasing the lock associated with the object on which the method is called.


Here's how you can use synchronized methods:

1. Declare the Method as Synchronized:
   To create a synchronized method, you need to use the synchronized keyword in the method declaration. The syntax is as follows:

```java
public synchronized void methodName() {
    // Method body
}

```

By adding the synchronized keyword, you indicate that the entire method should be synchronized.

```java
public class SynchronizedMethodExample {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }
}

```