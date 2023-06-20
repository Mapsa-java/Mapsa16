###   Distinct
----------------------------------------------
The distinct method is available in the Stream class in Java, which is part of the Java 8 Stream API. 
It is used to eliminate duplicate elements from a stream, 
ensuring that only unique elements are present in the resulting stream.


```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 3, 6);

        Stream<Integer> distinctNumbersStream = numbers.stream().distinct();

        distinctNumbersStream.forEach(System.out::println);
    }
}

```