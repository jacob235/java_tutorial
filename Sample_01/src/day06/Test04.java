package day06;

public class Test04 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		emp2.setAge(19);
		emp2.setName("전지현");
		emp2.setDept("인사부");
		emp2.setSingle(true);
		
		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("하정우");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		
		Employee emp4 = new Employee();
		emp4.setAge(30);
		emp4.setName("박보영");
		emp4.setDept("홍보부");
		
		Employee emp5 = new Employee();
		emp5.setAge(33);
		emp5.setName("이민정");
		emp5.setDept("총무부");
		

		Employee[] emp = {emp1, emp2, emp3, emp4, emp5};
		
		for(Employee data : emp) {
			if(data.getDept() != null && data.getDept().equals("영업부")) {
				System.out.println(data.getAge());	
			}
		}
		
		System.out.println("==Single인 사원 목록==");
		
		double sum = 0;
		int count = 0;
		
		for(int i=0; i < emp.length; i++) {
//			System.out.println(emp[i].isSingle());
			sum += emp[i].getAge();
			count++;
			}
		System.out.println("직원 평균 나이 :" + sum/count);
		
		
		
		
	}

}
