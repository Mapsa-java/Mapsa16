package com.mapsa.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {
        Point source = new Point(1,4,8) ;
        Point des = new Point(3,6,9) ;
        Point midWay = new Point(2,5,7) ;

        Consumer<Point> consumer = p -> {
           // p.setX(1 + p.getX());
           // System.out.println("------" + source.getX() + des.getX());
            System.out.println("--------"+p);
        } ;

        consumer.accept(source);
      //  System.out.println(source);

        List<Point> points = new ArrayList<>(List.of(source , des, midWay));

        points.forEach(p -> {
            p.setX(p.getX() + 1);
        });
        System.out.println("=====================");
        points.forEach(p -> System.out.println(p));
      //  System.out.println("---- after increasing X by one : " + points);








       // List

    }
}
