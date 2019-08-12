package day14;

public class Rectangle extends Shape implements Resizable{
	double width;
	double height;
	

	public Rectangle(double w, double h) {
		super(4);
		this.width = w;
		this.height = h;
	}

	@Override
	public void resize(double s) {
		System.out.printf("new area: %.1f %n",(width*s)*(height*s));
	}

	@Override
	double getArea() {
		return width*height;
	}
}
