import java.util.Scanner;

public class Ex03_04_ifelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력:");
		int num = sc.nextInt();
		System.out.println("입력한 숫자:"+num);
		
		if(num % 5 == 0 ) {
			System.out.println("5의 배수");
			
			if(num % 10 == 0) { //if문 안에 if문을 쓸수있다
				System.out.println("10의 배수"); //5의배수를 만족하고 10의배수를 만족해야 출력
			}
			else {
				System.out.println("10의 배수가 아님"); //첫번째 if문을 거친이후 두번째 if문이 거짓일경우 출력되는 코드
			}
		}
		else { //첫번째 if문이 참이 아닌경우 출력되는 코드
			System.out.println("5의 배수가 아님");
		}
		sc.close();
	}

}
