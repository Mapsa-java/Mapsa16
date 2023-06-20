###   FlatMap
----------------------------------------------
flatMap is a method available in the Stream class in Java,
which is part of the Java 8 Stream API. 
It is primarily used for transforming and flattening streams.


The flatMap method takes a function as an argument, 
which is applied to each element in the stream. 
This function produces another stream for each element, and then flatMap concatenates all the generated streams into a single stream. 
In other words, it "flattens" the stream of streams into a single stream.


```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        Stream<Integer> flattenedStream = listOfLists.stream()
                .flatMap(item->item.stream());

        flattenedStream.forEach(System.out::println);
    }
}

```