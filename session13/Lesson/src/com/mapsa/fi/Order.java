package com.mapsa.fi;

public class Order {


    private Point source ;
    private Point destination ;
    private final Double interest = 20.0;

    public Order(Point source, Point destination) {
        this.source = source;
        this.destination = destination;
    }

    public double transferCost(DistanceCalculator distanceCalculator){
        return interest * distanceCalculator.calculate(source , destination) ;
    }


}
