package day04;

public class Prob4 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
				
		for(int i = 0; i < sourceString.length(); i++) {
			char result = sourceString.charAt(i);
			encodedString = encodedString + String.valueOf(result >= 'a' && result <= 'w' ? (char)(result +3) : 
				(result == 32 ? result = 32: (char)(result - 23)));
		}
		System.out.println();
		
		
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		// 프로그램 구현부 끝.
				
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		
		// [강사님 코드]***********************************************
		
		String encodedString1 = "";
		for(int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			if(c=='x'||c=='y'||c=='z'){
				encodedString1 += (char)(c-23);				
			}
			else if (c == ' ') {
				encodedString1 += c;
			}
			else {
				encodedString1 += (char)(c+3);
			}
		}
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString1);

	}

}
