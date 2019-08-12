package day13;

public class Test03 {

	public static void main(String[] args) {
		Drawable c1 = new Circle(new Point(5, 5), 3);
		System.out.println(c1);
		System.out.println(((Shape)c1).area());		// area메서드는 Shape클래스 메서드이므로 캐스팅해줘야한다.
		((Drawable)c1).draw();		// draw메서드는 Drawable인터페이스 메서드이므로 캐스팅해줘야한다.
		
		
		
		
		
		
	}

}
