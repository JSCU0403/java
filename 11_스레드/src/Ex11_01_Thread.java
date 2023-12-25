class Test1 implements Runnable{

	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.print(i+" ");
		}
	}
}

public class Ex11_01_Thread {
	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		Test1 t1 = new Test1();
		Thread th1 = new Thread(t1);
		//t1.run();
		th1.start(); //Thread클래스의 메서드 start() -> run이 실행됨
		
		System.out.println("프로그램 끝");
		
	}//main
}
