package Geometrie;

public class Point {

	public static final double DFL_X= 0.0;
	public static final double DFL_Y= 0.0;
	
	private double x;
	private double y;

	public double getX() {
		return x;
	}
	
	public Point() {
		super();
		// TODO Auto-generated constructor stub
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
	public static double getDflX() {
		return DFL_X;
	}
	public static double getDflY() {
		return DFL_Y;
	}
	public void move(double x, double y) {
		this.x= x;
		this.y= y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
