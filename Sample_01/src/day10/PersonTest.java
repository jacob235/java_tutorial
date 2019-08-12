package day10;

public class PersonTest {

	public static void main(String[] args) {
		Student std = new Student("홍길동", 20, 200201);
		Teacher tch = new Teacher("이순신", 30, "JAVA");
		Employee emp = new Employee("유관순", 40, "교무과");
		
		std.print();
		tch.print();
		emp.print();

	}

}
