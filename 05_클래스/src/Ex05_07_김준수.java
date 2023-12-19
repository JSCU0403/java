import java.util.Scanner;

class Student{
	String name;
	int kor,eng,math,sum;
	double avg;
	
	int sum(int a,int b,int c) {//국영수 합계를 리턴하는 sum 매서드 정의
		return a+b+c;
	}
	
	double avg(int a,int b,int c) {//국영수 평균을 리턴하는 avg 매서드 정의
		//return (a+b+c)/3.0;
		return sum(a,b,c) / 3.0; //sum을 호출
	}

}  


public class Ex05_07_김준수 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.print("이름 입력 : ");
		std.name = sc.next();
		System.out.print("국어 입력 : ");
		std.kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		std.eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		std.math = sc.nextInt();
		System.out.println(std.name);//입력받은 4가지 값 모두 출력
		System.out.println(std.kor);//입력받은 4가지 값 모두 출력
		System.out.println(std.eng);//입력받은 4가지 값 모두 출력
		System.out.println(std.math);//입력받은 4가지 값 모두 출력
		
		System.out.println(std.sum(std.kor,std.eng,std.math));//합계
		System.out.printf("%.2f \n",std.avg(std.kor,std.eng,std.math));//평균 (소수 아래 2자리까지 출력)

	}

}
