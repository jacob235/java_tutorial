package day12;

public class Circle extends Shape{
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void calculationArea() {
		area = (radius*radius)*3.141592653589793;
	}
	
}
