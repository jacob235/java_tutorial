package day03;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("점수를 입력하세요 : ");
		// int jumsu = input.nextInt();

		int jumsu = Integer.parseInt(input.nextLine()); // 이 표현이 가장 좋다.

		// input.nextLine();

		// 유효성 검사 코드를 넣어줘야 한다.
		

		input.close();  // 필요없는 데이터를 없애는 작업
		input = null;
		
		
		if (!(jumsu >= 0 && jumsu <= 100)) {
			System.out.println("점수를 다시 입력하세요!!!!");
			return;  // return문 : 현재 수행중인 함수를 종료하고 호출한 자리로 돌아가는 문장
		}
		/*
		 * if(jumsu >= 80) System.out.println("PASS"); else
		 * System.out.println("NO PASS");
		 */

		// 삼항 연산으로 처리
		System.out.printf("점수 : %d점 %n", jumsu);
		String result = jumsu >= 80 ? "PASS" : "NO PASS";

		System.out.println(result);
		
		System.out.println();
		
		//A, B, C, D, F 등급 처리
		
		String grade ="F";
		
		if(jumsu >= 90) {
			grade = "A";
		}
		else if(jumsu >= 80) {
			grade = "B";
		}
		else if(jumsu >= 70) {
			grade = "C";
		}
		else if(jumsu >= 60) {
			grade = "D";
		}
		else {
			System.out.println("공부좀 해라");
			grade = "F";
		}
		// System.out.println("점수 : " + jumsu + " : " + result +" : "+ grade +"등급");
		System.out.printf("점수 : %d점 / %s / %s 등급 %n ", jumsu, result, grade);
		
		// [과제] 삼항연산자로 처리
		String result1 = jumsu >= 90 ? "A" : (jumsu >= 80 ? "B" : (jumsu >= 70 ? "C" : (jumsu >= 60 ? "D" : "F")));
		System.out.printf("점수 : %d점 / %s / %s 등급 %n ", jumsu, result, result1);
		
		// 등급 처리 switch로 만들기
		System.out.println("****************등급처리 switch ***********************");
		char c = ' ';
		switch(jumsu/10) {
		case 10:
		case 9:
			c = 'A';
			break;
		case 8:
			c = 'B';
			break;
		case 7:
			c = 'C';
			break;
		case 6:
			c = 'D';
			break;		
		default :
			c = 'F';
			break;
		}
		System.out.printf("성적 : %c %n", c);
		
		return;
	}

}
