###   Map

-------------------------------------
java.util.Map interface, which represents a collection of key-value pairs.
It provides methods to manipulate and retrieve data based on keys. There are several classes that implement the Map interface in Java, such as HashMap, TreeMap, and LinkedHashMap.
Let's go through some basic concepts and examples using HashMap.


1 : Creating a HashMap and Adding Elements

```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Print the map
        System.out.println(map);
    }
}

```

Accessing Values by Key:
```java
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Retrieve values by key
        int age = map.get("Alice");
        System.out.println("Alice's age: " + age);
    }
}

```

Exercise:
Write a Java program that takes a sentence as input from the user and counts the frequency of each word in the sentence.
Display the word frequencies in a tabular format.