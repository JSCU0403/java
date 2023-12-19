import java.util.Scanner;

public class Ex01_08_입력문 {

	public static void main(String[] args) {
     
	String name;
	int kor,eng,math;
	
	Scanner sc = new Scanner(System.in); //스캐너 sc 
	
	System.out.print("이름 입력 = >");
	name = sc.next(); //문자열 입력
	
	System.out.print("국어 점수 = >");
	kor = sc.nextInt(); //정수 입력
	
	System.out.print("영어 점수 = >");
	eng = sc.nextInt();
	
	System.out.print("수학 점수 = >");
	math = sc.nextInt();
	
	System.out.println("------------------");
	System.out.println("이름\t국어\t영어\t수학");
	System.out.println("---------------");
	System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math); //값 + "\t"+값+"\t"...
	System.out.println("------------------");
	
	int sum = kor+eng+math;
	float avg = (float) sum/3;
	
	System.out.println("총점: " + sum);
	System.out.printf("평균: %.2f\n", avg); 
	System.out.printf("-----------------");
	}

}
