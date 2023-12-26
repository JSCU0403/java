import java.io.File;

public class Ex12_02_File {

	public static void main(String[] args) {

		File win = new File("C:\\windows\\");
		System.out.println("win : " + win);//File은 toString이 오버라이딩되어있다
		boolean result1 = win.isDirectory();//참거짓 리턴
		System.out.println("result1 : "+ result1);
		
		String result2 = win.isDirectory() ? "폴더" : "파일" ;
		System.out.println("result2 : "+result2);
		//폴더인지 물어보는 메서드 참일때 폴더 출력 거짓일때 파일 출력
		
		result2 = win.isFile() ? "파일" : "폴더";
		System.out.println("result2 : "+result2);
		//파일인지 물어보는 메서드 참일때 파일 출력 거짓일떄 폴더 출력
		
		String[] lists = win.list();
		System.out.println(lists.length);
		
		for(int i=0;i<lists.length;i++) {
			File kind = new File(win,lists[i]);
			
			if(kind.isDirectory()) {
				System.out.println("폴더 : "+lists[i]);
			}
			else {
				System.out.println("파일 : "+lists[i]);
			}
		}
		
	}//main
}
//삼항연산자 조건식? 참:거짓