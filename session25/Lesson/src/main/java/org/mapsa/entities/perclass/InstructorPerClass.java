package org.mapsa.entities.perclass;

import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
public class InstructorPerClass extends UserPerClass {

    private BigDecimal salary ;


    public InstructorPerClass(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
    }

    public InstructorPerClass() {

    }


    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
