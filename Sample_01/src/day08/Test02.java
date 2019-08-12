package day08;

public class Test02 {

	public static void main(String[] args) {
		Student[] students = {
				new Student("두원재", 2019001, 90, 99, 100),
				new Student("박보영", 2019002, 77, 69, 30),
				new Student("이민영", 2019041, 75, 90, 55),
				new Student("정유미", 2019019, 83, 43, 100),
				new Student("아이린", 2019013, 85, 155, 60)
				};
		for(Student data : students) {
//			if(data.getGrade() == 'C') {
				data.print();		
//			}
		}
//		Student s = new Student("두원재", 2019001, 90, 99, 100);
//		s.print();
	}

}
class Student{
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;
	
	public Student(String name, int number, int kor, int eng, int math) {
		this.name = name;
		this.number = number;
		setKor(kor);
		setEng(eng);
		setMath(math);
		setGradeProcess();
	}
//	public Student(String data) {
//		
//	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		if(!checkJumsu(kor)) return;
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		if(!checkJumsu(eng)) return;
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		if(!checkJumsu(math)) return;
		this.math = math;
	}
	
	public char getGrade() {
		this.setGradeProcess();
		return grade;
	}


	private void setGradeProcess() {
		double avg = (kor+eng+math)/3.;
		char c = ' ';
		switch ((int)avg/10) {
		case 10:
		case 9:
			c = 'A';
			break;
		case 8:
			c = 'B';
			break;
		case 7:
			c = 'C';
			break;
		case 6:
			c = 'D';
			break;
		default:
			c = 'F';
		}
		this.grade = c;
	}


	public void print() {
		System.out.printf("%s, %.2f, %s학점 %n", name, (kor+eng+math)/3., getGrade());
	}
	
	private boolean checkJumsu(int num) {
		boolean flag = true;
		
		if(num > 100 || num < 0) {
			System.out.println(name + " " + num + "점수가 유효하지 않습니다.");
			flag = false;
		} 
		return flag;
	}
}
