import java.util.Scanner;

class Person2{ //Person2타입 객체 3개 배열로 생성 
	private String id;
	private String password;
	private String name;

	public Person2(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId(){
		return id;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getName(){
		return name;
	}
	
}//Person2

public class Ex09_04_김준수 {
	public static void main(String[] args) {
		//id입력 pw입력  id가 3글자에서 8글자사이 갯수 입력 //계속하시겠습니까? n 할시 프로그램종료
		//이름 "님 반갑습니다"  출력 후 계속하시겠습니까? y id입력으로 돌아감
		//비밀번호가 틀리면 맞지않습니다 출력 id가 틀리면 일치하는 id가 없습니다.
		Person2 arr[] = {
				new Person2("kim","1234","김연아"),
				new Person2("son","7777","손흥민"),
				new Person2("jog","9876","조규성")
		};
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("id입력 : ");
			String inputId = sc.next();

			if(inputId.length()<3 || inputId.length()>8) {
				System.out.println("id는 3글자에서 8글자 사이를 입력해주세요");
				continue;
			}//if문

			int a=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i].getId().equals(inputId)==true) {
					System.out.print("pw입력 : ");
					String inputPw = sc.next();
					if(arr[i].getPassword().equals(inputPw)==true) {
						System.out.println(arr[i].getName()+"님 반갑습니다.");
					}//pw if문
					else{
						System.out.println("비밀번호가 맞지않습니다.");
					}//pw else문
				}//id if문
				else {
					a++;
				}//id else문
			}//for문

			if (a == arr.length) {
				System.out.println("일치하는 id가 없습니다.");
				continue;
			}

			System.out.print("계속? (y/n) : ");
			String continuance = sc.next();

			if(continuance.equalsIgnoreCase("y")) {
				continue;
			}
			if(continuance.equalsIgnoreCase("n")) {
				break;
			}
		}
		while(true);
		System.out.println("프로그램을 종료합니다.");
	}//main
}//Ex09_04
