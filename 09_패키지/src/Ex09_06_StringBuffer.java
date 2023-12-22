
public class Ex09_06_StringBuffer {
	public static void main(String[] args) {



		String str1 = "Have "; //100번지
		String str2 = "a "; //200번지
		String str3 = "nice day"; //300번지
		String str4 =str1+str2+str3; //400번지에 1,2,3삽입
		System.out.println("str4 : " + str4);
		str4 = str4.replace("nice","good"); //str4 nice를 good으로 바꾼것을 다시 str4에 삽입
		System.out.println("str4 : " + str4);//주소변경이 불가능하므로 500번지에 생성
		System.out.println();
		
		StringBuffer sb = new StringBuffer("Have "); //StringBuffer는 같은참조값에 추가하여 바꾸는 형식
		sb.append("a ");
		sb.append("nice day ");
		
		System.out.println("sb: "+sb); //100번지에 출력
		sb.replace(7, 11, "good"); //위치 7이상 11미만까지 good으로 변경
		System.out.println("sb: "+sb);//따로 삽입하지않아도 바뀌어있고 주소는 100번지 그대로
		
		sb.insert(7,"happy ");//7번째 자리에 happy 삽입
		System.out.println("sb: "+sb); //100번지 그대로
		
		sb.delete(7, 13); //7이상 13미만 삭제
		System.out.println("sb: "+sb);
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		String ss1 = sb1.toString(); //StringBuffer의 toString을 문자열로
		String ss2 = sb2.toString();
		
		System.out.println(s1.equals(s2)); //String의 equals는 문자열이 같은지 비교 =true
		System.out.println(sb1.equals(sb2));//Object의 equals사용으로 주소비교중 =false
		System.out.println(ss1.equals(ss2));//String equals를 사용하여 문자열비교 =true
	}

}
