import java.util.Scanner;

public class Ex03_03_김준수 {

	public static void main(String[] args) {
		
		String name;
		int kor,eng,math,result;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력=>");
		name=sc.next(); //문자열사이에 공백이있으면안됨
		System.out.print("국어 점수=>");
		kor=sc.nextInt();
		System.out.print("영어 점수=>");
		eng=sc.nextInt();
		System.out.print("수학 점수=>");
		math=sc.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("---------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math);
		System.out.println("---------------------------");
		result = kor+math+eng;
		avg = (double)result/3;
		System.out.println("총점: "+result);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("---------------------------");
		
		System.out.print("학점은 = ");
	
		if(avg>= 90 && avg<=100) {
			System.out.println("A학점");
		}
		else if(avg>=80 ) {
			System.out.println("B학점");
		}
		else if(avg>=70 ) {
			System.out.println("C학점");
		}
		else if(avg>=60 ) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
		
		System.out.println("--------------------------");
		
		System.out.print("switch문 학점은 = ");
		switch((int)avg/10) {
		case 10 : //구문을 쓰지않으면 바로 밑의 조건과 같은 내용이 실행된다
		case 9 : System.out.println("A학점");
		break;
		case 8 : System.out.println("B학점");
		break;
		case 7 : System.out.println("C학점");
		break;
		case 6 : System.out.println("D학점");
		break;
		default : System.out.println("F학점");
		}
		
	}

}
