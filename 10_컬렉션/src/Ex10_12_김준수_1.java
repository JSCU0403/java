import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
	private String addr;
	private double height;
	private int kor;

	public Student(String addr, double height, int kor) {
		super();
		this.addr = addr;
		this.height = height;
		this.kor = kor;
	}

	public String toString() {
		return addr+"/"+height+"/"+kor;
	}
	
}

public class Ex10_12_김준수_1 {
	public static void main(String[] args) {

		HashMap<String,Student> inform = new HashMap<String,Student>();

		String yn;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("주소 : ");
			String ad = sc.next();
			
			System.out.print("키 : ");	
			double he = sc.nextDouble();
			
			System.out.print("국어 : ");	
			int ko = sc.nextInt();

			Student st1 = new Student(ad,he,ko);
			inform.put(name,st1);
			
			System.out.print("계속?");
			yn = sc.next();
			System.out.println();

			if(yn.equals("y")) {
				continue;
			}
			else if(yn.equals("n")) {
				System.out.println(inform);
				while(true){
					System.out.println();
					System.out.print("찾는 이름 : ");
					String fn = sc.next(); //fn=찾는이름
					
					if(inform.get(fn) == null) {
						System.out.println("찾는 이름 없음");
						System.out.print("계속?");
						yn = sc.next();
						if(yn.equals("n")) {
							break;
						}
						else if(yn.equals("y")) {
							continue;
						}
					}//if
					
					else {
						System.out.println(inform.get(fn));
						System.out.print("계속?");
						yn = sc.next();
						if(yn.equals("n")) {
							break;
						}
						else if(yn.equals("y")) {
							continue;
						}
					}//else
				}
			}//else if문

			while(true) {

				System.out.print("삭제할 이름 : ");
				String delname = sc.next();
				if(inform.get(delname) == null) {
					System.out.println("찾는 이름 없음");
					System.out.print("계속?");
					yn = sc.next();
					System.out.println();
					if(yn.equals("n")) {
						break;
					}
					else if(yn.equals("y")) {
						continue;
					}
				}
				else {
					inform.remove(delname);
					System.out.println(inform);
					System.out.print("계속?");
					yn = sc.next();
					System.out.println();
					if(yn.equals("n")) {
						break;
					}
					else if(yn.equals("y")) {
						continue;
					}
				}
			}

			System.out.print("프로그램을 종료합니다.");
			break;
		}
	}//main
}