package org.mapsa.entities;

import javax.persistence.*;
@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "number")
    private String number;

    @Embedded
    @AttributeOverrides(
            {@AttributeOverride(name = "city" , column = @Column(name="customer_home_city")),
                    @AttributeOverride(name = "country" , column = @Column(name="customer_home_country"))}

    )
    private Address homeAddress ;

    public Customer(String number) {
        this.number = number;
    }

    public Customer(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }
}
