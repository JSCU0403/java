import java.util.Scanner;

public class Ex07_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		
		boolean dap = divider(num1,num2);
	}

	public static boolean divider(int a,int b){
		int result = 0;
		try{
			 result = a/b; //5나누기 0 ArithmeticException
			 System.out.println("나눗셈결과 : "+ result);
			 return true;
		}
		catch(ArithmeticException e) { //조상클래스인 Exception e로 대체가능
			//ArithmeticException e = new ArithmeticException();
			System.out.println("오류 : "+e);
			return false;
		}
		finally{
			System.out.println("finally 영역"); //return되도 finally는 출력
		}
	}	
}
