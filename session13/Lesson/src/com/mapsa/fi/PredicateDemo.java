package com.mapsa.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<String> hasEvenLength = str -> str.length()%2 == 0 ;

        System.out.println(hasEvenLength.test("vds"));
        System.out.println(hasEvenLength.test("vdds"));

        Predicate<String> hasLengthGreaterThanFive = str -> str.length() > 5 ;

        Predicate<String> firstAndSecond = hasEvenLength.or(hasLengthGreaterThanFive) ;
        System.out.println(firstAndSecond.test("as"));

        Point source = new Point(1,4,8) ;
        Point des = new Point(3,6,9) ;
        Point midWay = new Point(2,5,7) ;

        List<Point> points = new ArrayList<>(List.of(source , des, midWay));

        points.removeIf(p->p.getX()>2) ;

        points.forEach(p-> System.out.println(p));











    }
}
