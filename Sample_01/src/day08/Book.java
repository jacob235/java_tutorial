package day08;

public class Book {			// Book(title, price) 타입 선언
	private String title;
	private int price;
	
	public Book(String title, int price) {			// Book 생성자
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {		// title 출력
		return title;
	}

	public void setTitle(String title) {		// title 입력
		this.title = title;
	}

	public int getPrice() {		// price 출력
		return price;
	}

	public void setPrice(int price) {		// price 입력
		this.price = price;
	}
	public void print() {
		System.out.printf("Book[%-10s : %7d] %n", title, price);
	}
}
	

