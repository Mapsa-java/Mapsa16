###  Executor
----------------------------- ------------
In Java, an Executor is a higher-level interface that provides a way to execute tasks asynchronously and manage thread execution. 
It decouples task submission from task execution,
allowing you to focus on the logic of your tasks rather than managing 
threads directly.
The Executor framework provides a flexible and efficient 
way to handle concurrent programming in Java.


The primary interface in the Executor framework is the Executor interface itself, 
which defines a single method called execute(Runnable command).
This method accepts a Runnable task and submits it for execution. 
The Executor implementation determines how the task will be executed,
whether immediately, in a separate thread, or in a thread pool.


Here's an example of how to use the Executor framework:

```java
Executor executor = Executors.newSingleThreadExecutor();

Runnable task = new Runnable() {
    @Override
    public void run() {
        // Code to be executed asynchronously
        System.out.println("Task executed!");
    }
};

executor.execute(task);

// Shutdown the executor when you're done
executor.shutdown();


```


In this example, we create an Executor using Executors.newSingleThreadExecutor(), which creates an executor that uses a single thread to execute tasks sequentially. We then define a Runnable task with the logic to be executed asynchronously. The execute() method is called on the executor, submitting the task for execution. Finally, we shut down the executor when we no longer need it.

Java provides several implementations of the Executor interface, including ThreadPoolExecutor, which manages a pool of worker threads, and ScheduledThreadPoolExecutor, which allows for scheduling tasks to run periodically or after a delay.

Using the Executor framework helps manage thread creation, pooling, and recycling, and provides a clean separation between task submission and execution. It simplifies concurrent programming in Java by abstracting away the low-level details of thread management and allowing you to focus on the logic of your tasks.