import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Movie{
	private String title;
	private int age;
	
	public Movie(String title, int age) {
		super();
		this.title = title;
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return title+"/"+age;
	}
	
}//Movie

public class Ex10_10_HashMap {

	public static void main(String[] args) {

		Map<String,Movie> map = new HashMap<String,Movie>();
		Movie m1 = new Movie("아바타",12);
		Movie m2 = new Movie("압구정",15);
		Movie m3 = new Movie("공조",19);
		
		map.put("CGV", m1);
		map.put("롯데시네마", m2);
		map.put("서울극장", m3);
		
		System.out.println(map);
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 영화관 입력: ");
		String theater = sc.next();
		
//		Movie m = map.get(theater);
//		System.out.println("m : "+m);
		
		if(map.get(theater)==null) { //키에 해당하는 값이 없으면 null값 출력
			System.out.println("영화관 잘못 입력");
		}
		else {//해당하면 해당 키에 해당하는 값을 출력
			System.out.println(map.get(theater));
		}
		
		Movie m4 = new Movie("관상",12);
		map.replace("서울극장", m4); //"서울극장"에 해당하는 키의 값을 m4로 교체하라
		System.out.println(map);
		
		map.remove("CGV"); //아바타/12는 키와값으로 보이지만 사실 값 덩어리다 -> 키는 CGV
		System.out.println(map);
		
	}//main
}
