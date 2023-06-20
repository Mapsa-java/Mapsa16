package com.mapsa.fi;


@FunctionalInterface
public interface DistanceCalculator {
    double calculate(Point p1 , Point p2);
}
