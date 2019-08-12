package day05;

import java.util.Arrays;

public class test03 {

	public static void main(String[] args) {
		String msg = "hello JAVA~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
		String msg2 = "hi SQL~~~~~~";
		
		char[] c = new char[msg.length()];
		for(int i=0; i < msg.length(); i++) {  // String타입으로 char타입으로 바꿔주는 방법
			c[i] = msg.charAt(i);
		} 
		
		
		char[] cc = msg.toCharArray();    // String타입으로 char타입으로 바꿔주는 방법을 기능으로 만들어줌
		char[] cc2 = msg2.toCharArray();
		
		cc[0] = 'Q';
		String ne = new String(cc);  // char타입배열을 String으로 형변환 해주는 방법
		
		System.out.println(msg);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(cc));
		System.out.println(Arrays.toString(cc2));
		System.out.println(ne);
		
		
		
		
	}

}
