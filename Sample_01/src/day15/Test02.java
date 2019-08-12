package day15;

public class Test02 {

	public static void main(String[] args) {
//		A a = new A();
//		a.p();
		
		A.B b = new A("AAAAAA").new B();		// B내부클래스를 데이터 타입으로 한것, A외부클래스안에 B내부클래스를 객체 생성 한것 
		b.print();
		
//		A.C c = new A().new C();
//		c.print();
		
		A.C.print();
		
		
		
		
		
		

		
		
	}
}
class A{		// 클래스 앞에는 static 붙일 수 없다.
	String name = "A";
	public A() {}
	public A(String name) {
		this.name = name;
	}
	
	void p() {
		System.out.println("A에서 호출");
		new B().print();		// 내부 클래스의 메소드를 사용하고 싶으면 객체 생성을 해야 한다.
	}
	class B{
		String name = "B";
		void print() {
			System.out.println(this.name);
			System.out.println(A.this.name);
		}
	}
	static class C{		// 내부클래스에는 static 허용한다.
		static void print() {
			System.out.println("~~~~~~~~~~");
		}
	}
}
