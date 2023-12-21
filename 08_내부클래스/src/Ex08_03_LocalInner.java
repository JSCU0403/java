
class Car4 {
	int wheel;
	void Drive() {
		System.out.println("부릉 부릉");
	}
}

public class Ex08_03_LocalInner {
	public static void main(String[] args) {
		
		class Truck extends Car4 {//지역변수처럼 사용하는 지역클래스
			void Drive() {
				final int door=4;
				System.out.println("우당탕 쿵탕");
				System.out.println("wheel:"+wheel);
			}

		} // Truck 클래스의 끝

		Truck porter = new Truck();
		porter.wheel = 8;
		System.out.println("wheel:"+porter.wheel);
		porter.Drive(); // 우당탕 쿵탕
	}//main
	
}

