package org.mapsa.entities;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToOne(mappedBy = "user")
    private Credential credential ;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    @Embedded
    @AttributeOverrides(
            {@AttributeOverride(name = "city" , column = @Column(name="user_home_city")),
            @AttributeOverride(name = "country" , column = @Column(name="user_home_country"))}

    )
    private Address homeAddress ;

    @Embedded
    @AttributeOverrides(
            {@AttributeOverride(name = "city" , column = @Column(name="user_work_city")),
                    @AttributeOverride(name = "country" , column = @Column(name="user_work_country"))}

    )
    private Address workAddress ;


    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name="user_loginHistory" ,joinColumns = @JoinColumn(name="user_fk_id"))
    @Column(name="value")
    @OrderColumn
    private List<Date> loginDate = new ArrayList<>();


    @ElementCollection(fetch = FetchType.EAGER)
    @OrderBy("childNames desc")
    private Set<String> childNames = new LinkedHashSet<>() ;

    @ElementCollection
    @AttributeOverrides(
            {@AttributeOverride(name = "fname" , column = @Column(name="user_relative_fname")),
                }
    )
    private List<Relative> relatives  = new ArrayList<>();


/*    @ElementCollection
    @MapKeyColumn(name = "relative_type")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<RelativeType, String> relatives  = new HashMap<>() ;*/


    @Transient
    private String fullName;
    @Formula("lower(first_name)")
    private String firstNameToLower ;
    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
   public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName.toUpperCase();
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

     public String getFirstNameToLower() {
        return firstNameToLower;
    }

    public void setFirstNameToLower(String firstNameToLower) {
        this.firstNameToLower = firstNameToLower;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public List<Date> getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(List<Date> loginDate) {
        this.loginDate = loginDate;
    }

    public String getFullName() {
        return firstName + " " +lastName;
    }

    public Set<String> getChildNames() {
        return childNames;
    }

    public void setChildNames(Set<String> childNames) {
        this.childNames = childNames;
    }

  /*  public Map<RelativeType, String> getRelatives() {
        return relatives;
    }

    public void setRelatives(Map<RelativeType, String> relatives) {
        this.relatives = relatives;
    }*/

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<Relative> relatives) {
        this.relatives = relatives;
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
