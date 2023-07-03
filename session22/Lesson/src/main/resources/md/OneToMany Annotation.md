@OneToMany Annotation

@OneToMany is typically used on the parent side of the relationship, where the parent entity has a collection of child entities.


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
In this example, the Customer entity has a one-to-many relationship with the Order entity using the @OneToMany annotation.

Attributes of the @OneToMany annotation:

1-mappedBy attribute is used to specify the name of the field in the child entity that owns the relationship In this example, it shows the name of the customer field in the Order entity "cust" to indicate that the Order entity owns the relationship

2-orphanRemoval specifies whether orphaned child entities should be automatically removed when they are no longer referenced by the parent entity. 

	When an entity is removed from the database, its associated child entities may become orphaned if they are not also removed. Orphaned child entities are child entities that are no longer associated with any parent entities.

	It's important to note that when using the orphanRemoval attribute, you should only add or remove child entities through the parent entity to ensure that the relationship is properly managed. If you manually add or remove child entities from the database without updating the parent entity, the orphanRemoval feature may not work as expected.
	
3-indexColumn: This attribute is used to specify the name of the index column in the join table. This column is used to maintain the order of the child entities in the collection.

4-joinColumns: This attribute is used to specify the foreign key columns in the join table that reference the parent entity.

5-inverseJoinColumns: This attribute is used to specify the foreign key columns in the join table that reference the child entity.

6-cascade: This attribute specifies the cascade operations to apply to the child entities when the parent entity is persisted, updated, or deleted. For example, if you set cascade = CascadeType.ALL, it means that all operations (persist, merge, remove, refresh) will be cascaded to the child entities.

7-fetch: This attribute specifies the fetch strategy to use when loading the child entities. There are two options: FetchType.EAGER and FetchType.LAZY. If set to EAGER, it means that the child entities will be loaded immediately when the parent entity is loaded. If set to LAZY, it means that the child entities will be loaded only when they are actually accessed.

Note:
Using both @ManyToOne and @OneToMany annotations in the appropriate entities ensures that the foreign key relationship is correctly mapped in both directions and allows you to navigate the relationship from either side.