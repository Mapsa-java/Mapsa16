package org.mapsa;

import org.springframework.stereotype.Component;

@Component("tennis")
public class TenisCoach implements  Coach{


 /*   @Autowired
    @Qualifier("badFortune")*/
    private  Fortune fortune ;


/*
    @Autowired
    public TenisCoach(@Qualifier("badFortune") Fortune fortune) {
        this.fortune = fortune;
    }
*/


    public Fortune getFortune() {
        return fortune;
    }
//    @Autowired
//    @Qualifier("happyFortune")
/*    public void setFortune(Fortune fortune) {
        System.out.println("In setter");
        this.fortune = fortune;
    }*/
    @Override
    public void getDailyWorkout() {
        System.out.println("Do Tennis....");
    }



    public void getDailyFortune(){
        //fortune = new HappyFortune() ;
        System.out.println(fortune.getFortune());
    }
}
