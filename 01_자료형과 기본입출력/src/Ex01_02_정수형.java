
public class Ex01_02_정수형 {

	public static void main(String[] args) {

		// {type} 자료형 정수 
		// byte 1byte 2의 8승 
		// short 2byte  
		// int 4byte
		// long 8byte

		//		int a; // 선언
		//	    int b;

		int a,b; //선언
		//		int a,b=10; //선언과 동시에 초기화

		a=11; //초기화
		b=25;
		System.out.println(a+b);
		System.out.println("a+b");

		int b1 = 10 ;
		int b2 = 20 ;
		int b3 = 0 ;
		//	    System.out.println(b1);
		//	    System.out.println(b2);
		//	    b3 = (byte) (b1+b2); //byte+byte short char는 연산될경우 int형(4 byte)으로 자동 형변환된다.
		//	    System.out.println(b3);
		//	    System.out.println(b1+b2);

		//byte a; duplicate(중복 이름변경)
		//byte 2a; (첫번째 문자는 언더바나 영어로 시작 숫자x / 대소문자 구별)

		int c=1000000; //백만
		int d=2000000; //이백만
		//long result = c*d; 2조 >int에서 담을수없어서 이상한값 출력
		long result = (long)c * d ; //(long)임시로 자료형 변경하여 제로된 값 가능 : casting 강제적 형변환
		System.out.println(result);
		//"" 문자열
		//+ 연속해라 더하기x

		System.out.println("b1+b2 :" + b1+b2); //syso +컨트롤+스페이스바 = System.out.println(); 
		System.out.println("b3 :" + b3);  
		System.out.println("b2 :" + b2); 
		//System.out.println(w); //we cannot be resolved to a variable = 미선언후 w변수 사용시 발생에러  

		long k = 100000000000L; //int의 범위를 벗어나면 인식하지 못하여 뒤에 L,l을 붙여 long으로 인식시켜주기


		//컨트롤+알트+방향키 방향으로 복사
	}

}
