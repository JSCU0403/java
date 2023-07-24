class Count{
	static int a; //static 변수
	int b; //instatnce 변수
	//멤버변수 기본값 정리하기
	void increment() {
		int c=0; //지역변수 초기화가 자동으로 되지않음
		a++;
		b++;
		c++;
		System.out.println("static 변수 a : "+a);
		System.out.println("instance 변수 b : "+b);
		System.out.println("지역 변수 c : "+c);
		System.out.println();
	}
}

public class Ex05_09_변수 {

	public static void main(String[] args) {
		/*
		 멤버변수 : 정적변수/static 변수/class(클래스변수) > 기본값 0 
		          생성시점 > 클래스의 이름이 언급되는 시점
		          소멸시점 > main메서드 끝나고(프로그램종료시)  소멸
		          
		          인스턴스 > 기본값 0
		          생성시점 > 객체가 생성되면 생성
		          소멸시점 > main메서드 끝나고(프로그램종료시)  소멸
		 
		 매개변수 : 넘어오는 변수
		          지역변수의 특징을 가진다
		          사용범위 > 변수가 선언된 {} 안에서만 사용가능

		 참조변수
		 
		 지역변수 : 메서드 안에 선언한 변수 > 기본값 x
		          생성시점 > 해당 {} 안으로 들어왔을때 생성
		          소멸시점 > 해당 {} 을 벗어났을때 소멸
		          사용범위 > 변수가 선언된 {} 안에서만 사용가능
		 제귀호출 : 메서드안에서 자기자신을 반복으로 호출 - for문보다 성능이 나쁨
		 */

		Count cnt1 = new Count();
//		System.out.println(cnt1.a); //인스턴스 초기화를 안해도 자료형에 따라 자동으로 초기화된다 *참조형=null boolean=false 
//		System.out.println(cnt1.b);
		cnt1.increment();
		cnt1.increment();
		
		
		Count cnt2 = new Count();
		cnt2.increment();
		cnt2.increment();
		
		Count cnt3 = new Count();
		cnt3.increment();
		cnt3.increment();

	}

}
