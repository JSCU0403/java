import java.util.ArrayList;

public class Ex10_13 {
	public static void main(String[] args) {

		int[] arr = new int[1000000];
		int i ;
		
		long start = System.currentTimeMillis(); //long을 리턴하는 1970년1월1일부터 현재까지 걸린시간

		for(i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		long end = System.currentTimeMillis(); //long을 리턴하는 1970년1월1일부터 현재까지 걸린시간
		System.out.println("배열이 경과한 시간 : "+(end-start));
		
		start = System.currentTimeMillis(); //long을 리턴하는 1970년1월1일부터 현재까지 걸린시간
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(i=0;i<arr.length;i++) {
			arr2.add(i);
		}
		
		end = System.currentTimeMillis(); //long을 리턴하는 1970년1월1일부터 현재까지 걸린시간
		System.out.println("컬렉션이 경과한 시간 : "+(end-start));
		
		//배열이 arraylist보다 빠르다
		
		
		
		
		
		
		
		
		
	}//main
}
