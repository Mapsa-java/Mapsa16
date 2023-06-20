###   LinkedLists

-------------------------------------

A LinkedList is a data structure that consists of a sequence of nodes, where each node contains a value and a reference to the next node in the sequence. 
It provides dynamic memory allocation and efficient insertion and deletion operations compared to arrays.


```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Access elements in the LinkedList
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Iterate over the elements in the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Remove an element from the LinkedList
        linkedList.remove("Banana");
        System.out.println("Elements in the LinkedList after removal:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}

```


1 : Adding Elements

```java
linkedList.add("Mango");
linkedList.add(1, "Grapes");
```

2 : Removing Elements

```java
linkedList.remove("Banana");
linkedList.remove(2);
```
3 : Accessing Elements

```java
String firstElement = linkedList.getFirst();
String lastElement = linkedList.getLast();
String element = linkedList.get(2);

```

4 : Iterating over Elements
```java
for (String element : linkedList) {
System.out.println(element);
}

Iterator<String> iterator = linkedList.iterator();
while (iterator.hasNext()) {
String element = iterator.next();
System.out.println(element);
}

```

5 : Other Useful Methods:

size(): Returns the number of elements in the LinkedList.
isEmpty(): Checks if the LinkedList is empty.
contains(element): Checks if the LinkedList contains a specific element.
indexOf(element): Returns the index of the first occurrence of the specified element.
clear(): Removes all elements from the LinkedList.
addAll(collection): Adds all the elements from a collection to the end of the LinkedList.
toArray(): Converts the LinkedList to an array.



### data structure of LinkedList 
-----------------------------------------------
In Java, the LinkedList class uses a doubly linked list as its underlying data structure.
It means that each element in the LinkedList is represented by a node object 
that contains the element's value and references to both the previous and next nodes in the sequence.

The LinkedList class in Java maintains two instance variables: 
first and last, which hold references to the first and last nodes in the list, respectively. 
Each node in the list has a reference to its previous node (prev) and a reference to its next node (next).


```
              LinkedList
        -------------------------
first ->|       Node 1          |
        |-----------------------|
        | value | next |  prev  |
        |-----------------------|
        |       Node 2          |
        |-----------------------|
        | value | next |  prev  |
        |-----------------------|
        |       Node 3          |
        |-----------------------|
        | value | next |  prev  |
        |-----------------------|
                    ...
                    ...
                    ...
        |-----------------------|
        |       Node n          |
        |-----------------------|
        | value | next |  prev  |
        -------------------------
                                 <- last

```



### Big O Notation : 
**Insertion and Deletion:**

Insertion and deletion operations at the beginning of a LinkedList have a time complexity of O(1) since we only need to update the first reference and adjust the links of the neighboring nodes.
Insertion and deletion operations at the end of a LinkedList also have a time complexity of O(1) because we can directly update the last reference and adjust the links of the neighboring nodes.
Insertion and deletion operations at a specific index in a LinkedList have a time complexity of O(n), where n is the number of elements in the list. This is because we need to traverse the list from either the first or last node to reach the desired index.

**Accessing Elements:**

Accessing an element at a specific index in a LinkedList has a time complexity of O(n) because we need to traverse the list from either the first or last node to reach the desired index.
Accessing the first and last elements in a LinkedList has a time complexity of O(1) since we can directly retrieve them using the first and last references.

###  LinkedList and ArrayList : 
--------------------------------------------------
Data Structure:

LinkedList: It is implemented as a doubly-linked list, where each element (node) contains a reference to the previous and next elements in the list.
ArrayList: It is implemented as a dynamic array, which means it internally uses an array to store the elements.

Memory Efficiency:

LinkedList: It uses more memory compared to ArrayList due to the extra memory required for storing the node references.
ArrayList: It uses less memory compared to LinkedList because it only needs to store the elements in a contiguous block of memory.

Usage Scenarios:

LinkedList: It is suitable when frequent insertions or deletions are required, and random access by index is not a primary concern. It is often used in scenarios that involve queues, stacks, or when implementing certain algorithms like graph traversals.
ArrayList: It is suitable when random access and retrieval of elements by index are frequent operations. It is commonly used in scenarios where the size of the collection is known in advance or when elements are frequently added or removed at the end.
###  Exercise :
--------------------------------------------------
Exercise : Removing Duplicates
Write a program that creates a LinkedList of strings. Implement a method that removes duplicate elements from the LinkedList, keeping only the first occurrence of each element

Exercise : Splitting a LinkedList
Write a program that splits a LinkedList of integers into two separate LinkedLists. The first LinkedList should contain all even numbers, and the second LinkedList should contain all odd numbers.