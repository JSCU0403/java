import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Person implements Serializable{
	String name = "아이유";
	int age = 20;
}

public class Ex12_07_ObjectStream {

	public static void main(String[] args) {

		Person per = new Person();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fos = new FileOutputStream("objectfile.txt");
			oos = new ObjectOutputStream(fos);//2차스트림이라 파일직접 입력 불가 *1차스트림넣기
			oos.writeObject(per);
			oos.writeObject(new Date());
			
			fis = new FileInputStream("objectfile.txt");
			ois = new ObjectInputStream(fis);
			
			Person p = (Person) ois.readObject(); //다운캐스팅
			System.out.println(p.name);
			System.out.println(p.age);

			Date d = (Date) ois.readObject();
			System.out.println(d);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//finally

	}

}
