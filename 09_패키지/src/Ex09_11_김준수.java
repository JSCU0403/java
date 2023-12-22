import java.util.Scanner;

public class Ex09_11_김준수 {
	public static void main(String[] args) {
		//1~45사이의 정수난수 발생을 배열에 담는다 벗어나면 1~45사이 수를 입력하세요 o
		//똑같은 난수가 나오면 안됨(앞의 배열과 비교해서 같으면 배열에 넣지않고 다시 난수 발생)
		//숫자 6개를 입력 입력도중 중복숫자입력이라고 뜨고 다시입력받음
		//컴퓨터가 발생시킨 로또번호 출력
		//내가 입력한 로또번호 출력
		//변수전체를 비교해서 맞은게 있다면 count변수를 증가시켜서 맞은 갯수를 출력 
		//6개 1등 5개 2등 4개 3등 3개미만 꽝!

		int[] lotto = new int[6];//컴퓨터 배열
		int[] my = new int[6];//내가 입력해서 넣을 배열공간

		Scanner sc = new Scanner(System.in);
		int i,j,num,count=0;

		for(i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;//1~45
			for(j=0;j<i;j++) {
				if(lotto[i] == lotto[j]  ) {
					i--;
					break;
				}//lotto배열 비교 if문
			}//lotto배열 비교 for문
		}

		i=0;
		while(i<6) {
			System.out.print("숫자"+(i+1)+ ": ");
			my[i] = sc.nextInt();

			if(my[i]<1 || my[i]>45) {
				System.out.println("1~45 사이의 수를 입력하세요");
				continue;
			}//숫자 1 if문
			for(j=0;j<i;j++) {
				if(my[i] == my[j]) {
					System.out.println("중복됨");
					i--;
					break;
				}//중복if문
			}//중복for문
			i++;
		}//while문 숫자입력
		
		System.out.println("컴이 발생시킨 로또 번호");
		for(i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}//컴 로또번호 출력

		System.out.println();

		System.out.println("내가 입력한 로또번호");
		for(i=0;i<lotto.length;i++) {
			System.out.print(my[i]+" ");
		}//내 로또번호 출력
		
		count = 0;
		for(i=0;i<lotto.length;i++) {
			for(j=0;j<my.length;j++) {
				if(lotto[i] == my[j]) {
					count++;
				}
			}
		}//번호가 맞는게 있는지 확인
		System.out.println();
		
		System.out.println("맞은 갯수 : "+count);
		if(count == 6) {
			System.out.println("1등");
		}
		else if(count == 5) {
			System.out.println("2등");
		}
		else if(count == 4) {
			System.out.println("3등");
		}
		else if(count < 4) {
			System.out.println("꽝!");
		}


	}//main
}//클래스
