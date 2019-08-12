package day04;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		// 소문자 ==> 대문자
		// 대문자 ==> 소문자
		Scanner input = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요.");
		String letter = input.nextLine();
		String letterChange = "";
		for(int i = 0 ; i < letter.length(); i++) {
			char result = letter.charAt(i);
			if(result >= 'a' && result <= 'z') {
				letterChange = letterChange + String.valueOf((char)(result-32));
			}
			else if(result >= 'A' && result <= 'Z') {
				letterChange = letterChange + String.valueOf((char)(result+32));
			}
		}
		System.out.println(letterChange);
	}
}
