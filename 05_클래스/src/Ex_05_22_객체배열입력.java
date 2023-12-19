import java.util.Scanner;

class Person3 {
	private String name;
	private int age;

	public Person3(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.print("이름 : "+name+"나이 : "+age);
		System.out.println();
	}
	/*
	public void toString() { //toString은 참조값.toString(); 호출시에 메소드를 안붙여도 호출된다.
		return name+","+age; //중간에 한글자라도 문자열이 섞여있다면 문자열취급
	}
	*/
}

public class Ex_05_22_객체배열입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person3[] arr = new Person3[3]; //for문 내부에 배열이 아닌 지역변수로 선언시 주소가
		                                //겹치거나 계속 덮어쓰기가 되어 인스턴스 배열로 주소를 배정시켜준다

		for(int i=0;i<3;i++) {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			
			arr[i] = new Person3(name,age); //arr배열에 이름과 나이를 저장
		}
		
		for(int i=0;i<arr.length;i++) { //0부터 arr배열의 길이만큼 값을 출력
			arr[i].display();
		}
		

		sc.close();
	}

}
