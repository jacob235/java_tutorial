package day03;

public class test05 {

	public static void main(String[] args) {
		
		int i;
		for(i = 1; i < 9; i++) {
			System.out.printf("Hello java %d %n", i);
		}
		
		int j = 10;
		while(j > 0) {
			System.out.println("while" + j);
			j--;
		}
		boolean flag = true;
		while(flag) {
			j++;
			System.out.println("~~~~~~~~~");
			if(j==5) flag = !flag;
		}
		
		System.out.println("j : " + j);
		
		while(j<5) {
			System.out.println("do while"); // 동작 X
		}
		
		do {
			System.out.println("do while"); // 동작 O			
		}while(j<5);

	}

}
