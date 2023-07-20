import java.util.Scanner;

public class 연습용 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int [] scores = null; //참조변수(관리자) 주소를 담아야 하는데 아직 처리하기엔 힘들어서 아무것도업음
		int j,sum=0,max=0,min=0,avg=0;

		while(true) { 
			System.out.println("==================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("==================================");
			System.out.print("선택>");
			int selectNo = sc.nextInt();

			if(selectNo == 1) {
				System.out.print("학생수 > ");
				int stdNo = sc.nextInt();
				scores = new int [stdNo];
			}

			else if(selectNo == 2) {
				if(scores == null) { // 학생수를 입력하지않아서 배열은 null상태
					System.out.println("학생수를 먼저 입력하세요");
					continue; //for문-증감식 do~while-조건식으로 이동
				}
				for(int i=0;i<scores.length;i++){
					System.out.print("score["+i+"]=");
					scores [i] = sc.nextInt();
					
				}
			}
			
			else if(selectNo == 3) {
				if(scores == null) { // 학생수를 입력하지않아서 배열은 null상태
					System.out.println("학생수를 먼저 입력하세요");
					continue; //for문-증감식 do~while-조건식으로 이동
				}
				for(j=0;j<scores.length;j++) {
					System.out.println("scores["+j+"] : "+ scores[j] );
				}
			}
			
			else if(selectNo == 4) {
				if(scores == null) { // 학생수를 입력하지않아서 배열은 null상태
					System.out.println("학생수를 먼저 입력하세요");
					continue; //for문-증감식 do~while-조건식으로 이동
				}
				max = scores[0];
				for (int i=1;i<scores.length;i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				min = scores[1];
				for (int i=1;i<scores.length;i++) {
					if(min > scores[i]) {
						min = scores[i];
					}
				}
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
				}
				System.out.println("최고점수 : "+ max);
				System.out.println("최하점수 : "+ min);
				System.out.println("평균 : "+ sum/scores.length);
				
				for(int i=0 ; i<scores.length; i++) {
					for(int k=i+1; k<scores.length; k++) {
						if(scores[i]>scores[k]) {
							int temp=scores[i];
							scores[i]=scores[k];
							scores[k]=temp;
						}
					}
				}
				System.out.println("==========================");
				System.out.println("정렬한 결과");
				for (int i=0; i<scores.length;i++) {
					System.out.print(scores[i]+" ");
				}
				System.out.println();
				
				
			}
			
			else if(selectNo == 5) {
				System.out.println("1~5만 입력하세요");
				
			}

		}//while문
	}

}
