package org.mapsa.entities.perclass;

import javax.persistence.Entity;

@Entity
public class StudentPerClass extends UserPerClass {

    private String course ;


    public StudentPerClass(String name, String course) {
        super(name);
        this.course = course;
    }

    public StudentPerClass(){}

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
