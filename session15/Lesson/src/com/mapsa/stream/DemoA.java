package com.mapsa.stream;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoA {

    public static void main(String[] args) throws IOException {

//       List<Student> stds =  StudentUtils.generateStudentList() ;
//
//       stds.stream().
//               forEach(item-> {
//           item.setGpa(item.getGpa() + 1);
//       });
//
//      Student[] stdsArr = stds.toArray(new Student[0]) ;
//
//      Stream<Student> stdsStream =  Arrays.stream(stdsArr) ;


//      int[] nums = {12,35,65,22, 90} ;
//      IntStream numsStream = Arrays.stream(nums) ;
//      Double res =  numsStream.average().getAsDouble() ;
//      System.out.println("average : " + res);
//        String str = "test" ;
//        Optional<String> optStr = Optional.ofNullable(str) ;

     //   System.out.println(optStr.get());
      //  System.out.println(optStr.orElseGet(() -> "unKnown"));
     //   System.out.println(optStr.());


       // Stream.ofNullable()
//        List.of()
//
//        Arrays.asList();


    //   Stream<Integer> infiniteStream = Stream.generate(()->(int) (Math.random() * 1000)+ 1000) ;
    //  infiniteStream.limit(100).forEach((i)-> System.out.println(i));

     //   IntStream.generate(()->(int)(Math.random() * 1000)+ 1000)
//        diceRoller(20);
//        datePluser(20);

//
//        Path path = Paths.get("C:\\nobitex\\onboarding\\docker.txt") ;
//        Stream<String> lines =  Files.lines(path);
//        lines.forEach(item-> System.out.println(item)) ;

//
//        String text = "Hello, World!";
//
//       IntStream textStream =  text.chars() ;
//       textStream.map()
//               forEach(System.out::println);

//        Student student8 = new Student("Olivia", "7654321098", "Taylor", 18, Student.Gender.FEMALE,
//                "567 Oak St", "543-210-9876", "olivia@example.com", "S008", Student.Course.ENGLISH, 4.0);
//
//        Student student9 = new Student("Jacob", "8901234567", "Miller", 21, Student.Gender.MALE,
//                "901 Pine St", "432-109-8765", "jacob@example.com", "S009", Student.Course.COMPUTER_SCIENCE, 3.3);
//
//        Student student10 = new Student("Sophia", "2345678901", "Anderson", 20, Student.Gender.FEMALE,
//                "345 Cedar St", "210-987-6543", "sophia@example.com", "S010", Student.Course.MATHEMATICS, 3.9);




//        Stream.Builder<Student> builder = Stream.builder();
//        builder.add(student8).add(student9).add(student10);
//        Stream<Student> stdStream = builder.build() ;
      //  List<Student>  stdList = stdStream . collect(Collectors.toList());
        //List<Student>   Map<String, Double>
        //func : Student-> String
        //func : Student -> Student
     //  Map<String, Double> myMap = stdStream.collect(Collectors.toMap(Student::getFirstName, item->item.getGpa()));

      //  System.out.println(myMap);



        //Map
//        List<Student> stds = StudentUtils.generateStudentList();
        //Studen -> List<String> , firetname + lastname
//        List<String> names=  stds.stream().map(item-> {
//            System.out.println("id : " + item.getStudentId());
//            return item.getFirstName() + " " + item.getLastName() ;
//        }).collect(Collectors.toList());


//        List<Student> stds = StudentUtils.generateStudentList();
//        Double avg =  stds.stream().mapToDouble(item-> item.getGpa()).average().getAsDouble();
//        System.out.println("avg : "+ avg);




        //Filter
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Filter even numbers using filter
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(num -> num % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(evenNumbers);



      //  Get the average GPA of female students
//        List<Student> stds = StudentUtils.generateStudentList();
//        OptionalDouble femaleAvg = stds.stream().filter(item->item.getGender() == Student.Gender.FEMALE)
//                .peek(item-> System.out.println(item.getFirstName() + item.getGender()))
//                .mapToDouble(item->item.getGpa()).average() ;
//        if (femaleAvg.isPresent()){
//            System.out.println(femaleAvg.getAsDouble());
//        }
//        else {
//            System.out.println("Avg Not Available");
//        }
       // System.out.println("female avg : " + femaleAvg);
                     //.forEach(item-> System.out.println(item.getFirstName() + item.getGender()));


        //Slicing

//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Skip the first 3 elements
//        Stream<Integer> skippedStream = numbers.skip(3);
//
//        skippedStream.forEach(System.out::println);



//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1);
//
//        Stream<Integer> takenStream = numbers.takeWhile(num -> num <= 5);
//
//        takenStream.forEach(System.out::println);


        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1);

        Stream<Integer> droppedStream = numbers.dropWhile(num -> num <= 5);

        droppedStream.forEach(System.out::println);

    }


    public static  void diceRoller(int rounds){

        Random random = new Random();
        IntStream.generate(()->random.nextInt(6) + 1).limit(rounds).forEach(item-> System.out.println(item));

    }

    public static void datePluser(int dayCount){
        LocalDate today = LocalDate.of(2023 , 5 , 28) ;

        Stream.iterate(today , a-> a.plusDays(1)).limit(10).forEach(item-> System.out.println(item))

        ;


    }



}
