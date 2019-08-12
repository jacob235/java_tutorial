package day02;

public class test02 {

	public static void main(String[] args) {
		int num = 99;  // 지역변수
		System.out.println(num);
		long num2 = 99999999999L;
		
		byte b = 17;
		
		b = (byte) (b+1);
		System.out.println(b);
		
		System.out.println(1 + 1 + "1");
		
		double a = 1/2.0;
		System.out.println(1.0/2);
		System.out.println(a);
		
		String name = "홍길동";
		System.out.println(name.charAt(0)+"**");
		
		String address = new String("비트교육센터");
		System.out.println(address + ":" + address.length());
		
		
		long number = 9099999999999999999L;
		System.out.println(number);
		
		System.out.println("a" + ":" + (int)'a');
		System.out.println("A" + ":" + (char)((int)'A'+32));
		System.out.println();
		
		
		
		
		
		
		
	}

}
