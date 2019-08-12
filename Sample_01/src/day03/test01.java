package day03;

public class test01 {

	public static void main(String[] args) {
		//  == : 기본형 값이 같은지 비교 
		//  equals() : 참조한 데이터가 같은지 비교
		
		int num1 = 99;
		int num2 = 99;
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String msg1 = new String("Hello");
		String msg2 = new String("Hello");
		
		System.out.println("num1 == num2 => " + (num1 == num2));  
		System.out.println("name1 == name2 => " + (name1 == name2));
		System.out.println("msg1 == msg2 => " + (msg1 == msg2));  // msg1, 2 에 안에는 참조되는 주소가 들어있어서 다르다고 나온다.
		System.out.println(msg1.equals(msg2));
		System.out.println(name1.equals(name2));
		
		msg1 = msg2;
	}

}
