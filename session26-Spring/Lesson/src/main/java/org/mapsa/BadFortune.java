package org.mapsa;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune{
    @Override
    public String getFortune() {
        return "Today is Bad Day.";
    }
}
