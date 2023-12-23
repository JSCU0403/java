import java.util.ArrayList;
import java.util.Iterator;

class Person{
	private String id;
	private String pw;

	public Person(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String toString(){
		return id+"/"+pw;
	}

}
public class Ex10_03_ArrayList {

	public static void main(String[] args) {

		Person p1 = new Person("kim","1111");
		Person p2 = new Person("park","3333");
		Person p3 = new Person("choi","5555");

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.print(list); //Person클래스에서 toString이 오버라이딩 되어있지않아서 주소출력-오버라이딩후 정상출력
		System.out.println();
		int i;
		for(i=0;i<list.size();i++) {
			Person p = list.get(i);
			System.out.println(p);
		}
		System.out.println();
		
		Iterator <Person> iter = list.iterator();//import java.util.Iterator -반복할 리스트를 iter로 정의
		while(iter.hasNext()) { //반복할 대상이 있는지 확인
			Person p = iter.next(); //반복대상이 있다면 다음 실행 hasNext()-next는 세트
			System.out.println(p);
		}
		
	}
}
