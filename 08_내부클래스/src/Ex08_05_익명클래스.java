class Car5 {
	int wheel;
	void Drive() {
		System.out.println("부릉 부릉");
	}
}

public class Ex08_05_익명클래스 {
	public static void main(String[] args) {
		
		Car5 c5 = new Car5();
		new Car5() {
			void Drive() {
				System.out.println("부릉");
			}
		}.Drive();
		
	}//main
}//Ex08_05
