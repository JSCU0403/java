import java.util.HashSet;

public class Ex10_08_HashSet {

	public static void main(String[] args) {

		
		HashSet<Integer> hs = new HashSet<Integer>();
		//HashSet은 배열처럼 보이지만 List 인터페이스
		
		while(true) {
			
			hs.add((int)(Math.random()*10)+1);
		
			if(hs.size() == 5) { //중복되면 출력하지않기때문에 크기가 5개인 HashSet이 될때까지
				break;
			}
		}
		
		System.out.println(hs);
		
		Object[] arr = hs.toArray(); //배열로 바꿔주는 메서드
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		Integer[] arr2 = new Integer[hs.size()];
		hs.toArray(arr2);
		for(int i=0 ; i<arr2.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
