Temporal
-------------------------

Hibernate Temporal annotation is used to map Java date and time fields to corresponding database columns 
with specific temporal types : 

Hibernate Temporal supports three different temporal types:

*  TemporalType.DATE:  maps the Java Date or Calendar field to a database column of the DATE type. 
It only includes the date portion without any time information.

* TemporalType.TIME:  maps the Java Date or Calendar field to a database column of the TIME type.
It only includes the time portion without any date information.

* TemporalType.TIMESTAMP:  maps the Java Date or Calendar field to a database column of the TIMESTAMP type. 
It includes both date and time information.



```java
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Event {

    @Id
    private Long id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDateTime;

    // Getters and setters
}

```