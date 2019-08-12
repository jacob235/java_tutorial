package day09;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(10);
		Scanner scanner = new Scanner(System.in);
		String cmd = null;

		while(true) {
			
			System.out.println("**********  명령 선택   ************");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. Search(검색)");
			System.out.println("4. 목록 출력");
			System.out.println("5. quit(종료)");
			System.out.println("********************************");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print("1 2 3 4 5중 하나를 선택하세요.. _");
			
			cmd = scanner.nextLine();  // nextInt()로 했을때 항상 nextLine()을 써줘야 한다. 입력 엔터가 남아있기때문에.
			
			switch (cmd.trim()) {
			case "1":
				System.out.println("등록 작업을 수행하는 기능 호출");
				System.out.print("책 제목을 입력하세요 : ");
				String title = scanner.nextLine();
				System.out.print("책 가격을 입력하세요 :");
				int price = scanner.nextInt();
				scanner.nextLine();				// 남아있는 엔터키까지 없애줘야 에러가 발생하지 않는다.
				mgr.addBook(new Book(title, price));
				break;
			case "2":
				System.out.println("삭제 작업을 수행하는 기능 호출");
				System.out.print("책 제목을 입력하세요 : ");
				String deleteTitle = scanner.nextLine();
				mgr.deleteBook(deleteTitle);
				break;
			case "3":
				System.out.println("검색 작업을 수행하는 기능 호출");
				System.out.print("찾으실 책 제목을 입력하세요 : ");
				String searchTitle = scanner.nextLine().trim();
				System.out.println("===============찾으신 책목록===============");
				mgr.searchBookList(searchTitle);
				break;
			case "4":
				System.out.println("목록 출력 작업을 수행하는 기능 호출");
				mgr.printBookList();
				
				break;
			case "5": // 종료한다.
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
