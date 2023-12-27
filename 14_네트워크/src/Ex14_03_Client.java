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
			System.err.println("localhost�� ������ �� �����ϴ�.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("����� ����");
			System.exit(1);
		}
	
		user = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("���� �Է�:");
		String fromUser = user.readLine();
		System.out.println("Ŭ����Ʈ�� �Է��� ���� : " + fromUser);
		out.println(fromUser);
		
		out.close();
		in.close();
		socket.close();
		user.close();
	}
}







