package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		Animal d = new Dog("진돗개", "누렁이");
		if(d instanceof Dog) ((Dog)d).dogprint();
		d.breath();
		
		Dog dd = (Dog) d;
		if(d instanceof Fish) {
			Fish ff = (Fish) d;			
		}
		
		Animal f = new Fish("구피");
		if(f instanceof Fish) ((Fish)f).fishPrint();
		f.breath();		// 오버라이딩 적용됨.
		((Fish)f).breath();
		
	}
}
