package com.mapsa.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {


    public static List<Student>  generateStudentList(){
        

        Student student1 = new Student("John", "1234567890", "Doe", 20, Student.Gender.MALE,
                "123 Main St", "123-456-7890", "john@example.com", "S001", Student.Course.COMPUTER_SCIENCE, 3.8);

        Student student2 = new Student("Jane", "0987654321", "Smith", 19, Student.Gender.FEMALE,
                "456 Elm St", "987-654-3210", "jane@example.com", "S002", Student.Course.MATHEMATICS, 3.5);

        Student student3 = new Student("David", "5678901234", "Johnson", 21, Student.Gender.MALE,
                "789 Oak St", "567-890-1234", "david@example.com", "S003", Student.Course.BIOLOGY, 3.2);

        Student student4 = new Student("Sarah", "4321098765", "Williams", 18, Student.Gender.FEMALE,
                "321 Pine St", "210-987-6543", "sarah@example.com", "S004", Student.Course.ENGLISH, 3.9);

        Student student5 = new Student("Michael", "9876543210", "Brown", 22, Student.Gender.MALE,
                "543 Cedar St", "654-321-0987", "michael@example.com", "S005", Student.Course.COMPUTER_SCIENCE, 3.6);

        Student student6 = new Student("Emily", "3456789012", "Jones", 20, Student.Gender.FEMALE,
                "876 Maple St", "876-543-2109", "emily@example.com", "S006", Student.Course.MATHEMATICS, 3.7);

        Student student7 = new Student("Daniel", "2109876543", "Davis", 19, Student.Gender.MALE,
                "234 Walnut St", "321-654-0987", "daniel@example.com", "S007", Student.Course.BIOLOGY, 3.1);

        Student student8 = new Student("Olivia", "7654321098", "Taylor", 18, Student.Gender.FEMALE,
                "567 Oak St", "543-210-9876", "olivia@example.com", "S008", Student.Course.ENGLISH, 4.0);

        Student student9 = new Student("Jacob", "8901234567", "Miller", 21, Student.Gender.MALE,
                "901 Pine St", "432-109-8765", "jacob@example.com", "S009", Student.Course.COMPUTER_SCIENCE, 3.3);

        Student student10 = new Student("Sophia", "2345678901", "Anderson", 20, Student.Gender.FEMALE,
                "345 Cedar St", "210-987-6543", "sophia@example.com", "S010", Student.Course.MATHEMATICS, 3.9);

        Student student11 = new Student("Matthew", "6789012345", "Wilson", 19, Student.Gender.MALE,
                "678 Elm St", "876-543-2109", "matthew@example.com", "S011", Student.Course.BIOLOGY, 3.2);

        Student student12 = new Student("Ava", "0123456789", "Martin", 18, Student.Gender.FEMALE,
                "890 Maple St", "321-654-0987", "ava@example.com", "S012", Student.Course.ENGLISH, 3.8);

        Student student13 = new Student("William", "4567890123", "Anderson", 22, Student.Gender.MALE,
                "123 Walnut St", "543-210-9876", "william@example.com", "S013", Student.Course.COMPUTER_SCIENCE, 3.7);

        Student student14 = new Student("Mia", "8901234567", "Harris", 20, Student.Gender.FEMALE,
                "456 Oak St", "432-109-8765", "mia@example.com", "S014", Student.Course.MATHEMATICS, 3.5);

        Student student15 = new Student("Ethan", "2345678901", "Lewis", 19, Student.Gender.MALE,
                "789 Pine St", "210-987-6543", "ethan@example.com", "S015", Student.Course.BIOLOGY, 3.4);


        List<Student> stds = new ArrayList<>();

//        stds.add(student1);
//        stds.add(student2);
//        stds.add(student3);
//        stds.add(student4);
//        stds.add(student5);
//        stds.add(student6);
//        stds.add(student7);
//        stds.add(student8);
//        stds.add(student9);
//        stds.add(student10);
//        stds.add(student11);
//        stds.add(student12);
//        stds.add(student13);
//        stds.add(student14);
//        stds.add(student15);
        
        return stds;
    }
}

