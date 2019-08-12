package day14;

public class RectTriangle extends Shape{
	private double width;
	private double height;

	RectTriangle(double width, double height){
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		return (width * height)/2;
	}
	

}
