import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12_05_FileInputStream {

	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		
		try {
			 fs = new FileInputStream("from.txt");
			 fos = new FileOutputStream("to.txt",true);//false,x :있으면 새로 생성/없으면 파일자동생성
			 //true : 파일이 있으면 내부 추가 / 파일이 없다면 파일 자동생성
			 
			 int a ;
			
			while(true) {
				a = fs.read();
				fos.write(a);
				if(a == -1) {
					break;
				}
				System.out.println((char)a);
			}
			
			
		} catch (Exception e) { //FileNotFoundException,IOException 전부 포함
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
