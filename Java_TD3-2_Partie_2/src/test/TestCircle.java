package com.iut.lp.test;

import com.iut.lp.geometry.Circle;
import com.iut.lp.geometry.Point;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point(5, 5), 2);

        System.out.println(circle);

        System.out.println(circle.computePerimeter());
        System.out.println(circle.computeSurface());

        circle.setRadius(circle.getRadius() * 3);

        System.out.println(circle.computePerimeter());
        System.out.println(circle.computeSurface());

        circle.getCenter().setX(0);
        circle.getCenter().setY(0);

        assert  circle.contains(new Point(1, 1));
        assert !circle.contains(new Point(9, 9));

        assert !circle.overlays(new Circle(new Point(0, 0), 2));
        assert  circle.overlays(new Circle(new Point(0, 0), 6));
    }
}
