package test;

import Geometrie.Circle;
import Geometrie.Point;

public class testCircle {
	public testCircle() {
		
	}
	public static void main(String[] args) {
		Point p1= new Point(0,0);
		
		Circle c1 = new Circle(p1,2);
		Circle c2 = new Circle(p1,6);
		
		System.out.println(c1);
		System.out.println(c1.calcperim());
		System.out.println(c1.calcSurface());
		System.out.println();
		c1.setRadius(c1.getRadius()*3);
		System.out.println(c1.calcperim());
		System.out.println(c1.calcSurface());
		
		c1.getCenter().move(c1.getCenter().getX(), c1.getCenter().getY());
		Point p2 = new Point(1,1);
		c1.contains(p2);
		Point p3 = new Point(9,9);
		c2.contains(p3);
		
		System.out.println(c1.equals(c2));
		
		
	}
}
