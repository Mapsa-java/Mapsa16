package org.mapsa.entities.joined;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public class InstructorJoined extends UserJoined {

    private BigDecimal salary ;


    public InstructorJoined(String name, Integer age ,  BigDecimal salary) {
        super(name , age);
        this.salary = salary;
    }

    public InstructorJoined() {

    }


    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
