package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test01_String {

	public static void main(String[] args) {
//		String msg = "";
//		String msg2 = new String(new char[] {'g','a','s'});
//		String msg1 = "hello";
//		String msg3 = arg[0];
		String msg1 = JOptionPane.showInputDialog("book 정보를 입력하세요 ex(title / price)");
//		String msg1 = "java programming/23000";
//		System.out.println(msg1);
//		System.out.println(msg1 = msg1.toUpperCase());		//메서드를 실행해도 원본이 바뀌지 않는다.
		
		
		System.out.println(msg1);
		
		if(msg1.indexOf("/") == -1) {
			System.out.println("다시 입력하세요.");
			System.out.println("/ 가 필요합니다.");
			return;
		}
		String[] data = msg1.split("/");
		System.out.println(Arrays.toString(data));
		
		Book b1 = new Book(data[0].trim(), Integer.parseInt(data[1].trim()));
		b1.print();
	}

}

