
public class Ex07_04_throw {
	public static void main(String[] args) {
		try {
			call();
			System.out.println("정상적으로 처리되었습니다");			
		}catch (C e)	{
			System.out.println("처리중에러발생");
		
		}
		
	}//main

	static void call() throws {ArithmeticException}{
		try{
			int a = 3/0;
		}
		catch(ArithmeticException e) {
			System.out.println("call메서드 오류 : "+e);
			throw e;
		}
		finally {
			
		}
	}//call()
	
}//Ex07_04

//메서드가 몇개있더라도 main()이 제일 먼저 실행된다
