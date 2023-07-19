
public class Ex03_08_이중for {

	public static void main(String[] args) {

		int i,j;
		for(i=1;i<=3;i++) { //이중for문은 외부for문 1번에 내부for문이 조건만큼 실행된후 내부 for문 종료시 외부로 돌아가 다시 조건을
                			//보고 내부for문을 실행한다  ex) i=1 j=5...6..7..8. - i=2 j=5..6..7..8.. - i=3 j=5...6..7..8
			for(j=5;j<=8;j++) { //i=1일때 내부for문 j=5-내부코드실행-j 1증가-j=6-내부코드실행...j=9 - i=2일때..
				System.out.println(i+","+j); 
			}
			System.out.println("------------------");
		}
		System.out.println("#####################");

		System.out.println("----");
		for(i=9;i>=5;i-=2) {
			for(j=3;j>=1;j--) {
				System.out.println(i+","+j);
			}
			System.out.println("----");
		}

		for(i=1;i<=9;i++) { //이중for문 외부for문 실행하러 진입시 내부for문이 실행되고 외부for문 상태를 ㄹ
			System.out.println("***"+i+"단***");
			for(j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j)); 
			}
		}
		
		
		for(i=1;i<=5;i--) { //무한루프가 걸릴수있다 무한루프는 콘솔창 정지버튼으로 정지가능
			System.out.println(i);
		}
		
	}

}
