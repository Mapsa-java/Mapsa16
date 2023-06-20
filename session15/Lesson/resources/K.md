###   Reducers : 

count , min , max
----------------------------------------------
count:

The count method is a terminal operation in Java streams that returns the number of elements in the stream as a long value.
It is useful when you need to count the number of elements that match a certain condition or simply want to know the size of the stream.
Example usage: Count the number of students with a GPA above a specified threshold.


min:

The min method is a terminal operation in Java streams that returns the minimum element of the stream according to a given comparator or natural ordering.
It is useful when you want to find the smallest element in a stream based on a specific criteria.
If the stream is empty, the min method will return an empty Optional.
Example usage: Find the student with the lowest GPA.


max:

The max method is a terminal operation in Java streams that returns the maximum element of the stream according to a given comparator or natural ordering.
It is useful when you want to find the largest element in a stream based on a specific criteria.
If the stream is empty, the max method will return an empty Optional.
Example usage: Find the student with the highest GPA.



```java
public class CountMinMaxExample {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "12345", "Smith", 20, Gender.FEMALE, "123 Main St", "1234567890", "alice@example.com", "S001", null, 3.8);
        Student student2 = new Student("Bob", "67890", "Johnson", 19, Gender.MALE, "456 Elm St", "9876543210", "bob@example.com", "S002", null, 3.2);
        Student student3 = new Student("Charlie", "54321", "Brown", 21, Gender.MALE, "789 Oak St", "9876543210", "charlie@example.com", "S003", null, 3.5);

        List<Student> studentList = Arrays.asList(student1, student2, student3);

        // Count the number of students
        long studentCount = studentList.stream().count();
        System.out.println("Student count: " + studentCount);

        // Find the student with the lowest GPA
        Optional<Student> studentWithLowestGPA = studentList.stream()
                .min((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()));
        System.out.println("Student with lowest GPA: " + studentWithLowestGPA.orElse(null));

        // Find the student with the highest GPA
        Optional<Student> studentWithHighestGPA = studentList.stream()
                .max((s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa()));
        System.out.println("Student with highest GPA: " + studentWithHighestGPA.orElse(null));
```