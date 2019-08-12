package day06;

public class Employee {
	// 클래스 = 데이터(변수) + 메소드(기능)
	private String name;
	private String dept;
	private int age;    // 데이터(변수)
	
	private boolean single;
	
	public void display() {    // 메소드(기능)
		System.out.printf("[나이 : %-10d 이름 : %-10s 부서 : %-10s, 싱글유무 : %b] %n",
				getAge(), getName(), this.dept, this.single);
		return ; // void 리턴 뒤에 데이터가 없는 것
	}
	
	public void setAge(int age) {
		if(!(age > 0 && age <= 100)) {
			System.out.println("age(나이) 정보가 올바르지 X");
			return;
		}
		this.age = age;
		return;
		
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		if(!(name.length() >= 2 && name.length() <= 6)) {
			System.out.println("name(이름) 정보가 올바르지 X");
		}
		this.name = name;
		return ;
	}
	public String getName() {
		return name;
	}	
	public void setDept(String dept) {
		if(!(dept.length() >= 2 && dept.length() <= 6)) {
			System.out.println("dept(부서) 정보가 올바르지 X");
		}
		this.dept = dept;
		return;
	}
	public String getDept() {
		return dept;
	}

	public boolean isSingle() {    			// boolean 타입은 메서드 이름이 is로 시작한다.
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}	
}
