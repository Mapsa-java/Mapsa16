### Stream
-----------------------------------------
What Are Streams in Java? 
Java streams enable functional-style operations on streams of elements.
A stream is an abstraction of a non-mutable collection of functions applied in some order to the data. 
A stream is not a collection where you can store elements.


1 - Creating a Stream from a Collection:


```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Stream<Integer> stream = numbers.stream();

```

2 - Creating a Stream from an Array:

```java
String[] names = {"John", "Jane", "Adam"};
Stream<String> stream = Arrays.stream(names);

```

3 - Creating a Stream using Stream.of():

```java
Stream<String> stream = Stream.of("apple", "banana", "orange");

```

4 - Creating an Infinite Stream using Stream.generate(): 

```java
Stream<Integer> stream = Stream.generate(() -> 1);
stream.limit(5).forEach(System.out::println);  // Prints "1" five times

```

Practice : 

Suppose you are building a simple program to simulate a dice game.
The game involves rolling a six-sided die, and you want to generate a stream of dice rolls.

5 - Creating a Stream using Stream.iterate():

```java
Stream<Integer> stream = Stream.iterate(0, n -> n + 2);
stream.limit(5).forEach(System.out::println);
```


practice :
start with a specific startDate (January 1, 2023) and use the lambda expression (date -> date.plusDays(1)) 
to generate subsequent dates by adding one day to the previous date.

6 - Creating a Stream from a File:
```java
Path filePath = Paths.get("path/to/file.txt");
Stream<String> stream = Files.lines(filePath);

```


7 - Creating a Stream of Characters from a String:

```java
String text = "Hello, World!";
IntStream stream = text.chars();

```

practice :
String sentence = "The quick brown fox jumps over the lazy dog";
Count the number of vowels in the sentence


8 - Creating a Stream from a Stream Builder:

```java
Stream.Builder<Integer> builder = Stream.builder();
builder.add(1).add(2).add(3);
Stream<Integer> stream = builder.build();

```



