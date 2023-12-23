import java.util.ArrayList; //<E>가 포함되어있음
import java.util.Scanner;

public class Ex10_02_ArrayList {
	public static void main(String[] args) {

		ArrayList<String> s1 = new ArrayList<String>();//값을 넣을수록 공간이 늘어남
		int size = s1.size();
		System.out.println("size : "+size);
		s1.add("태연");
		s1.add("수영");
		s1.add("유리");//요소 삽입 (element)
		s1.add("수영");
		size = s1.size();
		s1.add(2,"써니"); //"써니"를 배열의 2번째에 삽입한다
		System.out.println("s1 size : "+size);
		System.out.println(s1.toString());//오버라이딩되어 주소가 아닌 배열 출력
		//[ , , , ] (요소)String의 toString()
		
		String g = s1.get(0);
		System.out.println(g);
		
		ArrayList<String> add = new ArrayList<String>();
		add.add("웬디");
		add.add("슬기");
		s1.addAll(add); //addAll(컬렉션)
		System.out.println(s1.toString());//오버라이딩되어 주소가 아닌 배열 출력
		
		size = s1.size();
		System.out.println("s1 size : "+size);//0번부터
		
		s1.remove("써니"); //= s1.remove(1)
		ArrayList<String> delete = new ArrayList<String>();
		delete.add("수영");
		s1.removeAll(delete);
		System.out.println(s1.toString());
		s1.add("웬디");
		System.out.println(s1.toString());
		
		int index1 = s1.indexOf("웬디");
		int index2 = s1.lastIndexOf("웬디");
		System.out.println(index1+","+index2);
		//-1이 나올떄 
		if(index1 == -1 ) {
			System.out.println("웬디가 없습니다");
		}
		boolean result = s1.contains("슬기");
		
		System.out.println("result : "+result);
		
		
		System.out.println("------------------");
		ArrayList<Integer> s2 = new ArrayList<Integer>();
		s2.add(100); //100=> new Integer(100)으로 바뀜
		s2.add(200);
		s2.add(300);
		System.out.println("s2 size : "+ s2.size());
		System.out.println(s2.toString());
		//Integer의 toString() [ , , , ] 오버라이딩되어있어서 Integer값을 리턴
		
		Integer g2 = s2.get(0);
		System.out.println(g2);
		
		s1.set(2,"윤아");
		System.out.println(s1.toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		ArrayList<String> s3 = new ArrayList<String>();
		s3.add(name);
		
		if(s1.indexOf(name) != -1) {
			System.out.println("가입한 회원입니다");
		}
		else {
			System.out.println("가입하지 않은 회원입니다.");
		}
		System.out.println("------------------------");
		int i;
		boolean flag = false;
		for(i=0;i<s1.size();i++) {
			if(s1.get(i).equals(name)){
				System.out.println("가입한 회원입니다");
				flag = true;
			}
		}//for
		if(flag == false) {
			System.out.println("가입하지 않은 회원입니다");
		}
		
		
		
		
	}

}
//List는 Interface 순서가 있고 데이터의 중복을 허용
//set은 순서가 없고 중복을 허용하지않는다

//Colletion-List-ArrayList 중요*****

//length : 배열의 길이(방의 갯수)
//length() : 문자열의 길이
//size : x
//size() : 컬렉션안의 요소의 갯수