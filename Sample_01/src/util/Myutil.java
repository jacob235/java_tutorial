package util;

import java.util.Arrays;

public class Myutil {

		public static long add(int a, int b) {
			return a+b;
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
		
		public static int[] sort(int[] nums) {
			
			int[] numsValue = Arrays.copyOf(nums, nums.length);
			
			int[] copy = new int[nums.length];						
			System.arraycopy(nums, 0, copy, 0, nums.length);		
			
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
		
		public static String rightPad(String str, int size, char padChar) {
			
			String result = "";
			if(str.length() <= size) {
				result = str;
				for(int i = 0; i < size-str.length(); i++) {
					result += padChar;
					}
				return result;
				}
			
			else return str;
			
		}
		
		public static String leftPad(String str, int size, char padChar) {
			
			String result = "";
			if(str.length() <= size) {
				for(int i = 0; i < size-str.length(); i++) {
					result += padChar;
					}
				return result + str;
				}
			
			else return str;
		}
		
		// 숫자를 넘겨 받아 그 중 가장 큰 수를 리턴하는 함수 max
		public static int max(int ... nums) {
			int max = Integer.MIN_VALUE;		// int 값중 가장 작은 값
			for(int i = 0; i < nums.length; i++){
				if (nums[i] > max) {
					max = nums[i];
				}
			}
			return max;
		}
		
		public static int min(int ... nums) {
			int min = 1000000000;		// int 값중 가장 큰 값
			for(int i = 0; i < nums.length; i++){
				if (nums[i] < min) {
					min = nums[i];
				}
			}
			return min;
		}

}
