
public class Ex02_04_관계논리연산자 {

	public static void main(String[] args) {
		
		int a=11, b=20;
		
		boolean c = a<b;    // (관계연산자) < > <= >= == !=
		System.out.println("c:"+c);
		System.out.println("c:"+(a<b));
		System.out.println("c:"+(a>b));
		System.out.println(a==b); //==(같은지 판단) !=(not:같지않은지 판단)
		
		c = a>10 && b>10;  //&&(논리and) 양쪽이 모두 참(true)일때 결과는 참(true) 하나라도 거짓(false)일때 거짓(f) 
		System.out.println("c:"+c);
		c = a>100 && b>10;
		System.out.println("c:"+c);
		 
		c = a>100 || b>10; //||(논리or) 한쪽이라도 참(true)일때 결과는 참(true) 모두 거짓일때 (f)
		System.out.println("c:"+c);
		c = a>20 || b>20;  //모두 거짓이므로 f
		System.out.println("c:"+c);
		
		c = !(a>100); //!(not) 거짓을 참으로 / 참을 거짓으로 바꿔주는 연산자
		System.out.println("c:"+c);
	}

}
