// 다중상속 3개클래스 멤버변수 클래스당 최소2개 이상 super()반드시 사용 모든 멤버변수는 private, 
class Food {
	private String name; // 음식 이름
	private String flavor; // 맛 - 달다 짜다

	public Food(String name, String flavor) {
		this.name = name;
		this.flavor = flavor; 
	}

	public void display() {
		System.out.println("음식 이름 : " + name);
		System.out.println("맛 : " + flavor);
	}
}//Food

class Dessert extends Food {
	private String state; //상태 - 고체 액체 기체
	private int price; //가격

	public Dessert(String name, String flavor, String state, int price) {
		super(name, flavor);
		this.state = state;
		this.price = price;
	}

	public void display() {
		super.display();
		System.out.println("상태(고체액체기체) : " + state);
		System.out.println("가격 : " + price + "원");
	}

} //Dessert

class Macaron extends Dessert {
	private String taste; // 맛의종류 민트 딸기
	private boolean ddung; //뚱카롱인가

	public Macaron (String name, String flavor, String state, int price, String taste, boolean ddung) {
		super(name, flavor,state,price);
		this.taste = taste;
		this.ddung = ddung;
	}

	public void display() {
		super.display();
		System.out.println("맛의 종류 :" + taste);
		System.out.println("뚱카롱인가 : " + ddung);
	}
}//Macaron

public class Ex06_08_김준수 {
	public static void main(String[] args) {

		Food f = new Food("김밥","다채롭다");
		f.display();
		System.out.println("--------------------------------");

		Dessert d = new Dessert("아메리카노","쓰다","액체",3000);
		d.display();
		System.out.println("--------------------------------");

		Macaron m = new Macaron("뚱카롱","달다","고체",1000,"딸기맛",true);
		m.display();



	}

}
