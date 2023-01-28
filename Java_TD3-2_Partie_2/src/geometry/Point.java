package com.iut.lp.geometry;

import java.util.Objects;

public class Point {
    public final static double DEFAULT_X = 0.0;
    public final static double DEFAULT_Y = 0.0;
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(DEFAULT_X, DEFAULT_Y);
    }

    public void move(double x, double y) {
        this.x += x;
        this.y = y;
    }

    // don't trust this (yet)
    public double distanceFrom(Point other) {
        return Math.sqrt(
                Math.pow(other.getX() - this.x, 2)
                + Math.pow(other.getY() - this.y, 2)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
