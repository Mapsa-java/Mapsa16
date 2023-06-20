package com.mapsa.fi;

import java.util.ArrayList;
import java.util.List;

public class MethodRefrenceDemo {

    public static void main(String[] args) {
        Point source = new Point(1,4,8) ;
        Point des = new Point(3,6,9) ;
        Point midWay = new Point(2,5,7) ;

        List<Point> points = new ArrayList<>(List.of(source , des, midWay));

       // points.forEach(System.out::println);

        //points.removeIf(Point :: checkIfXgreaterThanFive) ;


       // Point base = new Point(0 ,0 ,0);


      //  points.removeIf(base :: checkIfXgreaterThanTwo) ;
      //  System.out.println(points);
       // Consumer<Point> printX = p -> System.out.println(p.getX());
       // points.forEach(MethodRefrenceDemo::printY);
       // MethodRefrenceDemo base = new MethodRefrenceDemo();
      //  points.forEach(base::printZ);
    }


    public static void printY (Point point){
        System.out.println(point.getY());
    }


    public  void printZ (Point point){
        System.out.println(point.getZ());
    }


}
