package day04;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("알파벳 아스키 코드 값 확인");
		
		char a = 'a';
		char a1 = 'A';
		
		for( int i = 0; i < 26; i++) {			
			System.out.printf("%c : %d, %c : %d \n", a,(int)a++, a1, (int)a1++);
		}
		
		/*
		 * 변수 ch에  저장된 문자가 대문자인 경우에만
		 * 소문자로 변경하는 코드를 완성합니다.
		 * */
		
		
		// [이건 내가 한거]
//		while(true) { 
//			char ch = input.nextLine().charAt(0);
//			if(ch >= 65 || ch <= 90) { 
//				ch += 32; System.out.println(ch); }
//			else System.out.println(ch);
//		if(input.equals('q')) { break; } 
//		}
		
		
		//[강사님이 하신거]
		
		System.out.println("문자열을 입력하세요 ");
		String msg = input.nextLine();
		
		for(int i = 0; i < msg.length() ;i++) {
			
			char ch = msg.charAt(i);
			char s = (char)(ch >= 65 && ch <= 90 ? ch + 32 : ch);
			
			System.out.print(s);
		}
		// 소문자 ==> 대문자
		// 대문자 ==> 소문자
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
