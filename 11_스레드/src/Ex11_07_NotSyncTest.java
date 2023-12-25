class Data{
	public int i;
	
}//Data

class AA extends Thread{
	public void run() {
		for(int i=0;i<100000;i++) {
			Ex11_07_NotSyncTest.d.i++; //지역변수 i가 아닌 Data클래스의 멤버변수 i를 증가시킨다
		}
		System.out.println("AA : "+Ex11_07_NotSyncTest.d.i);
	}
}//AA

class BB extends Thread{
	public void run() {
		for(int i=0;i<100000;i++) {
			Ex11_07_NotSyncTest.d.i++; //공유자원을 사용하는 임계영역
		}
		System.out.println("BB : "+Ex11_07_NotSyncTest.d.i);
	}
}//BB

public class Ex11_07_NotSyncTest {
	
	public static Data d = new Data(); //공유자원
	
	public static void main(String[] args) {
		System.out.println("main 시작");
		
		AA t1 = new AA();
		BB t2 = new BB();
		t1.start();
		t2.start();
		
		System.out.println("main 끝");
	}

}
