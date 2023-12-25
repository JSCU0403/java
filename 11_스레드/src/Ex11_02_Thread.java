class Test2 extends Thread{

	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.print(i+" ");
		}
	}

}//Test2

public class Ex11_02_Thread {
	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		Test2 t2 = new Test2();
		//t1.run();
		t2.start(); //Thread클래스의 메서드 start() -> 스레드 실행

		System.out.println("프로그램 끝");



	}//main
}
