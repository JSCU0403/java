
public class Ex01_03_문자형 {

	public static void main(String[] args) {

		System.out.println(1);
		char ch;
		 //character (문자) 선언 2byte크기 음수x
		
//		ch = 'B'; //초기화       / char 변수에는 작은따옴표 '' 한글자만 가능
        ch = 66; //숫자를 넣어도 자료형 char에서는 아스키코드값에 해당하는 숫자를 넣으면 문자가 나온다	
		System.out.println(ch);
 		System.out.println(ch+1);  //A=65 B=66 C=67 a=97 b=98 아스키코드값 char(2)+int(4) 크기가 큰 int(4)로 출력
		System.out.println(ch-1); 
		System.out.println((char)(ch+1)); //출력값을 임시로 char로 설정해서 출력 
		System.out.println((char)67);
		System.out.println("ch=b입니다.");
		System.out.println("ch=" + ch +"입니다"); //'b' +1 > char(2바이트)+1
	}

}
