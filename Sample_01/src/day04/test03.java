package day04;

public class test03 {

	public static void main(String[] args) {
		
		OUT: for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++){
				if(j == 5) break OUT;
				System.out.printf("%d*%d= %2d  | ", j, i, i*j);
			}
			System.out.println();
		}
	
	}

}
