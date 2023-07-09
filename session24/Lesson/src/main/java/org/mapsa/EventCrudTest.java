package org.mapsa;

import org.mapsa.entities.Event;
import org.mapsa.service.EventService;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class EventCrudTest {


    public static void main(String[] args) throws ParseException {

       EventService eventService = new  EventService(SessionFactoryProvider.getSessionFactory()) ;
        Event event = new Event(
                "webinar - 1" ,
                 LocalDate.of(1987, 5 , 22) ,
                 LocalTime.of(23, 5 , 22) ,
                LocalDateTime.now()
                );

        eventService.create(event);

        //-----------------------------------------------
     /*   EventTemporalService eventTemporalService = new  EventTemporalService(SessionFactoryProvider.getSessionFactory()) ;
        EventTemporal eventTemporal = new EventTemporal(
                "webinar - 2" ,
                new Date() ,  new Date() ,  new Date()
        );
        eventTemporalService.create(eventTemporal);*/

        //-----------------------------------------------
       /* EventTemporalService eventTemporalService = new EventTemporalService(SessionFactoryProvider.getSessionFactory());

        String dateString = "1987/05/22";
        String timeString = "04:11:10 pm";
        String dateTimeString = "1990-09-19 19:09:39";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date date = dateFormat.parse(dateString) ;
        Date time = timeFormat.parse(timeString) ;
        Date datetime = dateTimeFormat.parse(dateTimeString) ;


        EventTemporal eventTemporal2 = new EventTemporal(
                "webinar 4" ,
               date , time  , datetime
        );

        eventTemporalService.create(eventTemporal2);*/





    }


}
