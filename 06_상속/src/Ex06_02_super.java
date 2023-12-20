class Parent{
	int x = 10;
	void method() {
		System.out.println("P_x : " + x);
	}
}

class Child extends Parent {
	int x = 20; //인스턴스변수
	void method() {
		int x = 30; //지역변수
		System.out.println("x = "+x); //지역변수 
		System.out.println("this.x = "+this.x); //child클래스 멤버(인스턴스)변수
		                                         //this사용시 없을경우 부모클래스의 x를 사용
		System.out.println("supe.x = "+super.x); //부모클래스의 변수
		super.method(); //이름이같은 부모클래스의 메서드 호출
	}
}

public class Ex06_02_super {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method();
		
		Child c = new Child();
		c.method(); //자식클래스의 method와 부모클래스의 method 같은이름이면 자식클래스가 우선
		
		
		
	}

}
