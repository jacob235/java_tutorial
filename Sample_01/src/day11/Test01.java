package day11;

public class Test01 {
	public static void main(String[] args) {
		Person1 a = new Student1("홍길동", 20, 200201);		// 모든객체의 데이터타입은 부모가 될 수 있다.
		Person1 t = new Teacher1("이순신", 30, "JAVA");
		Person1 e = new Employee1("유관순", 40, "교무과");
		// is a
		Person1 p = a;		// 부모타입 > 자식타입
		
		((Student1)p).printA();  // (다운캐스팅을 해줘야햐 한다.)p는 부모타입이기 때문에 Student1으로 타입으로 변경해줘야 접근할 수 있다.
		
		p = t;
		((Teacher1)p).printA();
		
		p = e;
		((Employee1)p).printA();
		

	}
}
class Person1{
	private String name;
	private int age;
	
	Person1(){
		super();
	}
	
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printA() {
		System.out.printf("이름 : %s, 나이 : %2d", this.name, this.getAge());
	}
	
}

class Student1 extends Person1{
	private int id;
	
	public Student1() {
		super();
	}

	public Student1(String name, int age, int id) {
		super(name, age);				// super에 써줘도 상관없음
//		this.setName(name);
//		super.setAge(age);		 // super나 this 둘다 써도 상관없음
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void printA() {
		super.printA();
		System.out.printf("  학번 : %d %n", id);
	}
	
	
}

class Teacher1 extends Person1{
	private String subject;

	public Teacher1() {
		super();
	}

	public Teacher1(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void printA() {
		super.printA();
		System.out.printf("  담당과목 : %s %n", subject);
	}
	
	
}

class Employee1 extends Person1{
	private String dept;

	public Employee1() {
		super();
	}

	public Employee1(String name, int age) {		// 초기 값을 null로 설정한다.
		this(name, age, null);
	}
	
	public Employee1(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void printA() {
		super.printA();
		System.out.printf("  부서 : %s %n", dept);
	}
	
}

