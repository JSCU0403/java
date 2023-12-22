import java.util.StringTokenizer;

public class Ex09_12_StringTokenizer {

	public static void main(String[] args) {

		StringTokenizer str = new StringTokenizer("20 23/01/1 2,16:01"," /,:");
		//앞의 문자열을 뒤의 구분자로 토큰몇개로 나뉘었는지 확인
		//구분자 부분에 아무것도 적혀있지않다면 공백이 구분자지만 적혀있다면 공백은 필수로 들어가있지않다
		int count = str.countTokens(); //토큰의갯수를 표현하는 메서드
		System.out.println("count: "+count);
		
		while(str.hasMoreTokens()) {//구분자로 끊어낼 토큰이 있는지 참거짓으로 호출
			String s = str.nextToken(); //문자열반환 토큰을 출력
			System.out.println(s); //while문으로 출력할 토큰이 없어질때까지 토큰단위로 출력
		}
		
		System.out.println();
		
		String str1 = "20 23/01/1 2,16:01";
		String[] arr = str1.split("/");//split은 구분자 하나밖에 못쓴다 String[]배열을 return한다
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]); //설정한 구분자를 기준으로 토큰을 기점으로 출력 반복
		}
		
	}//main

}
