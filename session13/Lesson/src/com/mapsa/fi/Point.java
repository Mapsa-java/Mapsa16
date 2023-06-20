package com.mapsa.fi;

public class Point {

    private int x ;
    private int y ;
    private int z ;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y +
                ", z=" + z ;

    }

    public static boolean checkIfXgreaterThanFive(Point p){
        return p.getX() > 5 ;
    }

    public  boolean checkIfXgreaterThanTwo(Point p){
        return p.getX() > 2 ;
    }
}
