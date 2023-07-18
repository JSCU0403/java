import java.util.Scanner;

public class Ex02_01_산술연산자 {

	public static void main(String[] args) {
		
		int num1,num2; //4byte
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째값 : ");
		num1 = sc.nextInt();
		System.out.print("두번째값 : ");
		num2 = sc.nextInt(); 
		
		System.out.println(num1+"+"+num2+"="+(num1+num2));   //30+23=53
		System.out.println(num1+"-"+num2+"="+(num1-num2));   
		System.out.println(num1+"*"+num2+"="+(num1*num2));  
		System.out.println(num1+"/"+num2+"="+((float)num1/num2));   
		System.out.printf("%d/%d=%.2f\n",num1,num2,(float)num1/num2);      
		System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);   
		System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);   
		System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);   
		System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2); //나머지연산자 %d 뒤에 %를 붙이려면 %%로 표시한다
		
	}

}
