
public class Ex09_03_String {
	public static void main(String[] args) {

		int a;
		double b;
		String c; //String은 클래스 == 자료형

		String s1 = "Have a nice day"; //s1 100번지
		//		String s1 =new String("Have a nice day"); new를 붙일때마다 새로운 참조값이 생성됨 
		String s2 = "Have a niCe day"; //s2 100번지
		//		String s2 =new String("Have a nice day"); s1과 참조값이 다르다
		String s3 = "hahaha"; //리터럴 표현법

		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);

		System.out.println(s1 == s2); 
		System.out.println(s1.length());
		int len = s1.length();
		System.out.println(len);

		boolean result1 = s1.equals(s2);
		System.out.println(result1);

		result1 = s1.equalsIgnoreCase(s2);//equalsIgnoreCase : 영어 대소문자 달라도됨
		System.out.println(result1);      //equals : 영어 대소문자까지 같아야함
		
		if(result1 == true) {
			System.out.println("두 문자열이 같음");
		}
		else {
			System.out.println("두 문자열이 같지않음");
			
		}
		
//		int result2 = s1.compareTo(s2); //C:아스키코드(대문자)67 c:아스키코드(소문자)99  차이=32 값 출력
		int result2 = s1.compareToIgnoreCase(s2); // 대소문자 구별x 
		System.out.println(result2); 
		if(result2 == 0) {
			System.out.println("두 문자열이 같음");
		}
		else {
			System.out.println("두 문자열이 같지않음");
		}
		System.out.println(s1.concat(s3));//concat = 문자열 s1에 s3를 연결하라
		System.out.println(s1+s3);
		
		int result3 = s1.indexOf("nice"); //indexOf = 위치를 찾는 메서드
//		Have a nice day 에서 nice가 시작되는 자리를 출력 / 시작은 0부터 /  없는 문자일시 -1출력
		System.out.println(result3);

		int result4 = s1.lastIndexOf('a'); //lastIndexOf = 위치를 뒤부터 찾는 메서드
//		Have a nice day 에서  a가 마지막에 나오는 자리를 출력 / 시작은 0부터 /  없는 문자일시 -1출력
		System.out.println(result4);
		
		System.out.println("------------------------");
		
		String result5 = s1.substring(3,9); //문자열 일부 가져올떄 쓰는 메서드
//		Have a nic /e/   /d /a/ y /
//		0123456789/10/11/12/13/14/                3<= substring <9 3이상 9미만
		System.out.println(result5);
		//e a ni  
		//345678
		String result6 = s1.substring(7); //문자열 일부 가져올떄 쓰는 메서드 시작숫자부터 끝까지
		System.out.println(result6);
		
		String result7 = s1.replace('a','x'); //'a'문자를 'x'문자로 교체
		System.out.println(result7);
		System.out.println("------------------------");
		
		result5 = s1.toString();//String 클래스의 toString
		System.out.println(result5);
		System.out.println(s1); //딱히 호출하지않아도 toString사용
		System.out.println(s1.toString());
		
		result5 = s1.toLowerCase(); //toLowerCase = 모든문자를 소문자로
		System.out.println(result5);
		result5 = s1.toUpperCase(); //toUpperCase = 모든문자를 대문자로
		System.out.println(result5);
		
		//contatins는 boolean타입으로 받음
		System.out.println(s1.contains("ce")); //s1이 "ce"를 포함하면 true 미포함시 false
		System.out.println(s1.contains("abc")); //s1이 "abc"를 미포함 false
		
		String s4 = "   abc   de    FG   ";
		System.out.println(s4);
		System.out.println(s4.length()); //공백포함 20자
		
		String s5 = s4.trim();//trim : 첫글자의 앞과 마지막글자뒤의 공백을 없애고 사이공백은 놔둔채 출력
		System.out.println(s5);
		System.out.println(s5.length());
		
		char ch = s1.charAt(2); //charAt 이 위치의 문자를 가져와라 <->indexof는 위치를 가져와라 (반대개념)
		System.out.println(ch);
		
		String fullName = "Hello.java"; //a.txt , picture.jpg
		String fileName; //Hello a picture
		String ext; //java txt jpg
		
		//.의 위치를 찾는 메서드 index of 
		//일부를 가져오는 메서드 subString
		System.out.println("--------------------------");
		int dot = fullName.indexOf(".");
		
		fileName = fullName.substring(0,dot); //변수를 이용
	    ext = fullName.substring(dot+1);
		System.out.println("파일명 : "+fileName);
		System.out.println("확장자 : "+ext);
		
		
	}
	
}
//Object의 equals는 String을 상속 -> Object의 equals는 주소 비교
//String클래스에서 equals는 재정의 되있다 -> 문자열 비교
//String클래스 boolean equals​(Object anObject)	 Compares this string to the specified object