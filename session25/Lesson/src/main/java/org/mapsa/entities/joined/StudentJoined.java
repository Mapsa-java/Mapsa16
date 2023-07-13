package org.mapsa.entities.joined;

import javax.persistence.Entity;

@Entity
public class StudentJoined extends UserJoined {

    private String course ;


    public StudentJoined(String name, Integer age, String course) {
        super(name ,age);
        this.course = course;
    }

    public StudentJoined(){}

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
