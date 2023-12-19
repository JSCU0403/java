class Book {
	String title;
	String author;
	int price;
	static String publisher; //static 클래스이름으로 접근가능 - 클래스변수
}

public class Ex05_02_클래스 {

	public static void main(String[] args) {
		
		Book e = new Book(); //new Book(); - 객체 생성
		
		e.title = "토지";
		e.author = "박";
		e.price = 5000;
		Book.publisher = "쌍용출판사"; //클래스이름으로 접근하면 객체를 만들기 전에도 변수를 사용할수있다.
		
		System.out.println(e.title);
		System.out.println(e.author);
		System.out.println(e.price);
		System.out.println(Book.publisher);
		
		System.out.println();
		
		Book bk1 = new Book();
		
		bk1.title = "국어";
		bk1.author = "김";
		bk1.price = 2000;
		Book.publisher = "쌍용출판사";
		
		System.out.println(bk1.title);
		System.out.println(bk1.author);
		System.out.println(bk1.price);
		System.out.println(bk1.publisher);
		
		
		
		
		
		
	}

}
