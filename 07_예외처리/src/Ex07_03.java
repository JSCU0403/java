//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.util.*; //.*: 이하 모두 포함

public class Ex07_03 {
	public static void main(String[] args) {
		//1~100사이의 정수 난수 발생 A~B : B-A +1
		int answer = (int)(Math.random()*100)+1;

		//17~85의 정수 난수 (85-17 +1 )+17
		int answer2 = (int)(Math.random()*69)+17;
		/*
		 * (B-A+1) + 시작하는수;
		 * 0 <= answer < 1: 실수 - 랜덤(Math.random()) 은 0과 1사이의 실수
		0*100 <= answer < 1*100
		(int)(0*100) <= answer < (int)(1*100)
		0 <= answer < 100 : 0+1~99+1=>1~100
		 */
		System.out.println("answer" + answer);
		System.out.println("17~85 : "+answer2);

		int input = 0; //0을 넣는 이유 - 값이 없는경우 answer와 비교시 초기값조차 안넣으면 뭘 출력 해야 되는지 모름
		int count = 0;
		do {
			System.out.print("1~100사이의 숫자를 입력 : ");
			Scanner sc = new Scanner(System.in);
			try{
				input = sc.nextInt(); //3=>3.4
				//new InputMismatchException ();
			}   //InputMismatchException e = new InputMismatchException
			catch(InputMismatchException e) {
				System.out.println("유효하지않는 값입니다 다시 입력하세요");
				continue;
			}
			if(answer > input) {
				System.out.println("더 큰수를 입력하세요"  );
				count++;
			}
			else if(answer < input) {
				System.out.println("더 작은수를 입력하세요");
				count++;
			}
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도한 횟수 : "+count);
				break;
			}
		}while(true);
		System.out.println("프로그램 종료");
	}

}
