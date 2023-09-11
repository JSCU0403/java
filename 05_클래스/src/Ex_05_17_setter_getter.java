import java.util.Scanner;

class Book2 {
	private String title; //private 사용 이유 : 안전하게 변수를 관리하기 위하여
	private String author;
	private int price;
	
	void setTitle(String title) {
		this.title = title; //매개변수 title에 title을 삽입
	}
	void setAuthor(String n) {
		author = n;
	}
	void setPrice(int n) {
		price = n;
	}
	
	public String getTitle() {
		return title; //return this.title;로도 사용가능
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice(){
		return price;
	}
	
}

public class Ex_05_17_setter_getter {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	Book2 bk2 = new Book2();
	
	System.out.print("제목 : ");
	String Title = sc.next();
	bk2.setTitle(Title);
	
	System.out.print("작가 : ");
	String Author = sc.next();
	bk2.setAuthor(Author); 
	
	System.out.print("가격 : ");
	int price= sc.nextInt();
	 bk2.setPrice(price);	
	
	System.out.println(bk2.getTitle());
	System.out.println(bk2.getAuthor());
	System.out.println(bk2.getPrice());
	
	}

}
