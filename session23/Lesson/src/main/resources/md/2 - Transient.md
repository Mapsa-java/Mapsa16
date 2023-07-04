Transient
------------------------------------------
@Transient annotation is used in Hibernate to indicate that a particular field should not be persisted or stored in the database.
When you annotate a field with @Transient, Hibernate ignores that field during the persistence process,
and it is not included in the SQL statements generated for data manipulation.


Here are some key points to understand about the @Transient annotation in Hibernate:

```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Product {

    @Id
    private Long id;

    private String name;

    @Transient
    private String transientField;

    // Constructors, getters, setters, and other fields
}

```