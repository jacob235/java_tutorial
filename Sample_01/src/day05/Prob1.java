package day05;

import java.util.Arrays;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] nums = new int[6];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*45+1);   // 1~45 난수 생성
			for(int j = 0; j < i; j++) {
				if(nums[i] == nums[j]) {
					i -= 1;               // i와 j가 같을 때까지 i를 초기화 시켜준다.
				}
			}
		}
		
		for(int i = 0; i < nums.length-1; i++) {   // 정렬
			int min = i;
			for(int j = i+1; j < nums.length; j++) {
				if(nums[j] < nums[min]) {
					min = j;
				}
			}
			if(i != min) {
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] = temp;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
