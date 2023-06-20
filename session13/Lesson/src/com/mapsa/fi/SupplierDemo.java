package com.mapsa.fi;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Double> integerSupplier = () -> Math.random() ;
        System.out.println(integerSupplier.get());
        Supplier<Point> pointSupplier = () -> new Point(5,13,24);
        System.out.println(pointSupplier.get());



    }
}
