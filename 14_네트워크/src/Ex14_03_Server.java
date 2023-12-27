import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex14_03_Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5555);
		} catch (IOException e) {
			System.out.println("5555�� ��Ʈ��ȣ�� ����� �� �����ϴ�.");
			System.exit(1);
		}
		
		
		Socket clientSocket = null;
		
		try {
			System.out.println("Server ready..");
			clientSocket =  serverSocket.accept();
		} catch (IOException e) {
			System.out.println("accept ����");
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
		
		BufferedReader in = new BufferedReader(
								new InputStreamReader(
										clientSocket.getInputStream()));
		
		String inputLine = in.readLine();
		System.out.println("Ŭ���̾�Ʈ�� ������ ������:"+inputLine);
		
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
		
	}
}








