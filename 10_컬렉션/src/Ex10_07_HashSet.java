import java.util.HashSet;
import java.util.Iterator;

public class Ex10_07_HashSet {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.size());

		hs.add("수지");
		hs.add("웬디");
		hs.add("수지");
		hs.add("윤아");

		System.out.println(hs.size() ); //순서x 중복x
		System.out.println(hs.toString()); //[ , ] 오버라이딩 되잇는 toString
		//		System.out.println(hs.get(0)); 순서가없어서 0번 호출시 에러

		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {//관리대상여부를 참거짓으로 리턴
			System.out.print(iter.next()+" ");
		}


		System.out.println();

		hs.addAll(hs);//add가 안되므로 통째로 삽입
		boolean result = hs.contains("웬디"); //포함하고 있는지 참거짓
		System.out.println("result : "+result);

		// hs.clear(); //전부삭제
		hs.remove("윤아");//요소 삭제
		result = hs.isEmpty();
		System.out.println(result);
		System.out.println(hs);


	}//main

}
