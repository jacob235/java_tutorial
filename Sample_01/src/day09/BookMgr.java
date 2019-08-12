package day09;

import java.util.Scanner;

public class BookMgr {
	private Book[] booklist;			//  Book 타입의 배열 booklist 선언
	private int count = 0;
	
	public BookMgr() {
		this(10);
	}
	public BookMgr(int size){
		booklist = new Book[size];
	}
	public void addBook(Book book){		// book 데이터를 booklist 배열에 등록
		if(count == booklist.length) {		// 배열 꽉 찼으므로 리사이징을 해준다.
			Book[] copy = new Book[booklist.length*2];		// 배열 복사본을 만들고 배열 크기를 기존의 2배로 만들어준다.
			System.arraycopy(booklist, 0, copy, 0, booklist.length);		// arraycopy로 카피본에 데이터를 복사한다.
			booklist = copy;
		}
		booklist[count] = book;
		count++;
	}
	
//	public Book[] getBooklist() {		제공안함.
//		return booklist;
//	}
	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBookList() {		// booklist 배열에 있는 book 책제목 출력
		System.out.println("==================Book List==================");
		for(int i = 0; i < count; i++) {
			booklist[i].print();			
		}
		System.out.println("총 " + count + " 권");
		System.out.println("=============================================");
	}
	
	public int printTotalPrice() {
		int total = 0;
		for(int i = 0; i < count; i++) {
			total += booklist[i].getPrice();
		}
		return total;
	}
	public void searchBookList(String title) {		// booklist 배열에 있는 book 책제목 검색하여 출력
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("찾으실 책 제목을 입력하세요 : ");
//		String searchTitle = scanner.nextLine();
//		System.out.println("==================찾으신 책목록==================");
		for(int i = 0; i < count; i++) {
			if(booklist[i].getTitle().toUpperCase().contains(title.toUpperCase().trim())) {
				booklist[i].print();
			}
		}
	}
	public void deleteBook(String title) {
//		for(int i = 0; i < booklist.length; i++) {
//			if(booklist[i] != null && booklist[i].getTitle().equals(title)) {
//				for(int j = i; j < count-1; j++) {
//					if(i == booklist.length-1) {
//						booklist[i] = null;						
//					}
//					booklist[j] = booklist[j+1];
//				}
//				count--;
//			}
//			
//		}
		for(int i = 0; i < count; i++) {
			if(booklist[i].getTitle().equals(title)) {
				System.arraycopy(booklist, i+1, booklist, i, count-i-1);
				count--;
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		System.out.println("삭제할 도서가 없습니다.");
	}

}
