package util;

import java.util.Arrays;

public class Sort {
	public static int[] sort(int[] nums) {
		//배열 원본은 변경이 되지 않도록 하고
		//오름차순으로 정렬된 int[]를 리턴한다.
		
		int[] numsValue = Arrays.copyOf(nums, nums.length);		// 내가 한거
		
		
		int[] copy = new int[nums.length];						// 강의쌤이한거
		System.arraycopy(nums, 0, copy, 0, nums.length);		// 강의쌤이한거

		
		for(int i=0; i<numsValue.length-1; i++) {
			int min = i;
			for(int j=i+1; j<numsValue.length; j++) {
				if(numsValue[min]>numsValue[j]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = numsValue[i];
				numsValue[i] = numsValue[min];
				numsValue[min] = temp;
			}
		}
		
		return numsValue;
	}

}
