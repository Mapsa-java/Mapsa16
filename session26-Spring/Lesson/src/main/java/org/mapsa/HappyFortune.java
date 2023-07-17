package org.mapsa;

//@Component
public class HappyFortune implements Fortune{
    @Override
    public String getFortune() {
        return "Today is Good Day.";
    }
}
