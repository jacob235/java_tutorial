package day14.tv;

public class TVtest {

	public static void main(String[] args) {		// java 다형성 이용		// 로우 커플링
//		TV user = new STV();		// TV라는 부모클래스로 데이터 타입으로 변수를 선언한면  STV,LTV 모든 종류의 객체를 만들 수 있다.
//		user.poweron();
//		user.poweroff();
		
//		user = new LTV();
//		user.poweron();
//		user.poweroff();
		
		
//		user = new ITV();
//		user.poweron();
//		user.poweroff();
		
		
		
		play(new STV());
		play(new LTV());
		play(new ITV());
	}
	
	public static void play(TV tv) {		// 로우 커플링
		tv.poweron();
		tv.poweroff();
	}

}
