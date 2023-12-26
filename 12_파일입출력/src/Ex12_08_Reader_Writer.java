import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_08_Reader_Writer {

	public static void main(String[] args) {
		//FileOutputStream : File~

		int i;
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("write.txt");
			fw.write("재밌는 자바 수업!");
			//fw.close();

			fr = new FileReader("Write.txt");

			while(( i=fr.read()) != -1) {
				System.out.println((char)i);
			}
			//fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}


	}

}
