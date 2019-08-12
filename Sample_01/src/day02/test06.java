package day02;

public class test06 {

	public static void main(String[] args) {
		
		int num = 100;
		
		System.out.println(++num);
		System.out.println(num);
		
		int score = -99;
		
		boolean result = (0 <= score) && (score <= 100);
		System.out.println("score 유효성 검증 결과 : " + result);
		
		boolean result1 = (0 <= score) & (score <= 100);
		System.out.println("score 유효성 검증 결과 : " + result1);
		
		System.out.println(3 & 4);
		System.out.println(3 | 4);
		// 00000011
		// 00000100
		// 00000111
		
		System.out.println(4<<2);
		System.out.println(16>>2);
	}
}
