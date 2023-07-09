package org.mapsa.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event_temporal")
public class EventTemporal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    String name ;
    @Temporal(TemporalType.DATE)
    Date eventDate ;
    @Temporal(TemporalType.TIME)
    Date eventTime;
    @Temporal(TemporalType.TIMESTAMP)
    Date createTimeStamp;

    public EventTemporal() {
    }

    public EventTemporal(String name, Date eventDate, Date eventTime, Date createTimeStamp) {
        this.name = name;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.createTimeStamp = createTimeStamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public Date getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Date createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }
}
