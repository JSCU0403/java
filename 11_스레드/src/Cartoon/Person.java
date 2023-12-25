package Cartoon;

public class Person extends Thread {
	public Person(String name) {
		super(name);//Thread생성자 호출,오버라이딩 이전에는 Thread-숫자 할당
	}
	
	public void run() {
		
		try {
			String cartoon = Main.cshop.lendCartoon(); //lenCartoon을 호출한 쪽에서 처리해야되기때문에 try-catch로 처리
			System.out.println(getName()+":"+cartoon+"빌린다");
			System.out.println(getName()+":"+cartoon+"보는중..\n");
			
			sleep(3000);
			System.out.println(getName()+":"+cartoon+" 반납\n");
			Main.cshop.returnCartoon(cartoon);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}//run
}//Person
