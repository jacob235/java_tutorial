package day07;

import java.util.Arrays;

import util.*;

public class MyMathTest {
	public static void main(String[] args) {
		System.out.println(MyMath.add(33, 99));
		System.out.println(MyMath.add(33.3, 99.5));
		System.out.println(MyMath.add(33.3, 99.5, 90));
		System.out.println(MyMath.add(33.3, 99.5, 90, 88.16));
		System.out.println(MyMath.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println(MyMath.add(new double[] {1,2,3,4,5,6,7,8,9,10}));
		double[] d = new double[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(d));
		
		int[] d1 = new int[] {1,2,3,4,5,6,7,8,9,10, 555, 1231, 344445, 12, -1, 3432};
		
		int i = 100;
//		Integer ii = new Integer(100);
		Integer ii = i;
		i = ii;		// 오토박싱 언방싱 - 기본형 타입을 Integer와 같은 wrapper클래스 타입으로 변환해 주거나 반대로 할때 바로 변환하도록 해줌 
		System.out.println(i + "  " + ii);
		
		System.out.println(Myutil.max(d1));
		System.out.println(Myutil.min(d1));
	}
	

}
