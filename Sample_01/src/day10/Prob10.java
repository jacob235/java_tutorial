package day10;

public class Prob10 {
	public static void main(String[] args) {
		new Student1("홍길동", 20, 200201).print();
		new Teacher1("이순신", 30, "JAVA").print();
		new Employee1("유관순", 40, "교무과").print();
		

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
	
	public void print() {
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
	public void print() {
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
	public void print() {
		super.printA();
		System.out.printf("  부서 : %s %n", dept);
	}
	
}

