
public class Ex02_05_삼항 {

	public static void main(String[] args) {
		//이항연산자(연산자가 2개필요한 연산자) - + - * % / && || > == !=
		//단항연산자(연산자가 1개필요한 연산자) - ++ -- ! -3(음수)
		//삼항연산자(연산자가 3개필요한 연산자) - ( 조건식 ? 참 : 거짓 )
		
		int a=10, b=20;
		int result = a>b ? a : b; //조건식(a>b)가 참일경우 a를 거짓일경우 b를 출력한다
		System.out.println(result);
		
//		(짝수 홀수 판별법 = %2 했을때 나머지가 0이면 짝수로 판별)
		
		String str = a%2==0 ? "짝수" : "홀수";
		System.out.println("a는 홀짝여부 = "+str);
		
		
	}

}
