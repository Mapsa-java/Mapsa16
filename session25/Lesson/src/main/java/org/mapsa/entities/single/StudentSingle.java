package org.mapsa.entities.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("std")
public class StudentSingle extends UserSingle{

    private String course ;


    public StudentSingle(String name, String course) {
        super(name);
        this.course = course;
    }

    public  StudentSingle(){}

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
