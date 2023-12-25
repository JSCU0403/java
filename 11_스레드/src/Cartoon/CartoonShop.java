package Cartoon;

import java.util.Vector;

public class CartoonShop {

	Vector<String> v = new Vector<String>();

	public CartoonShop() {
		v.addElement("슬램덩크");//0
		v.addElement("명탐정코난");//1
		v.addElement("원피스");//2
	}

	public synchronized String lendCartoon() throws InterruptedException{// try-catch대신 사용가능 : 호출한쪽에서 처리하도록 던지기

		Thread t = Thread.currentThread();//제일 먼저 접근한 스레드의 정보 리턴
		if(v.size() == 0) {
			System.out.println(t.getName()+": 번호표 받음");
			wait(); //notify와 세트로 쓰이는 대기-복귀 수동제어 *예외처리 해야되서 throws나 try-catch 사용
			System.out.println(t.getName()+": 다음 순서");
		}
		String str = v.remove(v.size()-1);//맨 마지막 데이터 빌려주기 처음 size는 3 2번을 빌려줘야 하기때문에 -1해서 2
		return str;
	}//lenCartoon
	
	public synchronized void returnCartoon(String Cartoon) {//return과정이 동시에 되면 안되기때문에 동기화처리
		v.addElement(Cartoon);//빌렸던책 반환
		notify();//wait으로 멈춘상태 다시 복귀
	}//returnCartoon
}//CartoonShop
