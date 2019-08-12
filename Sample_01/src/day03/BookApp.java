package day03;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("*******  명령 선택   ******** \n");
		System.out.println("1. insert(등록)");
		System.out.println("2. delete(삭제)");
		System.out.println("3. update(수정)");
		System.out.println("4. quit(종료)");
		System.out.println("수행할 명령을 선택하세요!");
		System.out.println("1 2 3 4 중 하나를 선택하세요..");

		int a = Integer.parseInt(input.nextLine());
		
		do {
			System.out.println("*******  명령 선택   ******** \n");
			if( a == 4) {
				break;
			}
			else if( a == 1) { 
				System.out.println("등록 작업을 수행합니다.");
			}
			else if( a == 2) { 
				System.out.println("삭제 작업을 수행합니다.");
			}
			else if( a == 3) { 
				System.out.println("수정 작업을 수행합니다.");
			}
			else
				System.out.println("1~4 중에서 다시 선택하여 주세요.");
			
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. update(수정)");
			System.out.println("4. quit(종료)");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.println("1 2 3 4 중 하나를 선택하세요..");


			a = Integer.parseInt(input.nextLine());
		}while(a != 4);
		System.out.println("시스템을 종료합니다.");
		
		input.close();
		input = null;
		
		return;
	}

}
