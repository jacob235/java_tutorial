package day05;

import java.util.Arrays;

public class test01 {

	public static void main(String[] args) {
		int num1 = 99;
		int num2 = num1;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		num1 = 77;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		// call by value
		// call by reference
		
		int[] n1 = {11, 22, 33, 44, 55};
		int[] n2 = n1;
		int[] n3 = new int[n1.length];  // 	배열 n1을 복사하라고 함.
		for(int i = 0; i < n1.length; i++) {
			n3[i] = n1[i];  // array copy
		}
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		n1[2] = 0;
		System.out.println(Arrays.toString(n1));   
		System.out.println(Arrays.toString(n2));    // 배열의 주소가 같아서 바뀐 값이 저장됨.
		System.out.println(Arrays.toString(n3));    // 주소를 참조하는것이 아니라 데이터를 저장하여 원본이 유지됨.
		
		
		
	}

}
