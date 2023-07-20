import java.util.Scanner;

public class Ex04_03_1차원 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int kor,eng,math;

		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();

		System.out.println();
		System.out.println("국어 점수 : "+ kor);
		System.out.println("영어 점수 : "+ eng);
		System.out.println("수학 점수 : "+ math);
		 */
		String [] subject = {"국어점수 : ","영어점수 : ","수학점수 : "};
		int [] score = new int[3]; //int 기본값 0이 들어가있는상태
		int i;
		for(i=0 ; i<score.length ; i++) {
			System.out.print(subject[i]);
			score[i] = sc.nextInt();
		}
		for ( i=0 ; i<score.length; i++) {
			System.out.print(subject[i]);
			System.out.println(score[i]);
		}


		sc.close();

	}

}
