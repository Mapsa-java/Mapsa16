###   Filter
----------------------------------------------

The filter operation in streams takes a Predicate as a parameter, 
which defines the condition that each element must meet in order to be included in the resulting stream. 
The Predicate is a functional interface that represents a boolean-valued function, 
meaning it takes an argument of a certain type and returns a boolean value indicating whether the condition is true or false.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers using filter
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}


```

Filter students by gender (e.g., FEMALE)
Get the average GPA of male students


