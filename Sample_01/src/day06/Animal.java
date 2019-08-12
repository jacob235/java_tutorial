package day06;

public class Animal {
	private boolean live;
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
		return ;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public void display() { 
		System.out.printf("이름 : %-3s, 나이 : %d살, 생존여부 : %-3b %n", this.name, this.age, this.live);
	}
	public void print() {
		System.out.println(name + ": " + age + " : " + live);
	}


}
