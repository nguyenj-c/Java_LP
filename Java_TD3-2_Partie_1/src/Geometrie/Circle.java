package Geometrie;

public class Circle {
	public Point center;
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
	public double radius;

	
	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	
	public double calcSurface() {
		double surface =  this.radius * this.radius * Math.PI;
		return surface;
	}
	public double calcperim() {
		double perimetre = this.radius*2*Math.PI;
		return perimetre;
	}
	public boolean contains(Point p) {
		double radiusLenght = Math.sqrt(Math.pow(this.getCenter().getX()-p.getX(),2));
		if(radiusLenght <= this.radius)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Center=" + center + ", radius" + radius + "";
	}
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

}
