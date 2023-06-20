###   Queue

-------------------------------------
In Java, the Queue interface is a part of the java.util package and provides an implementation of a queue data structure.
It follows the First-In-First-Out (FIFO) principle, where the element that is inserted first will be the first one to be removed.

Adding Elements:
add(element): Adds an element to the queue if space is available. Throws an exception if the queue is full.
offer(element): Adds an element to the queue if space is available. Returns true if successful, false otherwise.
Removing Elements:
remove(): Removes and returns the head of the queue. Throws an exception if the queue is empty.
poll(): Removes and returns the head of the queue. Returns null if the queue is empty.
Retrieving Elements:
element(): Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
peek(): Retrieves, but does not remove, the head of the queue. Returns null if the queue is empty.
Size and Empty Check:
size(): Returns the number of elements in the queue.
isEmpty(): Returns true if the queue is empty, false otherwise.



Different implementations of the Queue interface in Java provide various characteristics and performance trade-offs.
Here are some commonly used implementations:

LinkedList:

Implementation: LinkedList is a doubly-linked list-based implementation of the Queue interface.
Characteristics:
Efficient for adding or removing elements at both ends of the queue (head or tail).
Allows flexibility to use it as a queue, stack, or deque.
Supports all operations of the Queue interface efficiently.
Example:
```java
Queue<DataType> queue = new LinkedList<>();

```
ArrayDeque:

Implementation: ArrayDeque is a resizable array-based implementation of the Queue interface.
Characteristics:
Provides efficient insertion and removal of elements at both ends of the queue.
Performs well for random access or searching elements.
Generally has better performance characteristics compared to LinkedList.
Example:
```java
Queue<DataType> queue = new ArrayDeque<>();
```

PriorityQueue:

Implementation: PriorityQueue is an implementation of a priority queue based on a priority heap.
Characteristics:
Orders elements based on their priority, allowing quick access to the highest or lowest priority element.
Provides efficient retrieval of the highest or lowest priority element.
Allows customization of the priority ordering using a comparator.
Example:

```java
Queue<DataType> queue = new PriorityQueue<>();

```

Thread-safe implementations:

ConcurrentLinkedQueue: A concurrent, unbounded queue based on a linked list.
LinkedBlockingQueue: A bounded or unbounded blocking queue based on a linked list.
ArrayBlockingQueue: A bounded blocking queue based on an array.
SynchronousQueue: A blocking queue that can only hold a single element at a time.
PriorityBlockingQueue:  is a concurrent implementation of a priority queue based on a priority heap.