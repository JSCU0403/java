
public class Ex03_10_이중for {

	public static void main(String[] args) {

		int i,j;
		for(i=0;i<5;i++) { 
			for(j=0;j<=i;j++) { //i는 0 j=0이며 i보다작거나 같다 - 1번 참 - *
				//i는 1 j=0이며 i보다작거나 같다 - 2번 참 - ** ... i는 5 ..-*****
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for(i=0;i<5;i++) { 
			for(j=4;j>=i;j--) { 
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for(i=0;i<5;i++) { 
			for(j=4;j>i;j--) { //공백 반복 출력 
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		for(i=0;i<5;i++) { 
			for(j=4;j>i;j--) { //공백 반복 출력 
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}

