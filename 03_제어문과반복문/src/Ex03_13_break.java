import java.util.Scanner;

public class Ex03_13_break {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		while(true) { //true:무조건참 - 무한으로 수를 입력하지만 음수가 입력될시에 중지
			System.out.print("수 입력: ");
			num = sc.nextInt();			
			if(num<0) {
				break;
			}
		}
		System.out.println("프로그램 끝");


		sc.close();

	}

}
