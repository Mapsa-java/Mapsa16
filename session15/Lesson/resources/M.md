###   Collector : 

---------------------------------------------- 


a Collector is used to combine the elements of a stream into a single result, such as a list, set, or a custom data structure. 
It provides a way to perform mutable reduction operations on the elements of a stream and collect them into a container.

toList 

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "Dave", "Eve");

        List<String> nameList = names.stream()
                .collect(Collectors.toList());

        System.out.println("Name List: " + nameList);
    }
}


```

toSet : 

```java
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Carol", "Dave", "Eve");

        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());

        System.out.println("Name Set: " + nameSet);
    }
}


```
toMap : 

Using toMap(Function<? super T , ? extends K> keyMapper,
            Function<? super T, ? extends U> valueMapper):

In this example, we have a Student class with a firstName field and an age field.
We create a list of Student objects representing various students.
We then use the stream() method to convert the list into a stream. 
Next, we apply the Collectors.toMap() collector with the key mapper as Student::getFirstName to extract the first name as the key, 
and the value mapper as Student::getAge to extract the age as the value for the map entries. 
The result is a Map where each student's first name is mapped to their corresponding age.


```java

public class ToMapExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 25),
                new Student("Bob", 30),
                new Student("Carol", 20)
        );

        Map<String, Integer> studentMap = students.stream()
                .collect(Collectors.toMap(Student::getFirstName, Student::getAge));

        System.out.println("Student Map: " + studentMap);
    }
}

```


Using toMap(Function<? super T, ? extends K> keyMapper,
            Function<? super T, ? extends U> valueMapper,
            BinaryOperator<U> mergeFunction)


Map<String, String> studentMap = students
                               .stream()
                               .collect(Collectors.toMap(Student::getStudentId, 
                                                         Student::getFirstName, 
                                                        (existingValue, newValue) -> newGeneratedValue));

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class Student {
    private String firstName;
    private int age;

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}

public class ToMapExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 25),
                new Student("Bob", 30),
                new Student("Carol", 25),
                new Student("Dave", 30),
                new Student("Eve", 25)
        );

        Map<Integer, String> ageToNamesMap = students.stream()
                .collect(Collectors.toMap(
                        Student::getAge,
                        Student::getFirstName,
                        (existingValue, newValue) -> existingValue + ", " + newValue
                ));

        System.out.println("Age to Names Map: " + ageToNamesMap);
    }
}

```       



map each gender to its corresponding count: 


List<Student> students = Arrays.asList(
new Student("Alice", Gender.FEMALE),
new Student("Bob", Gender.MALE),
new Student("Carol", Gender.FEMALE),
new Student("Dave", Gender.MALE),
new Student("Eve", Gender.FEMALE)
);




groupingBy: 

groupingBy(Function<? super T, ? extends K> classifier))

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String firstName;
    private int age;

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
}

public class GroupingByExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Carol", 20),
                new Student("Dave", 22),
                new Student("Eve", 21)
        );

        Map<Integer, List<Student>> studentsByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        System.out.println("Students grouped by age: " + studentsByAge);
    }
}

```


groupingBy(Function<? super T, ? extends K> classifier,
Collector<? super T, A, D> downstream)

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String firstName;
    private int age;
    private double gpa;

    public Student(String firstName, int age, double gpa) {
        this.firstName = firstName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }
}

public class GroupingByExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 20, 3.5),
                new Student("Bob", 22, 3.2),
                new Student("Carol", 20, 3.8),
                new Student("Dave", 22, 3.6),
                new Student("Eve", 21, 3.9)
        );

        Map<Integer, Double> averageGpaByAge = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getAge,
                        Collectors.averagingDouble(Student::getGpa)
                ));

        System.out.println("Average GPA by Age: " + averageGpaByAge);
    }
}

```


group employees by their department and calculate the sum of their salaries : 


```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class GroupingByExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Finance", 5000),
                new Employee("Bob", "HR", 4000),
                new Employee("Carol", "Finance", 6000),
                new Employee("Dave", "Engineering", 7000),
                new Employee("Eve", "HR", 4500)
        );

        Map<String, Double> totalSalaryByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)
                ));

        System.out.println("Total Salary by Department: " + totalSalaryByDepartment);
    }
}

```