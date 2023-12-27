import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex14_03_Client {
	public static void main(String[] args) throws IOException {

		Socket socket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		BufferedReader user = null;
		
		try {
			socket = new Socket("localhost",5555);
			
			out = new PrintWriter(socket.getOutputStream());
			
			in = new BufferedReader(
									new InputStreamReader(
											socket.getInputStream()));
			
		} catch (UnknownHostException e) {
			System.err.println("localhost에 접근할 수 없습니다.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("입출력 오류");
			System.exit(1);
		}
	
		user = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("문자 입력:");
		String fromUser = user.readLine();
		System.out.println("클라이트가 입력한 문자 : " + fromUser);
		out.println(fromUser);
		
		out.close();
		in.close();
		socket.close();
		user.close();
	}
}







