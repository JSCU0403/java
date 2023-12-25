class Horizontal extends Thread{
	public void run() {
		for(int i=0; i<300;i++) {
			System.out.print("-");
			if(i%50 == 0)
				System.out.println();
		}
	}
}//Horizontal

class Vertical extends Thread{
	public void run() {
		for(int i=0; i<300;i++) {
			System.out.print("|");
			if(i%50 == 0)
				System.out.println();
		}
	}
}//Horizontal

public class Ex11_05_우선순위 {
	public static void main(String[] args) {
		
		
		System.out.println("프로그램시작");
		
		Horizontal h = new Horizontal();
		Vertical v = new Vertical();
		
		System.out.println(h.getName());
		System.out.println(v.getName());
		
		System.out.println(h.getPriority());//h의 우선순위를 출력
		System.out.println(v.getPriority());//v의 우선순위를 출력
		
		v.setPriority(7);//우선순위 올리기 *우선순위가 올라가도 반드시 우선순위가 올라간만큼 처리되지는 않는다
		h.start();
		v.start();
		System.out.println("프로그램끝");
		
	}//main
}
//1순위부터 10순위까지있는데 따로 설정해주지 않는다면 스레드의 우선순위는 5이다