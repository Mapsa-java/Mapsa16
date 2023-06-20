###   Slicing stream -
limit ,  skip , takeWhile , dropWhile
----------------------------------------------

limit : 
The limit operation allows you to specify the maximum number of elements you want to extract from a stream.
It returns a new stream that contains, at most, the specified number of elements from the original stream.


```java
import java.util.stream.Stream;

public class StreamLimitExample {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Limit the stream to the first 5 elements
        Stream<Integer> limitedStream = numbers.limit(5);

        limitedStream.forEach(System.out::println);
    }
}

```

skip:
The skip operation allows you to skip a specified number of elements from the beginning of a stream and obtain a new stream containing the remaining elements.


```java
import java.util.stream.Stream;

public class StreamSkipExample {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Skip the first 3 elements
        Stream<Integer> skippedStream = numbers.skip(3);

        skippedStream.forEach(System.out::println);
    }
}

```

takeWhile:
The takeWhile operation returns a new stream that contains the longest prefix of elements that satisfy a given condition. 
It stops processing the stream as soon as an element is encountered that does not match the condition.

```java
import java.util.stream.Stream;

public class StreamTakeWhileExample {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> takenStream = numbers.takeWhile(num -> num <= 5);

        takenStream.forEach(System.out::println);
    }
}

```



dropWhile:
The dropWhile operation returns a new stream that excludes the longest prefix of elements that satisfy a given condition. 
It skips elements from the stream until an element is encountered that does not match the condition, 
and includes the remaining elements.

```java
import java.util.stream.Stream;

public class StreamDropWhileExample {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> droppedStream = numbers.dropWhile(num -> num <= 5);

        droppedStream.forEach(System.out::println);
    }
}

```

// Skip the first 3 students and print their details
// Take students until their age is less than 20 and print their emails
// Take students until their age is less than 20 and print their emails
// Drop students until their age is less than 20 and print their phone numbers
       