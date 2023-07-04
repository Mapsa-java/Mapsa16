package org.mapsa.entities;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Access(AccessType.PROPERTY)
public class User {

    private Integer id;

    private String firstName;

    private String lastName;

    private String fullname;

    private String firstNameToLower ;


    private Credential credential ;


    private List<Address> addresses = new ArrayList<>();

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName.toUpperCase();
    }
    @OneToOne(mappedBy = "user")
    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    public List<Address> getAddresses() {
        return addresses;
    }
    @Formula("lower(first_name)")
    public String getFirstNameToLower() {
        return firstNameToLower;
    }

    public void setFirstNameToLower(String firstNameToLower) {
        this.firstNameToLower = firstNameToLower;
    }


    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    @Transient
    public String getFullname() {
        return firstName + " " +lastName;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", credential=" + credential +
                '}';
    }
}
