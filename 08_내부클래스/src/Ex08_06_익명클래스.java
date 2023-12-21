interface RemoteControl{
	void turnon();
	void turnoff();
}//RemoteControll

class TV implements RemoteControl{

	public void turnon() {
		System.out.println("TV를 켠다");
	}

	public void turnoff() {
		System.out.println("TV를 끈다");
	}
}

public class Ex08_06_익명클래스 {
	public static void main(String[] args) {
		
		TV t = new TV();
		t.turnoff();
		t.turnon();
		System.out.println();
		
		RemoteControl rc = new RemoteControl() {
			public void turnon() {
				System.out.println("TV를 켠다");
			}

			public void turnoff() {
				System.out.println("TV를 끈다");
			}
		};

		rc.turnon();
		rc.turnoff();//인터페이스 RemoteControl로 클래스를 만들지않고 미완성메서드 완성후 호출
	}//main
}//익명클래스

/*
interface
실제 구현된것이 없는 기본 설계도 , 추상메서드랑 상수만 멤버로 가질수있음
모든 메서드는 public abstract 자동으로 삽입되어있음
다중상속이 가능
implements를 사용해서 상속받는다
순서 - extends 클래스명 implements 인터페이스명
미리정해진규칙에 맞게 구현하도록 표준제시
모든 멤버변수는 static final이 자동으로 붙어있어서 변수 변경이 안됨
생성자 정의불가능
*/