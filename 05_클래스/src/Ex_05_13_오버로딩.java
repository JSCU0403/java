
public class Ex_05_13_오버로딩 {

	public static void main(String[] args) {

		star();
		star(7);
		star(3.7);
	}

	static void star() { //오버로딩 : 하나의 메서드 이름으로 여러개의 메서드를 만들수있게해주는 기법(다중정의)

		System.out.println("*****");

	}

	static void star(int n) { //매개변수가 다르면 중복으로 보지않는다.
		int i;
		for(i=0;i<n;i++) {
		System.out.print("*");
		}
		System.out.println();
	}
	static int star(double n) {
		return 0;
	}

}

/*
 오버로딩의 조건
 같아야 한다 - 메서드 이름 / 
 달라야 한다 - 자료타입 / 매개변수의 갯수
 리턴타입은 같은지 다른지 중요하지않음
 */
