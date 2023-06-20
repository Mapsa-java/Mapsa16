### fuctional programing
-----------------------------------------
Main Concepts :
Pure Functions: Pure functions are functions that always produce the same output for the same input and have no side effects. They do not modify any external state or variables, making them predictable and easier to reason about.
Immutability: In functional programming, data is typically immutable, meaning it cannot be changed once created. Instead of modifying existing data, functional programs create new data structures with the desired changes. Immutability helps avoid issues related to shared mutable state and enables safer concurrency.
Higher-Order Functions: Functional programming treats functions as first-class citizens. This means that functions can be assigned to variables, passed as arguments to other functions, and returned as values. Higher-order functions take one or more functions as arguments or return a function as a result. They enable powerful abstraction and composition techniques.
Function Composition: Functional programming encourages composing small, reusable functions to build larger programs. Function composition involves combining functions together to create new functions. This allows for modular and concise code that is easier to understand and test.
Recursion: Instead of using loops, functional programming often relies on recursion to perform repetitive tasks. Recursive functions call themselves with modified parameters until a base case is reached. Recursion is a fundamental technique in functional programming and enables elegant solutions for many problems.
Referential Transparency: Referential transparency means that a function can be replaced by its result without affecting the behavior of the program. It allows for reasoning about code in terms of expressions and their values, rather than their effects or state changes.
Lazy Evaluation: Lazy evaluation is a technique where the evaluation of an expression is delayed until its value is actually needed. This can improve efficiency by avoiding unnecessary computations, especially in infinite or large data streams.



Pure Functions:
```java
// Functional approach
public int add(int a, int b) {
    return a + b;
}

// Object-oriented approach
public class Calculator {
    private int result;

    public void add(int a, int b) {
        this.result = a + b;
    }

    public int getResult() {
        return this.result;
    }
}

```


Immutability : 

```java
// Functional approach
public List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
        .map(n -> n * 2)
        .collect(Collectors.toList());
        }

// Object-oriented approach
public class ListProcessor {
    public void doubleList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
    }
}

```


Higher-Order Functions:


```java
// Functional approach
public void processNumbers(List<Integer> numbers, Function<Integer, Integer> operation) {
    for (int number : numbers) {
        int result = operation.apply(number);
        System.out.println(result);
    }
}

// Object-oriented approach
public interface NumberProcessor {
    void processNumber(int number);
}

public class NumberPrinter implements NumberProcessor {
    @Override
    public void processNumber(int number) {
        System.out.println(number);
    }
}

public void processNumbers(List<Integer> numbers, NumberProcessor processor) {
    for (int number : numbers) {
        processor.processNumber(number);
    }
}

```


Recursion :
Recursion is a technique where a function calls itself with modified parameters until a base case is reached. It is a fundamental concept in functional programming. Here's an example of recursive factorial function:

```java
// Recursive factorial function
function factorial(n) {
  if (n <= 1) {
    return 1;
  }
  return n * factorial(n - 1);
}
```


n an object-oriented approach using Java, recursion can also be used, but the emphasis is often on iteration using loops. Here's an iterative factorial function:

```java
// Iterative factorial function in Java
public class MyClass {
  public static int factorial(int n) {
    int result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(factorial(5)); // Output: 120
  }
}

```


Referential Transparency:
Referential transparency means that a function can be replaced by its result without affecting the behavior of the program. In other words, given the same inputs, a function will always produce the same output, allowing for substitution. Here's an example in Haskell, a purely functional programming language:


```java
// Lack of referential transparency in Java
public class MyClass {
  private int result;

  public void add(int x) {
    result += x;
  }

  public int getResult() {
    return result;
  }

  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.add(3);
    int result1 = obj.getResult();
    obj.add(4);
    int result2 = 7;

    boolean sameResult = (result1 == result2); // Output: false
  }
}

```