package day10;

public class Animal_Test01 {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.breath();
		Animal a2 = new Animal("Dog");
		a2.breath();
//		Animal a3 = new Animal("Cat");
//		a3.breath();
		
		Dog d1 = new Dog("강아지","시베리안 허스키", "까미");
		d1.breath();
		d1.dogprint();
		Dog d2 = new Dog("개", "진돗개", "누렁이");
		d2.dogprint();
		
		String animalKind = d2.getSuperKind();		// static 영역에서는 this, super 키워드 사용 불가능
		System.out.println(animalKind);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	}

	
	
}
