import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10_11_HashMap {
	public static void main(String[] args) {

		Map<String,String> words = new HashMap<String,String>();

		words.put("pencil", "연필");
		words.put("sky", "하늘");
		words.put("eraser", "지우개");
		words.put("apple", "사과");
		words.put("ruler", "자");

		Scanner sc = new Scanner(System.in);



		 do{
			System.out.print("찾는 단어는? (q입력시 종료) : ");
			String search = sc.next();
			search = search.toLowerCase(); //입력받은 문자를 전부 소문자로 바꾸어 삽입
			
			if(search.equals("q")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else if(words.get(search)==null) {
					System.out.println("잘못입력하셨음");
					continue;
				}
			
			else {
				System.out.println("뜻 : "+words.get(search));
			}
		}while(true);

	}
}
