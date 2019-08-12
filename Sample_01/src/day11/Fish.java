package day11;

import day10.Animal;

public class Fish extends Animal{
	private String name;
	
	public Fish() {
		super("물고기");
	}
	
	public Fish(String name) {
		super("물고기");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fishPrint() {
		System.out.printf("[%s : %s] %n", this.kind, this.name);
	}
	
	//메소드 오버라이딩 => 부모로부터 물려 받은 기능을 다시 재정의 하는 것
	@Override
	public void breath() {
		System.out.println(kind + " : 아가미로 숨쉬기~~~~");
	}
	
	@Override
	public void print() {
//		super.print();
//		System.out.printf("%s %n", this.name);
		this.fishPrint();
	}
}
