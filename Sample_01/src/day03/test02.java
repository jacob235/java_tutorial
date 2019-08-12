package day03;

import java.util.Scanner;
public class test02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 100;
		
		System.out.println(num > 0 ? "양수" : "음수");
		
		// 양수, 0, 음수
		
		System.out.println(num == 0 ? "0" : num > 0 ? "양수" : "음수");
		
		String result = num == 0 ? "0" : num > 0 ? "양수" : "음수";
		
		System.out.println(result);
		
		
		String a = input.next();
		
		char c = a.charAt(0);
		
		char b = (char)((int)c + 1);
		
		System.out.println(b);
		
		
		
		
		
		
		
		
	}

}
