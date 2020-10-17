package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        return Math.sqrt(Math.pow(from.getXDistance(to), 2) + Math.pow(from.getYDistance(to), 2));
    }

    public static double direction(Point from, Point to) {
        return Math.atan2(to.getYDistance(from), to.getXDistance(from));
    }
}
