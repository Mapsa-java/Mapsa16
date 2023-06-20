###  Strategies for thread safety 
-----------------------------------------
1. Thread confinement: You can ensure thread safety by confining data to individual threads. 
For example, using local variables within a thread's method scope ensures that each thread has its own copy of the data, 
avoiding shared access and synchronization concerns.

2. Immutable objects: By designing your classes to be immutable, 
you eliminate the need for synchronization altogether. 
Immutable objects cannot be modified after creation, making them inherently thread-safe.

3. Synchronization using synchronized keyword: You can use the synchronized keyword to synchronize access to critical sections of code. 
By applying synchronized to methods or blocks, only one thread can execute that code block at a time, ensuring thread safety.

4. Use of Lock objects: The java.util.concurrent.locks package provides lock objects such as
ReentrantLock and ReadWriteLock that offer more flexibility than intrinsic locks (synchronized). 
Lock objects allow explicit locking and unlocking, enabling finer-grained control over thread synchronization.

5. Atomic variables: The java.util.concurrent.atomic package provides atomic classes like
AtomicInteger and AtomicReference that allow operations on shared variables to be performed atomically,
without the need for explicit locking. Atomic variables are designed to be thread-safe and provide guarantees for concurrent access.

6. Thread-safe collections: Java provides thread-safe implementations of common 
collection classes in the java.util.concurrent package, such as ConcurrentHashMap and CopyOnWriteArrayList. 
These classes are designed to handle concurrent access and modifications safely.

