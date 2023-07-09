 AccessType 
---------------------------------------


AccessType is an enumeration that determines how the properties of an entity class are accessed 
or mapped to the underlying database columns. It specifies whether the properties should be accessed through fields
or through getters/setters (methods). The AccessType enumeration has two possible values: FIELD and PROPERTY.


FIELD Access Type:
When using the FIELD access type, Hibernate accesses the properties directly through the fields of the entity class.

In this approach, you annotate the fields of the entity class directly with Hibernate annotations (@Id, @Column, etc.) to define the mapping to the database columns.

No specific getter or setter methods are required for the fields, as Hibernate accesses the fields directly.


```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import org.hibernate.annotations.AccessType;

@Entity
@AccessType(AccessType.Type.FIELD)
public class Product {

    @Id
    private Long id;

    @Column(name = "product_name")
    private String productName;

    // Constructors, additional fields, and methods
}

```


PROPERTY Access Type:
When using the PROPERTY access type, Hibernate accesses the properties through getter and setter methods of the entity class.

In this approach, you define public getter and setter methods for each property in the entity class.

The getter methods are annotated with Hibernate annotations (@Id, @Column, etc.) to define the mapping to the database columns.

Hibernate uses the getter and setter methods to access and modify the property values during persistence operations.

```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import org.hibernate.annotations.AccessType;

@Entity
@AccessType(AccessType.Type.PROPERTY)
public class Product {

    private Long id;
    private String productName;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Constructors, additional fields, and methods
}

```



As a JPA provider, Hibernate can introspect both the entity attributes 
(instance fields) or the accessors (instance properties). 
By default, the placement of the @Id annotation gives the default access strategy. 
When placed on a field, Hibernate will assume field-based access. Place on the identifier getter,
Hibernate will use property-based access.

he choice between FIELD and PROPERTY access type depends on your preference and the requirements of your application. Some developers prefer the FIELD access type for its simplicity and direct access to fields, while others prefer the PROPERTY access type for encapsulation and better control over property access.

Keep in mind that once you choose an access type for an entity class, it applies to all its properties. You cannot mix FIELD and PROPERTY access types within the same entity class.