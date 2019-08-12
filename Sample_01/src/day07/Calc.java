package day07;

public class Calc {
	// class 변수 == static 변수
	static int data = 0;
	
	boolean flag;
	
	
	//class method == static method (class로 접근하기 때문에)
	public long add(int a, int b) {		// static 을 쓰면 메모리가 다른 영역에 뜬다.
		System.out.println(data);		// Calc.data 이지만 생략 가능하다.
		return a+b;						// static 메서드가 아니더라도 static 변수를 사용할 수는 있다.
	}
	public static long sub(int a, int b) {
		
		return a-b;
	}
	public static long multiple(int a, int b) {
		return a*b;
	}
	public static double divide(double a, double b) {
		if(b == 0) return 0;
		return a/b;
	}

}
