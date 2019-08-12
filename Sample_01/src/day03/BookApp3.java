package day03;

import java.util.Scanner;

public class BookApp3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cmd = null;

		while(true) {
			
			System.out.println("**********  명령 선택   ************");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. update(수정)");
			System.out.println("4. quit(종료)");
			System.out.println("********************************");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.println("1 2 3 4 중 하나를 선택하세요.");
			
			cmd = scanner.nextLine();  // nextInt()로 했을때 항상 nextLine()을 써줘야 한다. 입력 엔터가 남아있기때문에.
			
			switch (cmd.trim()) {
			case "1":
				System.out.println("등록 작업을 수행하는 기능 호출");
				break;
			case "2":
				System.out.println("삭제 작업을 수행하는 기능 호출");
				break;
			case "3":
				System.out.println("수정 작업을 수행하는 기능 호출");
				break;
			case "4": // 종료한다.
				System.out.println("App을 정말로 종료하시겠습니까? Y/N ");
				String mode = null;
				mode = scanner.nextLine().trim();
				if(mode.equals("n") || mode.equals("N"))
					break;
				else if(mode.equals("y") || mode.equals("Y")) {
					System.out.println("App 종료");
					scanner.close();
					scanner = null;
					return;   // 현재의 함수 종료 의미
					// System.exit(0); // App 종료
				}
			default:
				System.out.println("다시 입력하세요.");
				break;
			}
			
			System.out.println("======================================");
		}

	}

}
