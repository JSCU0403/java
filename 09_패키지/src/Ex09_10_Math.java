import static java.lang.Math.*; //사용시 Math. 생략가능 

public class Ex09_10_Math {
	public static void main(String[] args) {
		//Math클래스는 전부 static 형태
		
		//(Math.random()*큰수-작은수+1)+작은수
		int i = (int)(Math.random()*6)+3; //3~8 정수 난수발생
		System.out.println(i);
		//0*6<= i < 1*6 -> 0+3<= i <6+3
		
		int a = (int)(Math.random()*26)+65;//알파벳 대문자 출력 A=65 Z=90
		System.out.println((char)a);
		
		System.out.println(1);//java.lang.System 패키지의 PrintStream클래스의 println()메서드 오버로딩
		
		long m1 = Math.round(4.3); //반올림해서 4
		System.out.println(m1);
	
		m1 = Math.round(4.9); //반올림해서 5
		System.out.println(m1);
	
		double m2 = Math.ceil(4.3); //올림처리 5
		System.out.println(m2);
		
		m2 = Math.ceil(4.9); //올림처리 5
		System.out.println(m2);
		
		double m3 = Math.floor(4.9);
		System.out.println(m3);
		
		
	}

}
