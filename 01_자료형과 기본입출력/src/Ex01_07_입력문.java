import java.util.Scanner; //입력받는 유틸 Scanner sc = new Scanner(System.in);과 세트

public class Ex01_07_입력문 {
 public static void main(String[] args) {
	int a;
	int b;
//	a=10;
//	b=20;
	
	//입력 (System.in) 키보드 입력 
	//    (System.out) 콘솔창
	
	Scanner sc = new Scanner(System.in); // 스캐너 이름 ap = 키보드입력을 이 스캐너로 입력받기 
	System.out.print("a입력:"); //메세지 출력
	a = sc.nextInt();  //스캐너ap 키보드 정수입력
	
	System.out.print("b입력:"); //순서대로 정수a 입력을 받아야 "b입력:"이 출력됨
	b = sc.nextInt();   //스캐너ap 키보드 정수입력
	
	System.out.println(a+b);
	 
	String c;
	System.out.print("c입력:");
	c = sc.next(); //문자열은 next()
	System.out.print("c:"+ c);
	
	sc.close(); //스캐너 사용종료
 	}
}
