package org.mapsa;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("swim")
//@Scope("prototype")
public class SwimCoach implements Coach{

    private Fortune fortune;
    @Value("${email}")
    private String email;

    @Value("${name}")
    private String name;

    @Autowired
    public SwimCoach(Fortune fortune) {
        System.out.println("In Constructor....");
        this.fortune = fortune;
    }
    @PostConstruct
    public  void logToFile(){
        System.out.println("email : " + email);
        System.out.println("name : " + name);
        System.out.println("Log To File, Bean Created.");
    }

    @PreDestroy
    public  void logToFileEnd(){
        System.out.println("Log To File, Bean is being Destroyed.");
    }

    @Override
    public void getDailyWorkout() {
        System.out.println(  " -- Swim Today.....");
    }

    @Override
    public void getDailyFortune() {
        System.out.println(fortune.getFortune());
    }


}
