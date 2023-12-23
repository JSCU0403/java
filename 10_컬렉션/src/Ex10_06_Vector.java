import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex10_06_Vector {
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		System.out.println(v.size());
		
		v.add("봄");
		v.add("여름");
		v.add("봄");
		v.add("겨울");
		
		System.out.println("v:"+v); //문자열이 [ ] 안으로 리턴 중복가능 arraylist랑 같음
		System.out.println(v.size());
		System.out.println(v.get(0));
		int i;
		
		System.out.println();
		
		for(i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println();
		
		Iterator <String> iter = v.iterator();
		while(iter.hasNext()) { 
			String s = iter.next();
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		Enumeration<String> en = v.elements();
		while(en.hasMoreElements()) {//관리대상여부를 참거짓으로 리턴
			String s = en.nextElement();
			System.out.print(s+" ");
		}
		
		
	}//main

}
