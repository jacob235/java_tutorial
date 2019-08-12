package day12;

public class BookTest {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1);
		System.out.println(msg2);
		
		System.out.println(msg1.equals(msg2));
		
		Book b1 = new Book("java", 2200);
		Book b2 = new Book("java", 2200);
//		System.out.println(b1.equals(null));
		System.out.println(b1.toString());
		System.out.println(b2);
//		System.out.println(b1.equals(new Date()));
		
		
		b1.close();
		b2.close();
		b1 = null;
		b2 = null;		// 용량 정리
		
		
//		System.gc();
		
		System.out.println("====main end====");
	}

}
