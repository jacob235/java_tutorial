package day14;

public interface Command {
	public void exec();
	default public void check() {		// default 메소드는 추상도 인스턴스도 아니고 static 과 비슷하게 구동된다.
		System.out.println("Command check() 함수");
	}		
}

class DeleteCommand implements Command{

	@Override
	public void exec() {
		System.out.println("Delete 수행");
	}
	public void check() {
		System.out.println("DeleteCommand check() 함수");
	}
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Insert(등록) 수행");
	}
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Update(수정) 수행");		
	}
}
class ListCommand implements Command{
	@Override
	public void exec() {
		System.out.println("List(등록) 수행");
	}
	
}


