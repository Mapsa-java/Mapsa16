### creating a thread in Java
-----------------------------------------

1. Extending the Thread Class
2. Implementing the Runnable Interface



Extending the Thread Class :

The first approach involves creating a new class that extends the Thread class and overrides the run() method.
Here's an example:

```java
public class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running.");
    }
}

```

In the above example, we create a new class called MyThread that extends the Thread class.
We override the run() method, which contains the code that will be executed when the thread is started.
To start the thread, you can create an instance of the MyThread class and call the start() method:

```java
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
```

Implementing the Runnable Interface:
The second approach involves implementing the Runnable interface. 
This approach is useful when you want to separate the thread's behavior from the class's inheritance hierarchy.
Here's an example:

```java
public class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running.");
    }
}

```
In the above example, we create a class called MyRunnable that implements the Runnable interface.
We implement the run() method, which contains the code to be executed in the thread.
To start the thread, you need to create an instance of the MyRunnable class and pass it as an argument to the Thread constructor. 
Then, call the start() method on the Thread instance:

```java
public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

```


### Extending the Thread Class  OR   Implementing the Runnable Interface?

Extending the Thread Class:
* This approach involves creating a new class that extends the Thread class.
* By extending the Thread class, your class is limited to single inheritance, as Java does not support multiple inheritance.
* Extending the Thread class directly ties the thread behavior to the class's inheritance hierarchy.
* This approach is simpler and more straightforward, especially for simple cases where you don't need to extend another class or interface.


Implementing the Runnable Interface:
* This approach involves implementing the Runnable interface and passing an instance of the implementing class to the Thread constructor.
* Implementing Runnable allows your class to still extend other classes or implement other interfaces, providing more flexibility in the inheritance hierarchy.
* Implementing Runnable separates the thread behavior from the class's inheritance hierarchy, promoting better encapsulation and loose coupling.
* This approach is recommended when you need to decouple the thread's behavior from the class's inheritance hierarchy or when you want to implement multiple interfaces.


#### summary
use the approach of extending the Thread class when simplicity is the primary concern,
and use the approach of implementing the Runnable interface when you need more
flexibility, decoupling, or the ability to extend other classes/interfaces.