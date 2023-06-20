package com.mapsa.fi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoComparator {

    public static void main(String[] args) {
        Point source = new Point(1,4,8) ;
        Point des = new Point(3,6,9) ;
        Point midWay = new Point(2,5,7) ;


        List<Point> points = new ArrayList<>(List.of(des, source, midWay)) ;

        Comparator<Point> comparator = (p1 , p2) -> {
             return p1.getX() - p2.getX() ;
        } ;

       // points.sort(comparator);
        points.sort((p1 , p2) -> p1.getY() - p2.getY());

        System.out.println(points);
    }
}
