
public class Ex04_05_김준수 {

	public static void main(String[] args) {

		int[][] score = { //정방형 배열
				{75,69,43},
				{78,95,30},
				{95,99,10},
				{45,60,70},
				{40,23,40}
		};

		int num,kor,eng,math,sum = 0;
		float avg;		

		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");
		for(int i=0 ; i<score.length; i++) {

			num=i+1;
			kor=score[i][0];
			eng=score[i][1];
			math=score[i][2];
			sum=kor+eng+math;
			avg =(float) sum/score [i].length;
			System.out.println(num+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t"+avg);
			sum=0;
		}

		System.out.println("===========================================");
		System.out.print("총점 : ");
		for(int i=0; i<score[i].length; i++) {
			for(int j=0; j<score.length; j++) {
				sum += score[j][i];
			}
			System.out.print(sum+" ");
			sum = 0;
		}

		/*
 		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===========================================");

		int [] totalSubject = new int [3];
		int i,j,sum=0;
		double avg=0;

		for(i=0; i<score.length; i++) { //행  --------
			System.out.print((i+1)+"\t");
			for(j=0;j<score[i].length;j++) {//열  IIIIIIIIIIIII
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				totalSubject [j] += score[i][j]; //각 과목의 점수의 총점을 합산
				//0 = 00 10 20 30 40 50 - 국어 점수의 총합
				//1 = 01 11 21 31 41 51 - 영어 점수의 총합
				//2 = 02 12 22 32 42 52 - 수학 점수의 총합
			}//내부for문
			System.out.print(sum+"\t");

			avg = (double)sum/score[i].length;
			System.out.print(avg);
			sum = 0;
			System.out.println();
		}//외부for문
		
		System.out.println("===========================================");
		System.out.print("총점 : \t");
		for(i=0 ; i<totalSubject.length;i++) {
			System.out.print(totalSubject[i]+"\t");
		}

		 */
	}

}
