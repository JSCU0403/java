import java.util.Scanner;

public class Ex03_06_switch_case {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과일의 이름은 ");
		String fruit = sc.next();
		System.out.println("과일의 이름은 "+fruit+" 입니다");
		
		//switch 조건문은 실수 double,float은 넣을수없다.
		
		switch(fruit) { //문자열도 조건으로 넣을수 있으며 case 다음 ""처리를 해주면된다.
		case "apple" : System.out.println("사과"); //출력할 코드를 적지 않으면 바로 밑 case문의 코드가 출력된다
		break;
		case "banana" : System.out.println("바나나");
		break;
		case "orange" : System.out.println("오렌지");
		break;
		default : System.out.println("그 밖의 과일");
		}
		
		
		
		
	}

}
