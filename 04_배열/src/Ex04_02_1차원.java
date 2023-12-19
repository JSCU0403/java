
public class Ex04_02_1차원 {

	public static void main(String[] args) {

		int sum = 0; 
		for(int i=1;i<=10;i++) {

			sum += i;

		}
		System.out.println(sum);

		int[] jumsu = {79,88,91,33,100,55,95};
		//일반 for문 확장for문 사용

		sum = 0;
		
		for (int i=0; i<jumsu.length; i++) {
			System.out.print(jumsu[i]+ " ");
		}
		
		System.out.println();
		
		for (int x : jumsu) {
			System.out.print(x+" ");
		}

		System.out.println();
		//누적 일반 for 문 누적 확장 for 문
		for(int i=0; i<jumsu.length;i++) {
			System.out.print(jumsu[i]+" ");
			sum += jumsu[i];
		}
		System.out.println("합산 : "+sum);
		System.out.println("평균 : "+sum/jumsu.length); //평균은 배열의 길이로 나누면 평균
		
		sum=0;
		for(int x :  jumsu) {
			System.out.print(x+" ");
			sum += x;
		}
		System.out.println("합산 : "+sum);

		//int[] jumsu = {79,88,91,33,100,55,95}; 최대값 최소값 구하기
		int max;
		int min;
		
		max=jumsu[0];
		for (int z : jumsu) {
			if (max<=z) {
				max=z;
			}
		}
		
		min=jumsu[0];
		for (int z : jumsu) {
			if (min>=z) {
				min=z;
			}
		}
		System.out.println("가장큰값 : " + max);
		System.out.println("가장작은값 : "+ min);

	}

}
