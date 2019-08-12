package day02;

public class test04 {

	public static void main(String[] args) {
		System.out.println("byte type max valu => "+ Byte.MAX_VALUE);
		System.out.println("int type max valu => "+ Integer.MAX_VALUE);
		System.out.println("long type max valu => "+ Long.MAX_VALUE);
		
		System.out.println(Math.PI);
		
		char c = 's';
		System.out.println(c + " 숫자니? " + Character.isDigit(c));
		
		int s1 = Integer.parseInt("1")+Integer.parseInt("1");
		System.out.println(s1);
		double s2 = Double.parseDouble("100.123")+ Double.parseDouble("100.123");
		System.out.println(s2);
		
		long a = Integer.MAX_VALUE;
		long b = Integer.MAX_VALUE;
		
		long ab = (long)(a + b);
		
		System.out.println(ab);
	}
}
