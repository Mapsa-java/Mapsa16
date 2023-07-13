package org.mapsa.entities.perclass;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserPerClass {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE )
    private Integer id;
    @Column(name = "name")
    private String name;

    public UserPerClass() {

    }

    public UserPerClass(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
