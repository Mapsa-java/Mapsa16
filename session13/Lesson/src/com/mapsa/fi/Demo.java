package com.mapsa.fi;

public class Demo {

    public static void main(String[] args) {
        Point source = new Point(1,4,8) ;
        Point des = new Point(3,6,9) ;
        Point midWay = new Point(2,5,7) ;


        Order order = new Order(source , des) ;

        double xBaseDistance =  order.transferCost(new XbaseCalculator()) ;

        System.out.println("xBaseDistance : " + xBaseDistance);

        double yBaseDistance =  order.transferCost(new DistanceCalculator() {
            @Override
            public double calculate(Point p1, Point p2) {
                return Math.abs(p1.getY() - p2.getY());
            }
        }) ;
        DistanceCalculator calculateBaseOnZ = (p1,  p2) -> Math.abs(p1.getZ() - p2.getZ());
        double zBaseDistance =  order.transferCost( calculateBaseOnZ) ;

        System.out.println("zBaseDistance : " + zBaseDistance );
        System.out.println("yBaseDistance : " + yBaseDistance);








    }
}
