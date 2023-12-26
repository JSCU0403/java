import java.io.File;
import java.io.IOException;

public class Ex12_03_File {

	public static void main(String[] args) {
		
		File f1 = new File("A");
		//"C:\\Java_kjs\\12_파일입출력\\A"
		File f2 = new File("B");
		File f3 = new File("C");
		File f4 = new File(f1,"aa.txt");
		//"C:\\Java_kjs\\12_파일입출력\\A\\aa.txt"
		
		boolean result = f1.exists();//존재여부 메서드
		System.out.println("result : "+result);
		
		if(f1.exists()) {//f1의 존재여부
			f1.renameTo(f2); //f1을 f2로 이름변경
		}
		else {
			f1.mkdir();//없다면 f1 폴더생성
			System.out.println("폴더생성");
			
			try {
				f4.createNewFile();
				System.out.println("파일 생성함");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//else
	
		if(f3.exists()) { 
			f3.delete(); //폴더내부에 파일존재시 삭제불가
			System.out.println(f3.delete());
		}
	
	
	}
}
