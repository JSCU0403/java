class Data3{
	public int i;
	
	public synchronized void a() {
		for(int i=0;i<100000;i++) {
			this.i++;//멤버변수 i 증가
		}
		System.out.println("Data3 a() i : "+ i);
	}
	
	public synchronized void b() {
		for(int i=0;i<100000;i++) {
			this.i++;//멤버변수 i 증가
		}
		System.out.println("Data3 b() i : "+ i);
	}
}//Data3

class AA3 extends Thread{
	public void run() {
		Ex11_09_SyncTest.d.a(); //클래스.Data3.메서드();
	}
}//AA3

class BB3 extends Thread{
	public void run() {
		Ex11_09_SyncTest.d.b();
	}
}//BB3

public class Ex11_09_SyncTest {

	public static Data3 d = new Data3();
	
	public static void main(String[] args) {

		System.out.println("main 시작");

		AA3 t1 = new AA3();
		BB3 t2 = new BB3();
		t1.start();
		t2.start();

		System.out.println("main 끝");
		
		
		
	}//main

}
