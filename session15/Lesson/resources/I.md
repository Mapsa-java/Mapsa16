###   Reducers : 

allMatch, anyMatch, and noneMatch
----------------------------------------------


allMatch:
The allMatch method is a terminal operation that checks if all elements in a stream satisfy a given condition. 
It returns true if the condition is true for all elements, and false otherwise.


```java
List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        boolean allEven = numbers.stream().allMatch(num -> num % 2 == 0);

```


anyMatch :
The anyMatch method is a terminal operation that checks if any element in a stream satisfies a given condition. 
It returns true if the condition is true for at least one element, and false otherwise.


```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean anyEven = numbers.stream().anyMatch(num -> num % 2 == 0);


```


noneMatch : 

The noneMatch method is a terminal operation that checks if none of the elements in a stream satisfy a given condition. 
It returns true if the condition is false for all elements, and false otherwise.


```java
List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
boolean noneEven = numbers.stream().noneMatch(num -> num % 2 == 0);

```



practice :
Check if any student in a classroom has a name starting with a specific letter.
Check if all students are adults (age 18 or older) in a given list.
Check if any student has a GPA higher than a specified threshold.

