package day14;

import javax.swing.JOptionPane;

public class CommandTest {

	public static void main(String[] args) {	// 다형성 : 한 메소드에 들어오는 값에 따라 상황에 따라 여라가지 실행이 가능하게 한다.
		Command cmd = null;
		
		String key = JOptionPane.showInputDialog("list / delete / insert / update 중 하나 입력");
		switch(key) {
		case "list":
			cmd = new ListCommand();
			break;
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "insert":
			cmd = new InsertCommand();
			break;
		case "update":
			cmd = new UpdateCommand();
			break;
		default:
			break;
		}
		
		cmd.exec();
		cmd.check();

	}

}
