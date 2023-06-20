###   Map
----------------------------------------------

The map operation takes a Function as a parameter, 
which defines how each element of the stream should be transformed. 
This function is applied to each element,
and the result becomes the new value of that element in the resulting stream.



```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");

        // Convert each name to uppercase using map
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);
    }
}

```

Get the average GPA of male students


