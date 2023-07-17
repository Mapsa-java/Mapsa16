package org.mapsa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

    public static void main(String[] args) {

         /*       Fortune hf = new HappyFortune() ;
        Coach tc = new TenisCoach(hf) ;
        tc.getDailyWorkout();
        tc .getDailyFortune();*/

    /*    Coach coach = new SwimCoach();
        coach.getDailyWorkout();*/

       /* AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SpringConfig.class);
       // ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("")

        Coach coach = (Coach) context.getBean("tennis");
        coach.getDailyWorkout();
        coach.getDailyFortune();*/
/*
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MethodInjectionCoach methodInjectionCoach = (MethodInjectionCoach) context.getBean("test");*/


       /* AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Coach swimCoach1 = (Coach) context.getBean("swim");
        Coach swimCoach2 = (Coach) context.getBean("swim");

        System.out.println(swimCoach1 == swimCoach2);
        System.out.println(swimCoach1);
        System.out.println(swimCoach2);

        context.close();
*/


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Coach swimCoach1 = (Coach) context.getBean("swim");

        swimCoach1.getDailyFortune();

        context.close();

    }
}
