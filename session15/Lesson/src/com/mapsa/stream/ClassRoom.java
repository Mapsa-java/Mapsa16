package com.mapsa.stream;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {

    private List<Student> students;
    private String name ;

    public ClassRoom(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Other methods

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
