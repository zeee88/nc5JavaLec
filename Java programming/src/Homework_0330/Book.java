package Homework_0330;

public class Book {

	public String title;
	public String writer;
	public String publisher;
	public int price;
	
	
	public void bookInfo(String title, String writer, String publisher, int price) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
	}
	
	public void bookPrint() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + writer);
		System.out.println("출판사: " + publisher);
		System.out.println("가격: " + price);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book();
		
		book.title = "자바의 정석";
		book.writer = "남궁성";
		book.publisher = "도우출판";
		book.price = 40000;
		
		book.bookPrint();
				
		
		
	}
	
	
}
