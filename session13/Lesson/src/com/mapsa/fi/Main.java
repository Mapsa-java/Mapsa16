package com.mapsa.fi;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(1,2,3) ;
        Point p2 = new Point(6,5,4) ;

        Order o1 = new Order (p1 , p2) ;



//        o1.transferCost(new XbaseCalculator());
//
//
//        o1.transferCost(new DistanceCalculator() {
//            @Override
//            public double calculate(Point p1, Point p2) {
//                return p1.getY() - p2.getY();
//            }
//        }) ;

//        DistanceCalculator d1 = (Point f , Point s) -> f.getX() - s.getX() ;
     ///   Main m = new Main ();
     //   o1.transferCost( m::Zero);


    //    List<Point> ps = new ArrayList<>(List.of(p1,p2)) ;
    //    Comparator<Point> xBase = ( f ,  s) -> f.getX() - s.getX() ;

        //ps.sort(MainZero());

       // System.out.println(ps);

        Function<String, Integer> f = s ->s.length() ;


        Function<String, String> ff =  f.andThen(a-> "I am " + a + "length") ;

        ff.apply("ssss") ;


    }


    public  double Zero (Point p1 , Point p2){
        return 0 ;
    }




}
