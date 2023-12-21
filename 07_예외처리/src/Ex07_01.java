
public class Ex07_01 {
	public static void main(String[] args) {

		String str = "banana";
		System.out.println(str);
		System.out.println(str.length()); //글자수
		
		int[] a = new int[5];
		
		String std = "apple"; 
		try {
			System.out.println(std);
			System.out.println(std.length()); //new NullPointerException()
			
			a[0]=10;
			a[4]=40;
			a[5]=50; //new ArrayIndexOutOfBoundsException()
			System.out.println(".");
			
			//NullPointerException e = new NullPointerException()
		}catch(NullPointerException e) {
			System.out.println("예외발생함");
			System.out.println(" e: "+ e);
		}
		////ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException()
		catch(ArrayIndexOutOfBoundsException i) {
			System.out.println("예외발생함2");
			System.out.println(" i: "+ i);
		}
		catch(Exception z) {//모든 에러 흡수 - 맨위로 위치변경시 모든에러흡수로 밑에 에러메세지는 처리되지않는다
			                //따라서 맨아래에 놓는다
		}
		finally { //생략가능
			System.out.println("finally 영역");
			System.out.println("여기는 무조건 처리됨");
		}
		
		System.out.println("예외처리");
	}//main

}
/*
try {
	예외발생가능성이 있는 구문 *가능성이 있으면 전부 넣어도된다 대신에 try자체는 한번만 사용가능
}catch(){ *catch 여러번 사용가능
발생된예외처리
}catch(){
}
finally{
예외 발생 여부에 관계없이 최종적으로 무조건 처리해야 하는 작업
}
*/