
public class Ex03_14_김준수 {

	public static void main(String[] args) {

		int i,j;
		for(i=2;i<=9;i++) {
			
			for(j=1;j<=9;j++) {
				if(i %2 == 0 && j<=i) {
					System.out.println(i+"*"+j+"="+i*j+"  ");
				}
			}
			System.out.println();
		}

		//정석
		
		int a,b;
		for(a=2;a<=9;a++) {
			if(a % 2 != 0) {
				continue;
			}
			
			System.out.printf("%d단 출력\n",a);
			for(b=1;b<10;b++) {
				if(a<b) {
					break;
				}
				System.out.printf(a+"*"+b+"="+a*b+"\n");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

