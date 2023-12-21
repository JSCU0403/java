class Sub1{
	int x = 5;
	void display() {
		System.out.println("Sub1 x :"+x);
	}
}//Sub1
class Sub2 extends Sub1{
	void display() {
		System.out.println("Sub2 x*x :"+x*x);
	}
}//Sub2

public class Ex08_04_익명클래스 {
	public static void main(String[] args) {

		Sub1 s1 = new Sub1();
		s1.display();
		Sub2 s2 = new Sub2();
		s2.display();

		new Sub1() {
			void display() {
				System.out.println("Sub3 x :"+ x*x*x);
			}//display
		}.display();//new sub1() 객체를 만드는도중 메서드 오버라이딩을하고 display를 호출
		

	}//main
}//Ex08_04



