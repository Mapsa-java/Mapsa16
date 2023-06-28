package org.mapsa;

import org.mapsa.entities.Student;
import org.mapsa.service.StudentService;

public class App {


    public static void main(String[] args) {

        StudentService studentService = new  StudentService(SessionFactoryProvider.getSessionFactory()) ;
        Student std = new Student("sana" , "naseri" , "sana@gmail.com" ) ;
        Integer id = studentService.createStudent(std) ;
        System.out.println(id);

    }


}
