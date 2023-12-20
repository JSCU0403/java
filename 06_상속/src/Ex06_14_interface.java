interface Copymachine{ //실제 구현된것이 없는 기본 설계도 , 추상메서드랑 상수만 멤버로 가질수있음
	void copy(); //모든 메서드는 public abstract 자동으로 삽입되어있음
	int age = 30; //모든 멤버변수는 static final이 자동으로 붙어있어서 변수 변경이 안됨
	}

interface Printmachine{
	public void print();
}

interface Faxmachine{
	public void fax();
}

class AA{
	
}
class Compound extends AA implements Copymachine,Printmachine,Faxmachine{

	@Override
	public void copy() {
		System.out.println("복사한다.");
	}
	
	public void fax() {
		System.out.println("팩스보낸다");
	}
	
	public void print() {
		System.out.println("프린트한다.");
	}
}
public class Ex06_14_interface {
	public static void main(String[] args) {

		//new Copymachine(); - 미완성이라 사용불가
		
		Compound c = new Compound();
		c.copy();
		c.fax();
		c.print();
		System.out.println(c.age);
		System.out.println(Copymachine.age); //static변수처럼 접근 클래스이름.변수
		System.out.println();
		
		Faxmachine c2 = new Compound();
		//c2.copy(); 부모클래스가 가지지않은 변수는 사용할수없다
		//c2.print();
		c2.fax();
		
	}//main

}

/*
interface
실제 구현된것이 없는 기본 설계도 , 추상메서드랑 상수만 멤버로 가질수있음
모든 메서드는 public abstract 자동으로 삽입되어있음
다중상속이 가능
순서 - extends 클래스명 implements 인터페이스명
미리정해진규칙에 맞게 구현하도록 표준제시
모든 멤버변수는 static final이 자동으로 붙어있어서 변수 변경이 안됨
생성자 정의불가능

추상클래스
추상메서드만,정의된 메서드도 있을수있다.
생성자 정의가능
*/