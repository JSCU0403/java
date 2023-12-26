import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12_06_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("data.txt"); //1차 스트림
			bos = new BufferedOutputStream(fos,5); //2차 스트림은 파일이름 직접입력x 1차스트림만 가능
			//bos는 5의 크기를 가진 Buffer 임시저장소
			
			for(int i=1;i<9;i++) {//숫자0의 아스키코드값 48
				bos.write(i+48);//숫자1은 49
			}
			
			bos.flush();//버퍼에 남은 데이터 모두 출력
		} catch (FileNotFoundException e) {//파일이 없는경우 파일은 자동생성되지만 경로상 폴더가 없는경우 에러 출력
			e.printStackTrace();
		}catch (IOException e) {//파일이 없는경우 파일은 자동생성되지만 경로상 폴더가 없는경우 에러 출력
			e.printStackTrace();
		}
		finally {
			try {
				bos.close(); //버퍼를 닫는경우 내부에 남아있던 데이터 모두 출력 
				//1차스트림을 닫는경우 버퍼에 들어간 크기만큼만 출력
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally
		
	}

}
//파일과 직접연결되는 스트림 = 1차 스트림 / buffer = 2차 스트림
//Buffer 스트림으로부터 입출력속도를 향상시키기 위한 메모리 임시저장소
