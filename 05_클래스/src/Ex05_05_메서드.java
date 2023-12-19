import java.util.Scanner;

class Calculator{ //메서드도 들어갈수있다
	
	int sum(int x, int y) {
		return x+y;
	}
	/*
	int sub(int x,int y) {
		return x-y;
	}
	*/
	static int sub(int x,int y) {
		return x-y;
	}
	
	static int max(int x,int y) { //return은 하나만 나온다
		if(x>y)
			return x;
		else 
			return y;
	}
	
}//Calculator
public class Ex05_05_메서드 {

	public static void main(String[] args) { //static메서드에서 호출되는 메서드는 static으로 만들어져있어야함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator(); //클래스 Calculator를 cal로 정의 - 객체를 만들고 참조변수를 사용
		int result = cal.sum(num1,num2); // sum 메서드 호출
		System.out.println("result : "+result);
		
		/*
		int result2 = cal.sub(num1,num2);
		System.out.println("result1 : "+result2);
		*/
		//int result1 = cal.sub(num1,num2);
		
		int result1 = Calculator.sub(num1, num2); //static변수의 경우 클래스 이름으로도 접근할수있다.
		System.out.println("result1 : "+result1);
		
		int Max = cal.max(num1, num2);
		System.out.println("최대값 : " +Max);
		
		sc.close();
	}

}
