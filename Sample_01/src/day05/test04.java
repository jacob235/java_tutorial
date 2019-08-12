package day05;

import java.util.Arrays;

public class test04 {

	public static void main(String[] args) {
		//난수발생
		// System.out.println((int)(Math.random()*10));  // 0보다 크거나 같고 1보다 작은 값 발생
//		String[] args = {"5"};
//		String[] args = {};
		
		if(args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요..");
			System.out.println("샐행_예) java day05.test04 5");
			return;
		}
		
//		int[] nums = new int[Integer.parseInt(args[0])];
//		
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = (int)(Math.random()*45+1);  // 1~45 사이의 정수 Math.random() 이용
//		}
		int[] nums = {15,6,45,27,2};
		
		System.out.println(Arrays.toString(nums));
		
		// 정렬 SORT
		System.out.println("------------정렬----------------");
		int count = 0;
		for(int i = 0 ; i < nums.length-1; i++) {
			int min = i;
			for(int j = i+1; j < nums.length; j++) {
				if(nums[j] < nums[min]) {
					min = j;
					}
				}
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp;
			count++;
			}
		// 스와핑 작업을 최소한 수행하게 코드 수정합니다.    count 최소화 하기 최대 4번으로 
		System.out.println("count => " + count);
		System.out.println(Arrays.toString(nums));
	}

}
