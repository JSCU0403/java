import java.util.Scanner;

public class Ex03_05_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		System.out.println("num : "+num);

		if(num==1) {  //컨트롤+I누르면 줄맞춤
			System.out.println("1입니다.");
		}
		else if(num==2) {
			System.out.println("2입니다.");
		}
		else if(num==3) {
			System.out.println("3입니다.");
		}
		else {
			System.out.println("1~3사이의 수가 아닙니다.");
		}
		System.out.println("-----------------------");
		
		switch(num) { //switch-case 문 안의 조건에 따라 해당하는 case로 이동하여 코드를 출력하고 해당 case 밑의 case까지 모두 출력한다
		case 1 : System.out.println("1입니다.");
		       break; //case 1에 해당하는 코드를 출력후에 switch문 밖으로 빠져나간다.
		case 2 : System.out.println("2입니다.");
		       break;
		case 3 : System.out.println("3입니다.");
		       break; 
		default : System.out.println("1~3사이의 수가 아닙니다."); //case에 해당하지않는 나머지 데이터를 받는 경우 default로 설정한 코드 출력
		       break;// 끝부분은 어차피 빠져나가기때문에 break문을 생략해도 된다.
		}
		
		System.out.println("switch~case 공부중..");
		
		sc.close();

	}

}
