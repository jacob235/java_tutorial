package day11;

public class Test02 {

	public static void main(String[] args) {		 // Object 타입은 가장 상위 부모 타입이므로 toString, equals 메소드빼고는 다 다운캐스팅 해야한다.
		Person1[] p = {new Student1("홍길동", 20, 200201),
					   new Teacher1("이순신", 30, "JAVA"),
					   new Employee1("유관순", 40, "교무과"),   
		};
		
		for(Object data : p) {
			((Person1) data).printA();		// 부모(Person) 영역의 자원을 접근할 때는 다운 캐스팅 할 필요 없이 그냥 접근 가능
			System.out.println();
		}
		System.out.println("==========================");
//		for(Object data :p) {		// 자식 영역의 자원을 접근할 때는 다운 캐스팅 필요
//			// 반드시 하단부에 어떤 객체가 바인딩 되어 있는지 타입 체크 필요
//			if(data instanceof Student1)((Student1)data).print();
//			if(data instanceof Teacher1)((Teacher1)data).print();
//			if(data instanceof Employee1)((Employee1)data).print();
//		}
		for(Person1 data : p) {
			callD(data);
		}
		
	}
	public static void callD(Person1 p) {
		p.printA();		// 오버라이딩
	}
}
