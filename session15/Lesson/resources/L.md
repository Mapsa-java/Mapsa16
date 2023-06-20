###   Reducers : 

reduce
---------------------------------------------- 

The reduce operation in Java streams allows you to combine the elements of a stream into a single result.
It can be used to perform aggregation, summarization, or any other
computation that involves combining elements.

The reduce operation takes two parameters: an identity value and an accumulator function. 
The identity value serves as the initial value or default result.
The accumulator function specifies how the elements of the stream should be combined.


Binary Reduce: This form of reduce combines the elements of the stream pairwise. 
The accumulator function takes two parameters
representing the partial result and the current element,
and returns a new partial result.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);

```



Three-argument Reduce:

This form of reduce allows you to specify an identity value.
The accumulator function combines the identity value with the elements of the stream. 
This form is useful when the stream is empty and you want to provide a default result.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);

```


Summing the elements of a list:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
System.out.println("Sum: " + sum.orElse(0));

```

Finding the maximum value in a list:

```java
List<Integer> numbers = Arrays.asList(1, 5, 2, 4, 3);
Optional<Integer> max = numbers.stream().reduce(Integer::max);
System.out.println("Max: " + max.orElse(0));

```

Concatenating strings:
```java
List<String> strings = Arrays.asList("Hello", " ", "World", "!");
String result = strings.stream().reduce("", String::concat);
System.out.println("Concatenated String: " + result);

```

Building a complex object:
```java
List<String> words = Arrays.asList("This", "is", "an", "example");
String concatenated = words.stream().reduce("", (a, b) -> a.concat(" " + b));
System.out.println("Concatenated Words: " + concatenated);

```



Practice :
use the reduce operation to concatenate their full names into a single string.
use the reduce operation to find the maximum GPA among the students.
