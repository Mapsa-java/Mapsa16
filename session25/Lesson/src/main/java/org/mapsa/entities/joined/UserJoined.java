package org.mapsa.entities.joined;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class UserJoined {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    public UserJoined() {

    }

    public UserJoined(String name , Integer age) {
        this.name = name;
        this.age = age ;
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
