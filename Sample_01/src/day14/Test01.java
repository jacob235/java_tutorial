package day14;

public class Test01 {
	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(4,4),3);
		
		Rectangle1 r1 = new Rectangle1(new Point(11,11), 3, 7);

		Shape1[] shapes = {c1, r1};
		for(Shape1 data : shapes) {
			System.out.println(data);
			System.out.println(data.area());
			data.move(1);
			data.draw();
			System.out.println(data);
		}
	}
}

