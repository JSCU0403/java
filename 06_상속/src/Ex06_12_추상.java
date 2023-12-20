abstract class Shape{//미완성 메서드를 포함한 미완성 클래스 = 추상 클래스
	public Shape() {
		System.out.println("Shape 생성자");
	}
	
	public void make() { //정의
		System.out.println("도형 그리기");
	}
	
	public abstract void draw(); //미완성 메서드 = 추상 메서드
	public abstract void delete();
	
}//Shape

class Circle extends Shape{ //미완성까지 상속됨 해결법 1.abstract를 붙이기 2.자식클래스가 부모클래스의 추상메서드 완성시키기
	public Circle() {
		//super(); 생략되있음
		System.out.println("Circle 생성자");
	}
	public void draw() {
		System.out.println("원을 그린다");
	}
	public void delete() {
		System.out.println("원을 지운다");
	}
	
}//Circle

class Triangle extends Shape {
	public Triangle() {//Triangle의 생성자
		//super(); 숨겨져있음
		System.out.println("Triangle의 생성자");
	}
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
	public void delete() {
		System.out.println("삼각형을 지운다");
	}
}

public class Ex06_12_추상 {
	public static void main(String[] args) {
		//new Shape(); //미완성 클래스로는 객체를 만들수없다
		Shape c = new Circle(); //객체 생성시 생성자가 호출됨
		c.draw();
		c.delete();
		
		System.out.println("**********************************");
		
		Shape t = new Triangle();
		t.draw(); //오버라이딩
		t.delete();
		
		Shape [] arr = {new Circle(),new Triangle()};
		for(int i=0 ; i<arr.length;i++) {
			arr[i].draw();
			arr[i].delete();
		}
	}//main

}
