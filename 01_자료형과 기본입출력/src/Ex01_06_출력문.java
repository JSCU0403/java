
public class Ex01_06_출력문 {

	public static void main(String[] args) {  //main 컨트롤+스페이스바 엔터
		
		int a = 123;
		char b ='A';
		float c = 98.765f;
		String d = "아이유"; //문장은 String 사용 큰따옴표
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println();
		
		//정수출력(%d)     %n번쨰 자리까지
		//문자출력(%c)     %n번쨰 자리까지
		//실수출력(%f)     %m.nf 전체 m자리 소수점은 n자리까지(점포함)
		//문자열출력(%s)
		
		System.out.printf("a=%d\n",a); //a= + %d(정수출력) 쉼표 다음 정수를 출력 + \n(줄고침=엔터)
		System.out.printf("a=%5d\n",a); //a= + %5d(5자리를 잡고 정수출력) 쉼표 다음 정수를 출력 + \n(줄고침=엔터)
		System.out.printf("b=%c\n",b); //b= + %c(문자출력) 쉼표 다음 문자를 출력 + \n(줄고침=엔터)
		System.out.printf("b="
				+ "%3c\n",b); //b= + %c(3자리를 잡고 문자출력) 쉼표 다음 문자를 출력 + \n(줄고침=엔터)
		System.out.printf("b=%d\n",(int)b); //b= + %d(정수출력) 쉼표 다음 정수를 출력 + \n(줄고침=엔터)
		System.out.printf("c=%f\n",(float)c); //c= + %f(실수출력) 쉼표 다음 문자를 출력 + \n(줄고침=엔터) 실수는 오차가 생김
		System.out.printf("c=%.2f\n",(float)c); //c= + %f(소수점 이하 2자리까지 실수출력) 쉼표 다음 문자를 출력 + \n(줄고침=엔터) 실수는 오차가 생김
		System.out.printf("c=%10.2f\n",(float)c); //c= + %f(소수포함 전체 10자리 ,소수점 이하 2자리까지 실수출력) 쉼표 다음 문자를 출력 + \n(줄고침=엔터) 실수는 오차가 생김
		System.out.printf("d=%s\n",d); // d= + %s(문자열출력)
		System.out.printf("d=%5s\n",d); // d = + %5s(5자리 문자열 출력)
		
		System.out.println("안녕\\하세요\t\t 저의 이름은\n\n \"ㅇㅇㅇ\" 입니다"); // \\=\출력  탭 한번누른거 만큼 떨어짐(\t) + 엔터2번 (\n) \" ~ \"= ""따옴표 츌력
		System.out.println("안녕하세요 저의 '이름'은 ㅇㅇㅇ입니다"); //작은따옴표는 따로 안붙여도됨
		
		// (\\)=\출력 (\t)=탭	(\n)=줄바꿈 (\"~\")=따옴표 출력
		
		int e = 999;
		System.out.println("가나\\다\t라\n마바\"사\"");
		System.out.printf("e=%10d\n",e);
	}

}
