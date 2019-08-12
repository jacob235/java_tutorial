package day03;

import java.util.Scanner;

public class BookApp1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button;
		String work = null;
		
		do {
			System.out.println("*******  명령 선택   *******");
			System.out.println("1. insert(등록)\n");
			System.out.println("2. delete(삭제)\n");
			System.out.println("3. update(수정)\n");
			System.out.println("4. quit(종료)\n");
			System.out.println("*************************\n");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print("1 2 3 4 중 하나를 선택하세요.. _");
			button = sc.nextInt();
			
			switch(button) {
				case 1:
					work ="등록";
					break;
				case 2:
					work ="삭제";
					break;
				case 3:
					work ="수정";
					break;
				case 4:
					break;
				default :
					break;
			}
			
			if( button == 1 || button == 2 || button == 3) {
				System.out.printf("%s 작업을 수행합니다.%n",work);
			}
		} while(button != 4);
	}
}
