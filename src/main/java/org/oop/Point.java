package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getXDistance(Point pointTwo) {
        return this.x - pointTwo.x;
    }

    public double getYDistance(Point pointTwo) {
        return this.y - pointTwo.y;
    }

}
