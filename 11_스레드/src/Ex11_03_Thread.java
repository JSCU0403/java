class Big extends Thread {//Thread

	public void run() {
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" ");
			
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				
			}
		}

	}
}
class Small implements Runnable{

	public void run() {
		for(int i=97;i<=122;i++) {
			System.out.print((char)i+" ");
			
			try {
				Thread.sleep(100); //클래스이름으로 접근하는 static 메서드 1000=1초 100=0.1초
			}catch(InterruptedException e) {//InterruptedException 예외발생할수있어서 반드시 예외처리
				
			}
			
		}
	}//Runnable

}
public class Ex11_03_Thread {
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		Big b = new Big();
		b.start();
		
		Small s = new Small();
		Thread t = new Thread(s);
		t.start();
		
		System.out.println("프로그램 끝");


	}//main
}
