@OneToOne annotation:
is used to specify a one-to-one relationship between two entities.
It is used to map a single-valued association between two entities,
where each instance of one entity is associated with at most one instance of the other entity.

Employee Class:

```java
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "employee_name")
    private String name;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private Address address;

    // Other fields and methods
}
```

Address Class:

```java
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip_code")
    private String zipCode;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Other fields and methods
}
```

In this example, the Employee entity has a one-to-one relationship with the Address entity using the @OneToOne annotation. The mappedBy attribute is used to specify the name of the field in the Address entity that owns the relationship. In this case, the employee field in the Address entity owns the relationship.

1-mappedBy: This attribute is used to specify the name of the field in the inverse side of the relationship that owns the relationship. This is the field that maps back to the owning entity.

2-cascade: This attribute specifies the cascade operations to apply to the associated entity when the parent entity is persisted, updated, or deleted. For example, if you set cascade = CascadeType.ALL, it means that all operations (persist, merge, remove, refresh) will be cascaded to the associated entity.

3-fetch: This attribute specifies the fetch strategy to use when loading the associated entity. There are two options: FetchType.EAGER and FetchType.LAZY. If set to EAGER, it means that the associated entity will be loaded immediately when the parent entity is loaded. If set to LAZY, it means that the associated entity will be loaded only when it is actually accessed.
