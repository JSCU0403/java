class Robot{

}//Robot

class DanceRobot extends Robot{
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}//DanceRobot

class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}//SingRobot

class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}//DrawRobot

public class Ex06_11_다형성 {
	public static void main(String[] args) {
		/* 
		 Robot a = (Robot)new DanceRobot(); i=0
		 Robot b = (Robot)new SingRobot();
		 Robot c = (Robot)new DrawRobot();
		
		 */
		
		Robot[] arr = {
				new DanceRobot(),
				new SingRobot(),
				new DrawRobot()
		};
		
		for(int i=0; i<arr.length;i++) {
			action(arr[i]); //arr[0]=DanceRobot주소 
			                //arr[1]=SingRobot주소 
			                //arr[2]=DrawRobot주소
		}
		
	}//main

	public static void action(Robot r) {//업캐스팅 반복해서 3번호출
		//r.dance(); 부모가 가지고있지않아서 불가능 에러
		if(r instanceof DanceRobot) {//다운캐스팅
			DanceRobot dr = (DanceRobot)r; 
			dr.dance();
		}
		else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		else if(r instanceof DrawRobot) {
			DrawRobot dw = (DrawRobot)r;
			dw.draw();
		}
	}
}


