
public class Ex03_12_break_continue {

	public static void main(String[] args) {

		int i;
		for (i=1;i<=10;i++){
			if(i>5) {
				break; //if문이 아닌 반복문을 빠져나가는 명령어
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		for (i=1;i<=10;i++){
			if(i==5) {
				continue; //반복문 내부에서 continue 아래 명령어는 출력하지않고 반복문을 벗어나지않는 범위내에서 다음조건식으로
			}
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		
		
		
	}

}
