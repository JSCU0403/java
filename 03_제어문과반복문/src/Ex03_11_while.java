
public class Ex03_11_while {

	public static void main(String[] args) {

		int i;		
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println("for문 밖 :"+i);
		System.out.println();

		/*
		초기식;
		while(조건식) {
			반복문장1;
			반복문장2;
			증감식;
		}
		 */

		i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("while문 밖 :"+i);

		i=10;
		while(i>=2) {
			System.out.print(i+" ");
			i -= 2;
		}
		System.out.println("while문 밖 :"+i);

		/*
		 초기식;
		 do {
		    반복문장1;
		    반복문장2;
		    증감식;
		    }
		 while(조건식); //참인경우 do{} 내부문장출력
		 */

		i=1;
		do {
			System.out.print(i+" ");
			i++;
		}
		while(i<=5);
		
		System.out.println("do-while문 밖 :"+i);
		
		/*
		while문 : 선조건비교 반복문 (조건에 맞지않으면 미출력)
		초기식;
		while(조건식) {증감식}
		
		do-while문 : 후조건비교 반복문 (조건에 맞지 않아도 최소한번 문장출력)
		초기식;
		do{증감식}while(조건식)
		*/
	}

}
