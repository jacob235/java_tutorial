package day07;

public class CalcTest {

	public static void main(String[] args) {

		
		Calc c1 = new Calc();
		System.out.println(c1.add(11, 99));		// 인스턴스 메서드와 인스턴스 변수
		
		
		System.out.println(Calc.sub(11, 99));		// 클래스(static) 메서드와 클래스(static) 변수
		System.out.println(Calc.multiple(11, 99));
		System.out.println(Calc.divide(11, 99));
		
		
		
		
	}
}
