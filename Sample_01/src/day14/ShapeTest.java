package day14;

public class ShapeTest {

	public static void main(String[] args) {

		Shape[] shapes = {
				new Rectangle(5, 6),
				new RectTriangle(6, 2)
				};
		
		for(Shape data : shapes) {
			System.out.printf("area: %.1f %n",data.getArea());
			if(data instanceof Resizable) {
				((Resizable) data).resize(0.5);	
			}
		}
	}

}
