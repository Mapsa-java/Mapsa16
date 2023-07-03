In Hibernate, how can we implement the foreign key relationship in database?

In Hibernate, you can implement the foreign key relationship in the database using the @ManyToOne and @JoinColumn annotations.


@JoinColumn annotation to specify the name of the foreign key column in parent table and set nullable to false to indicate that the foreign key cannot be null.

@ManyToOne Annotation:
@ManyToOne annotation is typically used on the child side of the relationship, where the child entity has a foreign key that references the primary key of the parent entity.

Child Class:

```java
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    // Many to one relationship with Customer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer cust;

    // Other fields and methods
}
```

Parent Class:

```java
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    // One to many relationship with Order
    @OneToMany(mappedBy = "cust", cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();

    // Other fields and methods
}
```

Attributes of the @ManyToOne annotation:

1-optional: This attribute specifies whether the relationship is optional or required. If set to true, it means that the relationship is optional and the foreign key column can be null. If set to false (which is the default), it means that the relationship is required and the foreign key column cannot be null.

2-cascade: This attribute specifies the cascade operations to apply to the associated entity when the parent entity is persisted, updated, or deleted. For example, if you set cascade = CascadeType.ALL, it means that all operations (persist, merge, remove, refresh) will be cascaded to the associated entity.

3-targetEntity: This attribute specifies the target entity class of the relationship. If not specified, Hibernate will infer the target entity class from the field type.

4-fetch: This attribute specifies the fetch strategy to use when loading the associated entity. There are two options: FetchType.EAGER and FetchType.LAZY. If set to EAGER, it means that the associated entity will be loaded immediately when the parent entity is loaded. If set to LAZY, it means that the associated entity will be loaded only when it is actually accessed.

5-access: This attribute specifies the access type that should be used to access the associated entity. The default value is AccessType.PROPERTY, which means that Hibernate will use the getter and setter methods to access the entity. You can also set it to AccessType.FIELD to use direct field access.


Note:
Using both @ManyToOne and @OneToMany annotations in the appropriate entities ensures that the foreign key relationship is correctly mapped in both directions and allows you to navigate the relationship from either side.