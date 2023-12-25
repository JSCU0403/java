class DaemonTest extends Thread{
	public void run() {
		
		while(true) {
			try {
				sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace(); //예외발생경로 추적메서드 * 안써도 상관없음
			}
			if(Ex11_06_Daemon.autoSave) {//같다면 autosave
				autoSave();
			}
		}//while문
		
	}//run()
	
	public void autoSave() {
		System.out.println("작업파일이 자동 저장되었습니다");
	}
}//DaemonTest


public class Ex11_06_Daemon {
	
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		DaemonTest t = new DaemonTest();
		t.setDaemon(true);
		t.start();
		
		for(int i=0;i<=20;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);
			
			if(i == 5 ) {
				autoSave = true;
			}
		}//for문
		System.out.println("프로그램을 종료합니다");
	}//main
}
