class Fruit{
	void apple() {
		System.out.println("apple");
	}
	static void banana() {
		System.out.println("banana");
	}
}//Fruit


public class Ex05_06_메서드 {

	public static void main(String[] args) {
		//4가지 호출 여러가지 방식

		Fruit ft = new Fruit();
		ft.apple();
		
		Fruit.banana();
		ft.banana();
		
		Ex05_06_메서드 ft2 = new Ex05_06_메서드();
		ft2.orange();

		Ex05_06_메서드.melon();
		ft2.melon();
		melon();


	} //main
	void orange() {
		System.out.println("orange");
	}
	static void melon() {
		System.out.println("melon");
	}
}//Ex05_06 클래스
