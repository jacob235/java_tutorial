package day08;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		BookMgr bmr = new BookMgr(5);

		bmr.addBook(new Book("Java Program", 30000));
		bmr.addBook(new Book("JSP Program", 15500));
		bmr.addBook(new Book("SQL Fundamentals", 18900));
		bmr.addBook(new Book("JDBC Program", 25000));
		bmr.addBook(new Book("EJB Program", 50000));
		bmr.addBook(new Book("Spring", 39000));
				
//		System.out.println(Arrays.toString(bmr.getBooklist()));
			
		System.out.println("======책목록=======");
		bmr.printBookList();

		
		System.out.println("===책 가격의 총합===");
		System.out.printf("전체 책 가격의 합 : %d", bmr.printTotalPrice());
	}

}
