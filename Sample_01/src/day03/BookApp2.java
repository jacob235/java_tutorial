package day03;

import java.util.Scanner;

public class BookApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int button;
		
		do {
			String work = " ";
			System.out.println("**********  명령 선택   ************");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. update(수정)");
			System.out.println("4. quit(종료)");
			System.out.println("********************************");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.println("1 2 3 4 중 하나를 선택하세요.");
			button = Integer.parseInt(input.nextLine());
			
			switch (button) {
			case 1:
				work = "등록";
				break;
			case 2:
				work = "삭제";
				break;
			case 3:
				work = "수정";
				break;
			case 4:
				break;
			default:
				break;
			}
			if(button == 1 || button == 2 || button == 3) {
				System.out.println(work + " 작업을 수행합니다.");
			}
			else
				System.out.println("1~4 중에서만 입력해주세요.");
		}while(button != 4);
		System.out.println("종료합니다.");
	}

}
