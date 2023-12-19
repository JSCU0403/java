import java.util.Scanner;

public class Ex03_01_ifelse {
	public static void main(String[] args) {
	
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("a :");
		a = sc.nextInt();
		System.out.print("b :");
		b = sc.nextInt();
		System.out.println("a= "+a+", b= " + b);
		
		/*if(조건문 {
		   참일때만 실행되는 문장1;
		   참일때 실행되는 문장2;
	    }
	    //if문이 한줄일경우 중괄호를 생략가능
	    else{
	      조건문이 참이 아닐때 처리되는 문장1
	      조건문이 참이 아닐때 처리되는 문장2
	    }
	    
	    
		*/
		
		if(a>b) { //조건1
			System.out.println("a가 b보다 크다.");
		}
		else if(a<b) { //조건2
			//a<=b
			System.out.println("a가 b보다 작다.");
		}
		else {  //조건에 부합하지않는 나머지
			System.out.println("a와 b는 같다");
		}
		
		System.out.println("if문 공부중..."); //if문에 포함되지않는 일반 문장
		
		sc.close(); //키보드입력 닫기
		
		
		
	}

}
