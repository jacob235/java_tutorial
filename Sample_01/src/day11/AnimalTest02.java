package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest02 {

	public static void main(String[] args) {
		Animal[] animals = { 
			new Dog("진돗개", "누렁이"), 
			new Fish("구피"), 
			new Dog("시베리안허스키", "케리")
		};
		
//		for(Animal data : animals) {
//			data.breath();		// 오버라이딩 활용
//			data.print();		// 오버라이딩 활용
//		}
		Dog a1 = new Dog("진돗개", "쫑이");
		Fish f1 = new Fish("구피");
		callD(animals[0]);
		callD(animals[1]);		// 메소드는 하나인지만 동작하는 형태는 다양한 것(다향성), 오버라이딩 적용, 오버로딩 적용, 상속 적용
		
		for(Animal data : animals) {
			callD(data);
		}
		
		
	}
	
	public static void callD(Animal d){
		d.breath();		// 오버라이딩된 메소드가 실행되고 있다.
	}

}
