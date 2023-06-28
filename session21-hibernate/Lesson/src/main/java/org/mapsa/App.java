package org.mapsa;

import org.mapsa.entities.Student;
import org.mapsa.service.StudentService;

public class App {


    public static void main(String[] args) {

        StudentService studentService = new  StudentService(SessionFactoryProvider.getSessionFactory()) ;
        Student sana = new Student("sana" , "naseri" , "sana@gmail.com" ) ;
        Student hana = new Student("hana" , "habibi" , "hana@gmail.com" ) ;

        Integer sanaId = studentService.createStudent(sana) ;
        Integer hanaId = studentService.createStudent(hana) ;
        System.out.println("sana id is : " + sanaId);
        System.out.println("hana id is : " + hanaId);

        //update hana email
        hana.setEmail("habibi@gmail.com");
        studentService.updateStudent(hana);

        //delete sana
        studentService.deleteStudent(sana);





    }


}
