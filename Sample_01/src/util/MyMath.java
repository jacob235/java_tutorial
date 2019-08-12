package util;

public class MyMath {
	
	public static long add(int a, int b) {
		return a+b;
	}
	
	public static double add(double a, double b) {		// 메서드 오버로딩 : 이름은 동일하지만 파라미터(인자타입)이 다르다. 메서드 타입이 다른것만으로는 안된다.
		return a+b;
	}
	public static double add(double a, double b, double c) {
		return a+b+c;
	}
	
	// 가변인자 -> 매개변수에서 가장 마지막에 와야 한다.
	public static double add(double ... nums) {		// [] 배열 처리가 된다.
		double sum = 0;
		for(double data : nums) {
			sum += data;
		}
		return sum;
	}
//	public static double add(double[] a) {
//		double sum = 0;
//		for(double data : a) {
//			sum += data;
//		}
//		return sum;
//	}
}
