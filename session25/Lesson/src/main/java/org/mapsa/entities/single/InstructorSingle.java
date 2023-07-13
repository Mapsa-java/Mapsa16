package org.mapsa.entities.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
@Entity
@DiscriminatorValue("ins")
public class InstructorSingle extends  UserSingle{

    private BigDecimal salary ;


    public InstructorSingle(String name, BigDecimal salary) {
        super(name);
        this.salary = salary;
    }

    public InstructorSingle() {

    }


    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
