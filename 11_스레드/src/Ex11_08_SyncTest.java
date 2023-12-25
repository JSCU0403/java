class Data2{
	public int i;

}//Data

class AA2 extends Thread{
	public void run() {
		for(int i=0;i<100000;i++) {
			synchronized(Ex11_08_SyncTest.d) {//해당 블록이 통째로 임계영역으로 설정되어 락(Lock)에 걸린다.
				Ex11_08_SyncTest.d.i++; //지역변수 i가 아닌 Data클래스의 멤버변수 i를 증가시킨다
			}//다른 클래스에서 블록에 접근시 대기상태로 만든다
		}
		System.out.println("AA2 : "+Ex11_08_SyncTest.d.i);
	}
}//AA

class BB2 extends Thread{
	public void run() {
		for(int i=0;i<100000;i++) {
			synchronized(this) {//Ex11_08_SyncTest.d는 this로 대체가능
				Ex11_08_SyncTest.d.i++; 
			}
		}
		System.out.println("BB2 : "+Ex11_08_SyncTest.d.i);
	}
}//BB

public class Ex11_08_SyncTest {

	public static Data2 d = new Data2();

	public static void main(String[] args) {


		System.out.println("main 시작");

		AA2 t1 = new AA2();
		BB2 t2 = new BB2();
		t1.start();
		t2.start();

		System.out.println("main 끝");
	}//main

}
