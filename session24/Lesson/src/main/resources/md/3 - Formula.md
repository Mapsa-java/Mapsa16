Formula
----------------------------------------

@Formula annotation in Hibernate allows you to define a computed property or a derived value for an entity.
It provides a way to include custom SQL expressions or database functions in your entity mapping.
The @Formula annotation is used to map the result of the SQL expression or function to a corresponding property
in your entity.


* Computed Property: The @Formula annotation allows you to define a property that is calculated dynamically by a SQL expression or a database function. The computed property is not directly mapped to a column in the database but is derived from other persisted fields.

* SQL Expression: You can specify any valid SQL expression or function within the @Formula annotation. This can include database-specific functions, arithmetic operations, string manipulations, etc. The expression is executed by the database during the retrieval of the entity.

* Read-Only Property: The computed property defined using @Formula is read-only and cannot be modified or persisted. It is generated by the database when the entity is loaded.

* Mapping Considerations: The computed property can be of any data type supported by Hibernate, such as primitive types, wrapper classes, or custom types. It should have a corresponding getter method, and you can also provide a setter method for consistency, although it won't be used by Hibernate.

* Database Portability: Keep in mind that using @Formula ties your entity mapping to the specific database SQL expression or function. If you plan to switch databases in the future, you may need to update the SQL expression accordingly.


```java

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Formula;

@Entity
public class Product {

    @Id
    private Long id;

    private String name;

    @Column(name = "unit_price")
    private double unitPrice;

    @Formula("unit_price * 0.85")
    private double discountedPrice;

    // Constructors, getters, setters, and other fields
}

```