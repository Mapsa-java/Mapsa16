###  Joining a thread in Java
-----------------------------------------

the join() method allows one thread to wait for another thread to complete its execution.
By using the join() method, you can ensure that the execution of the calling thread is paused until the joined thread finishes.
Here's how you can use the join() method:

```java
public class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            myThread.join(); // Wait for myThread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Joined thread has completed. Continuing with the main thread.");
    }
}


```

In the above example, we have a MyThread class that extends the Thread class and overrides the run() method. Inside the run() method, we have the code that will be executed in the thread.

In the Main class, we create an instance of MyThread and start it using the start() method. After starting the thread, we call myThread.join() to wait for the myThread to complete its execution. The join() method ensures that the calling thread (in this case, the main thread) will wait until myThread finishes before continuing.

If the joined thread (in this case, myThread) throws an InterruptedException, you need to catch and handle it appropriately, as shown in the example.

Once the joined thread completes, the execution resumes in the main thread, and the code after the join() method call continues to execute.

By using the join() method, you can control the order of execution and synchronization between threads in your Java application.