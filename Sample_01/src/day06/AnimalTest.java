package day06;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.setAge(3);
		animal1.setLive(true);
		animal1.setName("큰뿔소");
		
//		animal1.display();
		
		Animal animal2 = new Animal();
		animal2.setAge(5);
		animal2.setName("펭귄");
		animal2.setLive(true);
		
		Animal a = new Animal();
		a.setAge(12);		// 인스턴스 메서드 (반드시 주소가 있어야만 동작한다)
		a.setName("심바");		// 인스턴스 메서드 (반드시 주소가 있어야만 동작한다)
		a.print();		// 인스턴스 메서드 (반드시 주소가 있어야만 동작한다)
		
//		animal2.display();
		
		Animal[] animal = {animal1, animal2};
		
		double sum = 0;
		int count = 0;
		for(Animal data : animal) {
			if(data.isLive()) {				
				sum += data.getAge();
				count++;
			}
		}
		System.out.println(sum/count);
	}

}
