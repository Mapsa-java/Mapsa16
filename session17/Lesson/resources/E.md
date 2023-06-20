###  interrupt a thread   :   interrupt()
-----------------------------------------
you can interrupt a thread by invoking the interrupt() method on the thread object.
This method sets the interrupt status of the thread,
which can be checked using the isInterrupted() method. Here's how you can interrupt a thread:
```java
public class MyThread extends Thread {
    public void run() {
        while (!isInterrupted()) {
            // Code to be executed in the thread
            System.out.println("Thread is running.");

            // Long-running operation
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                // Handle InterruptedException and exit the thread if needed
                System.out.println("Thread interrupted. Exiting.");
                return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // Interrupt the thread after 5 seconds
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread.interrupt(); // Interrupt the thread
    }
}


```

In the above example, we have a MyThread class that extends the Thread class. Inside the run() method, we have a while loop that runs until the thread is interrupted. Within the loop, we have the code to be executed in the thread.

The Thread.sleep(1000) statement simulates a long-running operation that the thread performs repeatedly. If the thread is interrupted while sleeping, an InterruptedException is thrown. We catch this exception, print a message, and exit the thread by using the return statement.

In the Main class, we create an instance of MyThread and start it using the start() method. After waiting for 5 seconds using Thread.sleep(5000), we call myThread.interrupt() to interrupt the thread.

The interrupted thread checks its interrupt status using isInterrupted() within the while loop. If the interrupt status is set, the thread exits the loop and completes its execution.

It's important to handle InterruptedException properly and exit the thread when interrupted, as shown in the example. This ensures that the thread can gracefully respond to the interrupt signal.

By interrupting a thread, you can request the thread to stop its execution, but it's up to the thread to check its interrupt status and respond accordingly.



###  interrupted() VS isInterrupted() 


interrupted() Method:

The interrupted() method is a static method defined in the Thread class.
It checks the interrupted status of the current thread and returns a boolean value indicating whether the interrupted status is set.
If the interrupted status is set, the method will clear the interrupted status of the thread, resetting it to false.
In other words, if the thread has been interrupted since the last time interrupted() was called, it will return true; otherwise, it will return false.


isInterrupted() Method:

The isInterrupted() method is an instance method defined in the Thread class.
It checks the interrupted status of a specific thread instance and returns a boolean value indicating whether the interrupted status is set.
If the interrupted status is set, the method will return true, but it does not clear the interrupted status of the thread.
In other words, it is a non-static method that checks whether a particular thread instance has been interrupted.
