package util;

import java.util.Arrays;

public class Test extends Object{

	public static void main(String[] args) {
		
		String c = letter("java Programming");
		System.out.println(c);


	}
	
	public static String letter(String problem) {
		String result = "";
		for(int i = problem.length()-1; i >= 0; i--) {
			result += problem.charAt(i);
		}
		return result;	// 배열 내용 보여주는 메서드
	}


}
