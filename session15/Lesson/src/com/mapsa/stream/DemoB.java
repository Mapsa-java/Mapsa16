package com.mapsa.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoB {

    public static void main(String[] args) {

//        List<String> names = Arrays.asList("John", "jane", "Adam", "Eve");
//
//        // Sort the names based on length in descending order
//        List<String> sortedNames = names.stream()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(sortedNames);


//       List<Student> students = StudentUtils.generateStudentList();
//
//       students.stream()
//               .sorted(Comparator.comparing(Student::getAge).thenComparing(Comparator.comparing(Student::getFirstName)))
//               .forEach(item-> System.out.println(item.getFirstName() + " " + item
//                       .getAge()));


        //Flatmap

//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1, 2, 3),
//                Arrays.asList(4, 5, 6),
//                Arrays.asList(7, 8, 9)
//        );
//
//        Stream<Integer> flattenedStream = listOfLists.stream()
//                .flatMap(item->item.stream());
//
//        flattenedStream.forEach(System.out::println);

//
//        List<ClassRoom> classRooms = StudentUtils.generateClassRoomList() ;
//
//        var studentStream = classRooms.stream().flatMap(item->item.getStudents().stream()) ;
//
//        studentStream.forEach(item-> System.out.println(item.getFirstName() + " " + item.getLastName()));


        //Distinct

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 2, 4, 5, 3, 6);
//        Stream<Integer> distinctNumbersStream = numbers.stream().distinct();
//        distinctNumbersStream.forEach(System.out::println);

        //   List<Student> students = StudentUtils.generateStudentList() ;

        //  System.out.println(students.stream().distinct().count());


        // students.stream().map(item->item.getCourse()).distinct().forEach(System.out::println);


//        List<Student> students = StudentUtils.generateStudentList() ;
//        System.out.println(students.stream().mapToDouble(Student::getGpa).average());


        //AllMatch

//        List<Integer> numbers = Arrays.asList(2, 1, 6, 8, 10);
//        boolean allEven = numbers.stream().allMatch(num -> num % 2 == 0);
//
//        System.out.println(allEven);


//        List<Student> students = StudentUtils.generateStudentList();
//
//        boolean res = students.stream().allMatch(item->item.getGpa() >=  3.1) ;
//        System.out.println(res);


//
//         Optional<Student> studentOptional = students.stream()
//                .sorted(Comparator.comparing(Student::getAge))
//                .findFirst() ;
//        System.out.println(studentOptional.get().getFirstName());


//        Optional<Student> studentOptional = students.stream()
//                .filter(item -> item.getAge() > 22)
//                .findFirst();
//       System.out.println(studentOptional.orElseGet(()->new Student("unKnown")).getFirstName());

//        String firstName = studentOptional.isPresent() ?
//                studentOptional.get().getFirstName() : "unknown";
//
//        System.out.println(firstName);

        //Find the first female student with a GPA above a specified threshold. 3.6


        //reduce
        // 0 [1 , 2 , 3 , 4 , 5]
        // [3 , 3 , 4 , 5 ]
        // [ 6 , 4 , 5 ]
        // [10 , 5 ]
        // [15]
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);


//        List<Integer> numbers = new ArrayList<>() ;
//        System.out.println(numbers.stream().reduce(15, (a, b) -> a - b));

//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        System.out.println(numbers.stream().reduce(5, (a, b) -> a + b));

        //  System.out.println(sum);

        //       List<Student> students = StudentUtils.generateStudentList();
        // students.


//        List<Student> students = StudentUtils.generateStudentList();
//
//        String names = students.stream().map(item -> item.getFirstName() + " " + item.getLastName())
//                       .reduce("---", (a , b)-> a  + "," + b) + "---" ;
//
//        System.out.println(names);


//        List<Student> students = StudentUtils.generateStudentList();
//        double max = students.stream().map(item-> item.getGpa())
//                     .reduce(0d , (a , b) -> Math.max(a,b)) ;
//
//        System.out.println(max);


   //     List<Student> students = StudentUtils.generateStudentList();
        //Student    Map<String name ,double gpa>
        //key : function : student -> string :name
        //vale : function : student -> double :gpa
//        Map<String, Double> myMap = students.stream()
//                .collect(Collectors.toMap(Student::getFirstName, Student::getGpa));

//        System.out.println(myMap);


//        Map<String, Student> myMap = students.stream()
//                  .collect(Collectors.toMap(Student::getFirstName, Function.identity()));
//
//        System.out.println(myMap);

     //   {"male:jone" , "male:david"}
//        Map<Student.Gender, String> myMap = students.stream()
//                .collect(Collectors.toMap(Student::getGender,
//                                       Student ::getFirstName ,(a ,b) -> a + " " + b ));
//
//       System.out.println(myMap);


      //  {male : 1 , male :1 }
//        Map<Student.Gender, Integer> myMap2 = students.stream()
//                .collect(Collectors.toMap(Student::getGender, (item)->1
//                                                        ,(a ,b) -> a + b ));

  //      System.out.println(myMap2);



        //Group by

        List<Student> students = StudentUtils.generateStudentList();


       /* Map<Integer, List<Student>> studentsByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getAge));*/


        Map<Student.Course, List<Student>> studentsByAge = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse));

//        System.out.println("Students grouped by age: " + studentsByAge);

        Map<Student.Gender, Long> averageGpaByAge = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender
                       , Collectors.counting()
                ));

       // students.stream().c

        System.out.println(averageGpaByAge);


    }


}


