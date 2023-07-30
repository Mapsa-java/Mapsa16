package com.mapsa.Lesson;

import com.mapsa.Lesson.reposirtory.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LessonApplication implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(LessonApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("number of minas : " +
                employeeRepository.findByName("mina").size());

        System.out.println("number of mina with lastname family: " +
                employeeRepository.findByNameAndLastName("mina", "family").size());

        System.out.println("number of employee with age greater than 44: " +
                employeeRepository.findByAgeGreaterThan(44).size());

        System.out.println("number of minas with age greater than 44: " +
                employeeRepository.findByNameAndAgeGreaterThan("mina", 44).size());

        System.out.println("list of employee greater that 12 ordered : ");
        employeeRepository.findByAgeGreaterThanOrderByAgeAsc(12).forEach(item -> System.out.println(item.getAge()));
        System.out.println("done running");
    }
}
