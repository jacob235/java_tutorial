package day05;

import java.util.Arrays;

public class test02 {

	public static void main(String[] args) {
		
		int[] score = {77, 99, 100, 85, 91};
		
		int[] sc = new int[score.length*2];
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(sc));
		
		System.arraycopy(score, 0, sc, 0, score.length);  // 주소는 다 object 이다.
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(sc));
		
		String[] names = {"홍길동", "박길동", "고길동", "최길동", "안녕"};
		
		String[] namesCopy = new String[names.length*2];
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(namesCopy));

		
		System.arraycopy(names, 0, namesCopy, namesCopy.length-names.length, names.length);
		
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(namesCopy));
	}
}
