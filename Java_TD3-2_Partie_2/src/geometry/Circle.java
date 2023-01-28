package com.iut.lp.geometry;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double computeSurface() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double computePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public boolean overlays(Circle other) {
        return this.center.equals(other.getCenter())
            && Double.compare(radius, other.getRadius()) == 0;
    }

    public boolean contains(Point other) {
        return other.distanceFrom(center) <= radius;
    }

    public String toString() {
        return "Circle{radius:" +
                + radius
                + ", "
                + "point:"
                + center
                + "}";
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
