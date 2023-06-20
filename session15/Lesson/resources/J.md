###   Reducers : 

findFirst , findAny
----------------------------------------------


Both findFirst and findAny are terminal operations in Java streams that can be used to retrieve elements from a stream based on certain conditions. 
Here's how they work and the differences between them:


findFirst:

The findFirst method returns an Optional object that represents the first element of the stream, or an empty Optional if the stream is empty.
It is useful when you want to find the first element that matches a given condition or retrieve the first element of a stream.
The findFirst operation may provide a predictable result when working with sequential streams.



findAny:

The findAny method returns an Optional object that represents any element of the stream,
or an empty Optional if the stream is empty.
It is useful when you want to find any element that matches a given condition or retrieve any element of a stream.
The findAny operation is especially useful when working with parallel streams,
where it may offer better performance due to the possibility of running multiple computations
in parallel and returning the result from the first one that completes.
Example usage: Finding any student with a GPA above a specified threshold.



```java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> first = numbers.stream()
                .findFirst();

        Optional<Integer> any = numbers.stream()
                .findAny();

        System.out.println("First element: " + first.orElse(null));
        System.out.println("Any element: " + any.orElse(null));
    }
}


```


1: 
2: Find any male student with an age below a specified limit.