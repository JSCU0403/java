
public class Ex01_04_실수형 {

	public static void main(String[] args) {

		float a; //4byte
		a = 1.1f; // (실수는 기본 8byte double) 1.1로 인식 > 숫자 뒤에 F,f를 붙여 float으로 인식시키기
		
		double b; //8byte
		b = 2.2; //double은 D,d를 붙여도 되지만 실수는 기본적으로 double로 인식하기때문에 안붙여도 된다
		
		System.out.println("a="+a); //f를 붙였지만 출력단에서는 f가 출력되지않음
		System.out.println("b="+b);
		
		
		float f1 = 0.0012300f; //유효숫자 뒤의 00은 미출력
		System.out.println("f1="+f1);
		
		float f2 = 1.123456789f; //소숫점 7번째자리까지 표시 8번쨰 자리가 5이상인경우 반올림하여 7번째자리에 반영
		System.out.println("f2="+f2);
		

		float f3 = 1.123456749f; //소숫점 7번째자리까지 표시 8번쨰 자리가 5이상인경우 반올림하여 7번째자리에 반영
		System.out.println("f3="+f3);
		
		float f4 = 123; //4byte인 int를 실수 float에 대입할경우 실수형태로 123.0으로 표시
		System.out.println("f4="+f4);
		
		int i1 = (int)1.23f; // float이 int보다 큰 개념이기때문에 float에서 int로 자료형 타입변경시 실수 소숫점 버리고 정수 1만 가져옴 
		System.out.println("i1="+i1);
		
		double d1 =  .123E4; //0 생략가능 0.123*10^4
		System.out.println("d1="+d1);
	
		double d2 =  .123E-2; //숫자가 길어지면 E-~ 식으로 출력 
		System.out.println("d2="+d2);
	}

}
