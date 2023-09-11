class Exam{
	static int max (int x,int y) {
		if(x>y)
			return x;
		else
			return y;
	}
}
public class Ex_05_15_Math {

	public static void main(String[] args) {

		int a=30,b=40,c;
		//c = Exam.max(a,b);
		c = Exam.max(a,b);
		Math.max(a, b); //기본적으로 존재하는 클래스의 메서드 사용
		System.out.println("큰 값 : " + c);
		
		System.out.println(Math.abs(-3.2));
		System.out.println(Math.abs(-12));
	
	System.out.println(Math.PI);
	
	}

}
