import java.util.Scanner;

public class Ex_05_12_김준수 {

	public static void main(String[] args) { //숫자 2개입력 숫자1의 숫자2승은 = n입니다 결과 n
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		System.out.println("result : "+exp(num1,num2));
		
		System.out.println(num1+"의 "+num2+"승은 "+exp(num1,num2)+"입니다.");
		
		System.out.println("------------------for문");
		int result=1; 
		for(int i=0 ; i<num2;i++) { //입력받은 num2만큼 반복
		 result *= num1; //result에 num을 누적시켜서 곱하기
		}
		
		System.out.println(num1+"의 "+num2+"승은 "+ result +"입니다.");
		
		
		
		
	}

	static int exp(int a, int b) {
			if(b == 0) {
				 return 1;
			}
			else
		    return a*exp(a,b-1);
			
	}
	
}



