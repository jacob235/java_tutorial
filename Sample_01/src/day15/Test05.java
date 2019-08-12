package day15;

import javax.swing.JOptionPane;

public class Test05 {

	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.list 2.update 3. delete 4. insert q.quit");
		
		// 익명 클래스 : Command라는 인터페이스를 implements한 익명의 클래스를 뜻한다. Command 객체를 메모리를 할당한다.
		
		
		//람다 => 변수에 함수를 등록하여 사용하는 기능
		Command list = () -> System.out.println("*** List ***");	
			
		Command update = () -> System.out.println("*** update ***");
		
		Command delete = () -> {
									System.out.println("*** delete ***");
								};
		
		Command insert = () -> System.out.println("*** insert ***");
		
		switch (msg) {
		case "1":
			list.exec();
			break;
		case "2":
			update.exec();
			break;
		case "3":
			delete.exec();
			break;
		case "4":
			insert.exec();
			break;
		case "q":
			break;

		default:
			break;
		}
	}

}
