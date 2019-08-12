package day08;

public class Page164_Test {		// 메인 메서드가 포함된 클래스로 파일명으로 한다.
	public static void main(String[] args) {
		Count c1 = new Count(); 
		Count c2 = new Count(); 
		Count c3 = new Count(); 
		Count c4 = new Count(); 
		System.out.println(Count.count);
	}
}

class Count{
	int c;
	static int count;
	public Count() {
		c++;
		count++;
	}
}