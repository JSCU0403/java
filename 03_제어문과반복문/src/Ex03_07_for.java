import java.util.Scanner;

public class Ex03_07_for {

	public static void main(String[] args) {

		//for문 (초기식;조건식;증감식) { 반복문장1; 반복문장2; }
		System.out.println("자바");

		int i;
		for(i=1;i<=5 ;i++) { //초기식-조건식-{for문 코드출력}-증감식-조건식-{for문 코드출력}-증감식
			//....i=6  - 조건식불만족 - {for문}빠져나가기
			System.out.println("자바: "+ i);
		}

		for(i=5;i>=1 ;i--) {
			System.out.println("자바: "+ i);
		}


		System.out.println("for문 밖의 i값 = "+i);

		System.out.println("-------------------");

		for(i=1;i<=10;i++) {
			System.out.println(i);
		}

		System.out.println("-------------------");

		for(i=1;i<=5;i++) { //다른 방법 (i=2;i<=10;i+2) {syso(i)}
			System.out.println(2*i);
		}

		System.out.println("-------------------");

		for(i=1; i%2==0; i++) {
			System.out.println(i);
		}

		System.out.println("-------------------");

		System.out.println("-------------------");
		/*
		int sum = 0;
		sum=sum+1;
		sum=sum+2;
		sum=sum+3;
		sum=sum+4;
		sum=sum+5;
		sum=sum+6;
		sum=sum+7;
		sum=sum+8;
		sum=sum+9;
		sum=sum+10; // 다른코드 for(i=1;i<=10;i++){sum = sum+i} {sum += i}
				System.out.println(sum);
		 */
		System.out.println("-------------------");

		System.out.println();

		System.out.println("-------------------");		
		//1~100사이의 수 중 5의 배수이면서 동시에 7의배수

		for(i=1; i<=100; i++) { //1부터 100까지 반복하면서
			if(i%5==0 && i%7==0) { //5로 나누어서 나머지가 0이 되며 7로 나누어도 나머지가 0이 되는 수 일경우
				System.out.println("5와 7의 배수 : " + i); //그 숫자를 출력한다
			}
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("단입력 : ");
		int dan =sc.nextInt();
		System.out.println(dan+"단");   //구구단 

		for(i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}

	}



}
