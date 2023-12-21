
public class Ex07_05_throws {
	public static void main(String[] args) {

		int a = 7/0;
	}

	static void call() throws {}
	try{
		int a = 3/0;
	}
	catch(ArithmeticException e) {
		;
	}
	finally {

	}
}//call()
}
