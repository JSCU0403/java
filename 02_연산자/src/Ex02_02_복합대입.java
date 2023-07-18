
public class Ex02_02_복합대입 {

	public static void main(String[] args) {
		
		int a=10,b,c=30,d=40,e=50; //계산식은 다른변수를 만들어서 넣는 방식으로 진행
		System.out.println("a="+a);
		b=a+2;  // (=)  대입연산자
	    a += 3; // (+=)(-=)(*=)(/=)(%=) 복합대입연산자
		System.out.println(a);
		System.out.println(b);
		b -= 3;  
		System.out.println(b); 
		
		System.out.println(c);
		c *= 2;
		System.out.println(c);
		
		System.out.println(d);
		d /= 5;
		System.out.println(d);
		
		System.out.println(e);
		e %= 9;
		System.out.println(e);
		
		char ch1='a'; //소문자 a 아스키코드값 97
		System.out.println("ch1="+ch1);
//        ch1 = ch1+2;  //char(2byte)+int(4byte) 크기가 맞지않아서 오류
//		ch1 = (char)(ch1+2); //97+2 = 99  (int로 계산된 99의값을 char로 바꿔서 표시하는방법)
		ch1 += 2; //하지만 복합대입 연산자에서는 따로 설정해줄 필요가 없이 바로 계산될수있다.
		System.out.println("ch1="+ch1);
		
		String fruit = "apple";
		System.out.println("fruit="+fruit);
//		fruit = fruit + "banana";  =연속해서 입력하므로 기존값 바로 뒤에 붙는다
		fruit += "banana"; //위와같이 동일하지만 다른형식으로 입력가능
		System.out.println("fruit="+fruit);
	}

}
