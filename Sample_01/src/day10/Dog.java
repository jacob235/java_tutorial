package day10;

public class Dog extends Animal{
	private String kind = "강아지 종류";
	private String name = "강아지 이름";
	public String getKind() {
		return kind;
	}
	public Dog() {
		super("강아지과");
	}
	public Dog(String kind, String name) {
		super("강아지과");
		this.kind = kind;
		this.name =	name;
	}
	public Dog(String superkind, String kind, String name) {
		super(superkind);
//		super.kind = superkind;        super(superkind)와 super.kind 둘 다 사용 가능하다.
		this.kind = kind;
		this.name = name;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void dogprint() {
		System.out.printf("[%s : %s : %s ] %n", super.kind, this.kind, this.name);
	}
	
	public String getSuperKind() {
		return super.kind;
	}
	
	@Override
	public void print() {
//		super.print();
//		System.out.printf("%s : %s %n", this.kind, this.name);
		this.dogprint();
	}
}
