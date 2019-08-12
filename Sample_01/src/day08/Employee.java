package day08;

public class Employee {
/**
 * 
 * @author Doowonjae
 * @since 2019 07 16
 * @version 1.0
 * 
 */
	static String cName = "BIT";
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() {
		// 기본 생성자                 default 생성자
		// 초기화 작업을 주로 한다.
//		System.out.println("Employee() call");
//		name = "사원이름";
//		dept = "OOO 부서";
//		single = true;
		this("사원이름", "OOO 부서", true); // 나의 또다른 생성자 함수를 호출하는 것
	}
	public Employee(String name, String dept) {
		this(name,dept,true);
//		System.out.printf("Employee(%s, %s) call%n", name, dept);
//		this.name = name;
//		this.dept = dept;
	}

	public Employee(String name, String dept, boolean single) {
		// 기본 생성자                 default 생성자
		// 초기화 작업을 주로 한다.
//		System.out.printf("Employee(%s, %s, %s) call%n", name, dept, single);
		this.name = name;
		this.dept = dept;
		this.single = single;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public boolean isSingle() {
		return single;
	}
	/**
	 * 
	 * @param single 결혼 미혼인지?
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 * Employee 정보 출력
	 */
	public void print() {
		System.out.printf("[사원명 : %s, 근무부서 : %s, single : %b] %n",
				getName(), getDept(), isSingle());
//		System.out.println("회사명 :" + cName);
	}
}
