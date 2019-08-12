package day13;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}
}

class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() { // Singleton class 안에서만 생성 가능하다.
		System.out.println("Singleton() 객체 생성");
	}
	
	public static Singleton getInstance() {
		if(s == null) s = new Singleton();
		return s;
	}
}