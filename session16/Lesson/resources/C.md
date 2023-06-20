###  pause a thread in Java  :   Thread.sleep()
-----------------------------------------
This method allows you to suspend the execution of a thread for a specified amount of time:


```java
public class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread

        // Pause the thread for 2 seconds
        try {
            Thread.sleep(2000); // Sleep for 2 seconds (2000 milliseconds)
        } catch (InterruptedException e) {
            // Handle any interrupted exception
            e.printStackTrace();
        }

        // More code after the pause
    }
}

```


In the above example, we have a run() method of a thread called MyThread.
Inside the run() method, we use Thread.sleep(2000) to pause the execution of the thread for 2 seconds (2000 milliseconds).
After the pause, the thread continues executing the code that follows the sleep statement.

It's important to note that Thread.sleep() can throw an InterruptedException if another thread interrupts the sleeping thread.
In the example above, we catch this exception and print the stack trace.
You can handle the interruption in a way that is appropriate for your application.

To start the thread and observe the pause, you can use the following code:

```java
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

```