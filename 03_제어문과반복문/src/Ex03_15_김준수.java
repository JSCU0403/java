
public class Ex03_15_김준수 {

	public static void main(String[] args) {

		int i,sum=0;

		for(i=1;i<=100;i++) { 
			sum += i; //덧셈의경우 0으로 초기화 곱셈의 경우는 1로 초기화
			if(i % 10 == 0) {
				System.out.println("1~"+i+"="+sum);				
			}
		}

		System.out.println();
		
		sum=0;
		
		for(i=1;i<=100;i++) {
			sum += i;
			if(i %10 == 1) {
				System.out.print(i+"~");
			}
			
			if(i %10 != 0) {
			continue;
			}
			System.out.println(i+"="+sum);
			sum=0;
		}
		
		/*sum=0;
		
		for(i=1;i<=100;i++) {
			sum += i;
			if(i %10 == 0) {
				System.out.println(i-9+"~"+i+"="+sum);
				sum=0
			}
					}

		*/
		
		
		
	}

}

