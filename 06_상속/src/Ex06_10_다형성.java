class Car{
	String color="white";
	int door=4;

	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop!!");
	}

}//Car

class FireEngine extends Car{
	int door = 6;
	int wheel = 10;

	void drive() {
		System.out.println("FEdrive~");
	}
	void water() {
		System.out.println("water!!");
	}
}//FireEngine

public class Ex06_10_다형성 {
	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.door);
		c.drive();
		c.stop();
		System.out.println("--------------");

		FireEngine fe = new FireEngine();
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		fe.drive();
		fe.water();
		fe.stop();
		System.out.println("--------------");

		c = fe; // 업캐스팅 자식>부모 (다형성)
		System.out.println(c.door); //4
		//System.out.println(c.wheel); 사용x
		System.out.println(c.color); //white
		c.drive(); //자식클래스의 drive메서드
		c.stop(); //stop
		//c.water(); 에러
		FireEngine fe2;
		System.out.println("***********************");
		
		if(c instanceof FireEngine) { //연산자 instanceof c변수를 FireEngine타입으로 변경 가능한지 물어보는 연산자
			System.out.println("다운캐스팅 가능");
			fe2 =(FireEngine) c; //다운캐스팅 부모->자식 자동x
			System.out.println(fe2.door);
			System.out.println(fe2.wheel);
			System.out.println(fe2.color);
			fe2.drive();
			fe2.water();
			fe2.stop();
		}
		else {
			System.out.println("다운캐스팅 불가능");
		}
		
		System.out.println("***********************");
		
		
	}

}
