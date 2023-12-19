
public class Ex05_04_메서드 { //main메서드를 가진 클래스가 필요-(실행 클래스) 자바가상머신이 main메서드를 호출 - 항상 main부터 호출
	public static void main(String[] args) { //main 메서드 정의 - static을 붙여서 정의,아무것도 return하지 않는다=void
		
		int result = add(3,9); //result로 add 메서드 호출
		System.out.println("result : "+result);
		
		result = add(200,193); 
		System.out.println("result : "+result);
		
		result = add(123,456);
		System.out.println("result : "+result);
		
		System.out.println(add(100,200));
		System.out.println("------------------------");
		
		mul(2,3.9,7); //mul() 메서드 호출
		mul(4,9,10);
		Ex05_04_메서드 ex = new Ex05_04_메서드();
		ex.show();
	}
	//매개변수 : a,b -메서드 용어        static(멤버변수)            인스턴스변수
	static int add(int a, int b) { //add메서드 정의 int a=3 int b=9
		// add 메서드 호출(정의)		
		int sum = a + b;
		return sum; // void일때는 return 생략가능 - 호출한곳으로 int 값(sum)을 가지고 돌아간다.
		}//add 메서드 정의
	
	static void mul(int a, double b,int c) { //mul() 메서드 정의
		System.out.println("세 수의 곱 : "+ a*b*c); //return은 생략할수있음
	}

	//static void show() {
	void show() {
		System.out.println("show 메서드 정의 부분");
	}
}
