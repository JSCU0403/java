
public class Ex04_07_정렬 {

	public static void main(String[] args) {
		
		int[] arr = {8,3,5,2,9};
		
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//정렬하기
		
		//선택정렬
		
		int a=10,b=20,temp; //자리변경시에는 임시변수를 만들어서 사용해야한다.
		temp=b;
		b=a;
		a=temp;
		System.out.println("a값 : "+a);
		System.out.println("b값 : "+b);
		System.out.println("temp값 : "+temp);
		
	
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----------------");
		
		int[] arr1 = {7,5,3,8,4};
		
		int temp1;
		for(int j=0; j<arr1.length; j++) {
				for(int z=j+1; z<arr1.length; z++) {
					if(arr1[j] > arr1[z]) {
						temp1=arr1[j];
						arr1[j]=arr1[z];
						arr1[z]=temp1;
						
					}
					
				}
				System.out.print(arr1[j]+" ");
			}
		
		}
		
		
	}


