import java.util.Scanner;

public class Ex03_02_ifelse {

	public static void main(String[] args) {
		
		int num;
		System.out.print("숫자 입력 :");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.printf("num=%d\n",num);
		
		
		/*if(num==1 || num==2 || num==3 || num==4 || num==5 || num==6 || num==7 || num==8
				|| num==9 || num==10) { //1~10을 손수코딩 */
		if(num>=1 && num<=10) { //범위설정하여 if문 - 1보다 같거나 크고 10보다 작거나 같다 둘다 참이어야 하므로 and(&&)
		System.out.println("1~10사이의 수입니다.");	
		}
		
		else if(num>=11 && num<=20) {
			System.out.println("11~20사이의 수입니다.");
		}
		else if(num>=21 && num<=30) {
			System.out.println("21~30사이의 수입니다.");
		}
		//if문은 조건에서 따라 true/false로 나누어서 구별하고 내부 문장을 실행한다
		//else if는 if문이 참이 아닐경우에 else if까지 내려와서 실행할지 조건문을 보고 판단한다.
		//else if는 if문이 참일경우 else if까지 보지않고 결과를 내기때문에 코드가 길어질경우 속도가 빨라질수있다.
		
		
		//5의배수 10의배수
		
		if(num%5 == 0) {
			System.out.println(num+"은 5의 배수입니다");
		}
		
		if(num%10 == 0) {
			System.out.println(num+"은 10의 배수입니다");
		}
		
		System.out.println("if~else 공부중");
		sc.close();
		
	}

}
