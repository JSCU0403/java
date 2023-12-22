import java.util.StringTokenizer;

public class Ex09_13_StringTokenizer {
	public static void main(String[] args) {

		StringTokenizer str = new StringTokenizer("3+2+7+9","+");
		
		int count = str.countTokens();
		System.out.println(count);
		
		int sum = 0;
		while(str.hasMoreTokens()) {//구분자로 끊어낼 토큰이 있는지 참거짓으로 호출
			String s = str.nextToken(); //문자열반환 토큰을 출력
			sum += Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
