
public class Ex05_03_메서드 {

	public static void main(String[] args) {
		
		System.out.println("main 메서드 정의 시작"); //항상 main메서드가 제일 먼저 실행된다
		display(); //메서드 호출
		System.out.println("******************");
		display();
		System.out.println("##################");
		display();
		System.out.println("main 메서드 정의 끝");
		//Display(); //undefined 정의되지 않은	
		
	} //main
	                        // display() 메서드 정의
	static void display(){  // static + 리턴타입 + 메서드이름(타입 변수명) { }
		System.out.println("자바 공부중");
		System.out.println("클래스 부분 공부중");
		System.out.println("너무 재미있음");
		return; //호출한곳으로 돌아간다 생략가능
		
	}

}
