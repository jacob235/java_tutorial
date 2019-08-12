package day04;

import java.util.Arrays;

public class test05 {

	public static void main(String[] args) {
		// 배열 선언, 생성, 초기화
		
		int[] scores = {88, 99, 100, 22, 56, 88, 99};
		String[] names = {"홍성빈", "두원재", "김김김", "박박박", "최최최", "이이이"}; 
		//{}로 배열을 만드는 것은 선언과 동시에 생성해야한다.
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));
		
		if(names.length > 6) System.out.println(names[6]);
		System.out.println("------------------------------------------------");
		
		for(String data :names) {
			System.out.println(data.charAt(0) + "*" + data.charAt(data.length()-1));
		}
		
		double sum = 0;
		for(int data : scores) {
			sum += data;
		}
		System.out.printf("평균 = %.2f", sum/scores.length);
	}
}
