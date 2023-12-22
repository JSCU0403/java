
public class Ex09_05_String {
	public static void main(String[] args) {

		String str = "Slow And Steady Win The Race";
		char ch = str.charAt(5); //5번째 문자열에 위치한 문자출력
		System.out.println(str.charAt(5));

		int[] alpha = new int[26];//a~z의 갯수를 세는경우 배열을 만들어 해당 열의 크기를 늘린다

		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			System.out.print(ch+": "+(int)ch+" "); //공백은 32로 처리된다
			if(ch>='A' && ch<='Z') {
				alpha[ch-65]++;
			}
			if(ch>='a' && ch<='z') { //공백때문에 오류가 나므로 예외처리
			 alpha[ch-97]++;
			}
			
		}//for
		
		System.out.println();
		
		for(int i=0;i<alpha.length;i++) //배열은 length에 ()없음
		{
			System.out.println((char)(i+97)+" : "+alpha[i]); //a=97
		}

	}//main

}//Ex09_05