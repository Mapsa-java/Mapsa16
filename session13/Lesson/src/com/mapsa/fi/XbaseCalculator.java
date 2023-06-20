package com.mapsa.fi;


public class XbaseCalculator implements DistanceCalculator{

    @Override
    public double calculate(Point p1, Point p2) {
        return Math.abs(p1.getX() - p2.getX());
    }
}
