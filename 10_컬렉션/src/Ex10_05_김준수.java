import java.util.ArrayList;
import java.util.Scanner;

class Card{
	private String name;
	private String tel;

	public Card(String name) {
		super();
		this.name = name;
	}
	public Card(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
}//Card

public class Ex10_05_김준수 {
	public static void main(String[] args) {

		int i,selectNum;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();

		while(true) {
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
			selectNum = sc.nextInt();

			if(selectNum == 1) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.print("전화번호를 입력하세요 : ");
				String tel = sc.next();

				Card input = new Card(name,tel);
				list.add(input); //입력한 이름과 전화번호를 input에 저장하고 배열 list에 넣기
				continue;
			}//1번선택

			else if(selectNum == 2) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				flag=false;
				for(i=0; i<list.size(); i++) {
					Card c = list.get(i);
					c.getName();
					if(c.getName().equals(name)){
						list.remove(c);
						System.out.println("삭제되었습니다.");
						flag=true;
					}//조건에 맞으면 배열삭제
				}//for문
				if(flag == false){
					System.out.println("이름을 잘못입력하셨습니다.");
				}//if문 이름잘못입력
			}//2번선택

			else if(selectNum == 3) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				flag=false;

				for(i=0; i<list.size(); i++) {
					Card c = list.get(i);
					c.getName();
					if(c.getName().equals(name)){
						System.out.print("수정하실 전화번호는 : ");
						String Tel = sc.next();
						c.setTel(Tel);
						System.out.println("수정되었습니다.");
						flag=true;
					}
				}//for문
				if(flag == false){
					System.out.println("이름을 잘못입력하셨습니다.");
				}//이름 잘못입력 if문
			}//3번선택

			else if(selectNum == 4) {
				System.out.println("이름\t전화번호");
				for ( Card c : list ) {
					System.out.print(c.getName()+"\t");
					System.out.println(c.getTel());
				}//리스트 이름과 전화번호 전부출력

			}//4번선택

			else if(selectNum == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}//5번선택

			else {
				System.out.println("잘못입력하셨습니다.");
			}//정해진 번호 외의 번호를 입력


		}//while문

	}//main
}//Ex10_05
/*1번선택시 이름을 입력하세요 
 전화번호를 입력하세요 -> 카드객체를 만들고 배열에 들어가기
4번 선택시 이름 전화번호 출력
5번 입력시 종료 다른 번호 입력시 잘못입력 출력
2번 선택시 이름만 입력해도 삭제됨  / 없는 이름 입력시 이름 잘못입력 출력

3번 선택시 이름 입력 하면 배열을 0부터 비교해서 일치하는게 있다면 전화번호수정/이름 잘못입력시 잘못입력출력
 */