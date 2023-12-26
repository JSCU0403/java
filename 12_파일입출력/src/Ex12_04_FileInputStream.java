import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex12_04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		File f = new File("c:\\sun\\abc.txt");
		
		FileInputStream fis = new FileInputStream(f);
		
		while(true) {
			int i = fis.read();//IOException
			
			if(i== -1)//읽을것이 없다는 상태 -1(파일의끝)
			break;
			
			System.out.println(i+":"+(char)i);
		}//while
		fis.close();
	}//main

}
//엔터 -> 아스키 코드 CR(Carriage Return) = 13 맨앞으로 가라 LF(LineFeed) = 10 줄고침