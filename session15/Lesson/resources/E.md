###   Sorting
----------------------------------------------
The sorted operation returns a new stream with the elements sorted according 
to the specified ordering. The original stream remains unchanged.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7, 2, 8, 4, 6);

        // Sort the numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNumbers);
    }
}

```


```java
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamSortingCustomComparatorExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve");

        // Sort the names based on length in descending order
        List<String> sortedNames = names.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}

```  