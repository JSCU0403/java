import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10_09_HashMap {
	public static void main(String[] args) {

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		//HashMap<키,값>
		
		System.out.println(map.size());
		map.put("아이유", 30);
		map.put("정국", 40);
		map.put("아이유", 20);//키값이 중복되어 하나만 출력하지만 나중에 입력된거 기준으로 출력
		map.put("이무진", 20);
		System.out.println(map.size());
		System.out.println(map.toString()); //데이터하나로 취급하여 키=값 으로 출력
		
		Integer v = map.get("이무진"); //get(키) -> 값(value)을 출력 / 없으면 null값 출력
		System.out.println(v);
		
		boolean result1 = map.containsKey("정국");//해당하는 key가 있는지 없는지 참,거짓 출력
		System.out.println(result1);
		boolean result2 = map.containsValue(40);//해당하는 vlaue가 있는지 없는지 참,거짓 출력
		System.out.println(result2);
		
		Set<String> s = map.keySet();//key값만 가져오기
		System.out.println(s);
		
		int i;
		
		for(i=0;i<s.size();i++) {
			System.out.println(map.get(s));
		}

		for(String key : s) { 
			System.out.println(key+":"+map.get(key));
			
		}
		
//		map.clear();
		Integer inte = map.remove("이무"); //일치하는 키를 찾은후 삭제 ->한덩어리라 키와 값 같이 삭제
		if(inte == null) {
			System.out.println("삭제실패");
		}
		else {
			System.out.println("삭제성공");
		}
		System.out.println(map); //성공시 value가 return / 실패시 null return
		
		
		
	}//main
}
//Map의 특징
//키와 값의 쌍으로 이루어진 데이터의 집합
//순서가 없다 키는 중복을 허용x 값은 중복을 허용