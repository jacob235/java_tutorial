package day07;

import java.util.Arrays;

import util.Sort;

public class SortTest {
	public static void main(String[] args) {
		
		
		int[] nums = {4,6,123,354,23,1,35,100,89,90,99};
		int[] numsSort = Sort.sort(nums);
		
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(numsSort));
		
		

	}
}
