package day06;

public class Test03 {
	public static void main(String[] args) {
//		int num;   // 로컬 변수
//		String name;  // 로컬 변수
		
		Employee emp1 = new Employee();  //class 하나 새로 만들면 새로운 데이터 타입이 만들어진다는 뜻이다.
		emp1.display();
//		System.out.println(emp1.number + " : " + emp1.name + " : " + emp1.dept);
		
		Employee emp2 = new Employee();  //class 하나 새로 만들면 새로운 데이터 타입이 만들어진다는 뜻이다.
		emp2.setAge(19);
		emp2.setName("전지현");
		emp2.setDept("인사부");
		emp2.setSingle(true);
		emp2.display();
//		System.out.println(emp2.number + " : " + emp2.name + " : " + emp2.dept);
		
		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("하정우");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		emp3.display();
//		System.out.println(emp3.number + " : " + emp3.name + " : " + emp3.dept);
		
		// new 키워드를 이용해서 하드디스크에 있는 클래스를 힙 영역으로 올리는 것을 객체생성, 인스턴스 생성이라고 한다.(객체 == 인스턴스)		
		
	}

}
