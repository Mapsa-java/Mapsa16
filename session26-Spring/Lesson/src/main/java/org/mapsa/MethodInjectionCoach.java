package org.mapsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("test")
public class MethodInjectionCoach {

    @Autowired
    public void changeFortune(Fortune fortune){
        System.out.println( "this fortune is not correct : " + fortune.getFortune());
    }
}
