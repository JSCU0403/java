
public class Ex05_08_배열넘기기 {

	public static void main(String[] args) {//String[] args- 문자열을 받기위한 매개변수

		int [] a = {3,4,5};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

		sub(a[0],a[1],a[2]);
		sub2(a); //배열의 주소가 넘어감
		System.out.println("---------------");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}//main

	static void sub(int x,int y,int z){ //static 메서드에서 호출시 static 정의
		System.out.println("sub 메서드 정의");
		System.out.println(x+","+y+","+z);
		return ;
	}
	static void sub2(int[] des){//정수배열의 주소가 복사됨 
		for(int i=0;i<des.length;i++) { //a가 아닌 des로 정의했으므로 des.length로 사용
			System.out.print(des[i]+" ");
		}
		des[1] = 999;
	}
	
}
