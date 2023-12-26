import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex12_09_InputStreamReader {

	public static void main(String[] args) {
		
		System.out.print("입력하세요 : ");
	
//		InputStream is = System.in; //키보드 입력을 바이트입력으로
//		
//		InputStreamReader isr = new InputStreamReader(is);//바이트입력을 문자입력으로 바꿔주는 메서드
//		
//		BufferedReader br = new BufferedReader(isr);//버퍼크기 미설정시 8192크기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//위 문장을 한줄로
		
		try {
			String str = br.readLine();//한줄읽기
			System.out.println(str);//공백을 포함하여 한줄읽기
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
//System.in - 키보드 입력