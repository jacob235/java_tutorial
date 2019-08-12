package day14.tv;

interface TV {		// TV 종류 상관 없이 서로 호환해주기 위해 인터페이스를 사용한다.
	public void poweron();
	public void poweroff();
}
class STV implements TV{
	public void poweron() {
		System.out.println("STV Power on");
	}
	public void poweroff() {
		System.out.println("STV Power off");
	}
}

class LTV implements TV{
	public void poweron() {
		System.out.println("LTV on");
	}
	public void poweroff() {
		System.out.println("LTV off");
	}
}

class ITV implements TV{
	@Override
	public void poweron() {
		
	}
	@Override
	public void poweroff() {
		
	}
	
	
}
